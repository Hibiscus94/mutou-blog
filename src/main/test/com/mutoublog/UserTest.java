package com.mutoublog;

import com.mutoublog.dao.entity.MtUser;
import com.mutoublog.service.UserService;
import com.mutoublog.utils.CommonUtil;
import com.mutoublog.utils.DateUtil;
import com.mutoublog.utils.Md5Utils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/applicationContext.xml"})
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
        TransactionalTestExecutionListener.class})
public class UserTest {
    private Logger logger = Logger.getLogger(this.getClass().toString());
    @Autowired
    private UserService userService;

    @Test
    public void testGetUserById() {
        logger.info("userService.getUserById");
        MtUser mtUser = userService.getUserById(5);
        System.out.println(mtUser);
    }

    @Test
    public void testGetUsersByClause() {
//        logger.info("userService.getAllUser");
//        byte isValid = (byte)1;
//        System.out.println(isValid);
//        List<MtUser> users = userService.getUsersByClause(isValid);
//        System.out.println(users);
    }

    @Test
    public void testDateToString() {
        String str = DateUtil.dateToString(new Date(),"FULL");
        System.out.println(str);
        System.out.println(DateUtil.getTimeFormat("2017-06-26 15:49:32"));
    }

    @Test
    public void testSaveUser() {
        logger.info("userService.saveUser");
        String salt = CommonUtil.generateSalt((byte)10);
        MtUser mtUser = new MtUser();
        mtUser.setUsername("刘顺林");
        mtUser.setPassword(Md5Utils.MD5Encode(salt + "123456","UTF-8",false));
        mtUser.setSalt(salt);
        mtUser.setNickname("mutou11");
        mtUser.setHead("touxiang");
        mtUser.setStatus((byte)1);
        mtUser.setRole("admin");
        mtUser.setCreateTime(new Date());
        mtUser.setUpdateTime(new Date());
        int userId = userService.saveUser(mtUser);
        System.out.println(userId+"========");
    }

    @Test
    public void testUpdateUser() {
        logger.info("userService.updateUserById");
        MtUser mtUser = new MtUser();
        mtUser.setId(5);
        mtUser.setUsername("boss liu");
        int userId = userService.updateUserById(mtUser);
        System.out.println(userId+"========");
    }

    @Test
    public void testDeleteUser() {
        logger.info("userService.deleteUser");
        int userId = userService.deleteUser(16);
        System.out.println(userId+"========");
    }
}
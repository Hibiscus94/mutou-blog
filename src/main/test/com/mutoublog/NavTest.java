package com.mutoublog;

import com.mutoublog.dao.entity.MtNav;
import com.mutoublog.service.NavService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import java.util.List;


/**
 * com.mutoublog
 * Created by mutou on 2017/6/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/applicationContext.xml"})
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
        TransactionalTestExecutionListener.class})
public class NavTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private NavService navService;

    @Test
    public void testSaveNav() {
        logger.info("NavService.saveCategory");
        MtNav mtNav = new MtNav();
        mtNav.setName("首页");
        mtNav.setAlias("index");
        int navId = navService.saveNav(mtNav);
        System.out.println("navId is :" + navId);
    }

    @Test
    public void testGetNavInfo() {
        logger.info("NavService.getBackgroundsByClause");
        MtNav mtNav = new MtNav();
        mtNav.setAlias("index");
        mtNav = navService.getNavInfo(mtNav);
        System.out.println("mtNav :" + mtNav.toString());
    }

    @Test
    public void testGetAllNavInfo() {
        logger.info("NavService.getBackgroundByClause");
        MtNav mtNav = new MtNav();
        mtNav.setId((byte) 1);
        List<MtNav> mtNavs = navService.getAllNavInfo(mtNav);
        System.out.println("mtNavs :" + mtNavs.toString());
    }

    @Test
    public void testUpdateNav() {
        logger.info("NavService.updateBackground");
        MtNav mtNav = new MtNav();
        mtNav.setId((byte) 2);
        mtNav.setAlias("indexdsd");
        int affectCount = navService.updateNav(mtNav);
        System.out.println("affectCount :" + affectCount);
    }

    @Test
    public void testDeleteNav() {
        logger.info("NavService.deleteCagegoryById");
        Integer affectCount = navService.deleteNavById((byte) 2);
        System.out.println("affectCount :" + affectCount);
    }
}

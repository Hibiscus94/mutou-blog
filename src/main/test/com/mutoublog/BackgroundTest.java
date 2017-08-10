package com.mutoublog;

import com.github.pagehelper.Page;
import com.mutoublog.dao.entity.MtArticleCategory;
import com.mutoublog.dao.entity.MtBackground;
import com.mutoublog.service.BackgroundService;
import com.mutoublog.service.CategoryService;
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

import java.util.Date;
import java.util.List;


/**
 * com.mutoublog
 * Created by mutou on 2017/6/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/applicationContext.xml"})
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
        TransactionalTestExecutionListener.class})
public class BackgroundTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private BackgroundService backgroundService;

    @Test
    public void testSaveBackground() {
        logger.info("BackgroundService.saveCategory");
        MtBackground mtBackground = new MtBackground();
        mtBackground.setImg("http://otiyd2z4u.bkt.clouddn.com/zrJjQg2JprEt03gntGas.jpg");
        int backgroundId = backgroundService.saveBackground(mtBackground);
        System.out.println("backgroundId is :" + backgroundId);
    }

    @Test
    public void testGetBackgroundsByClause() {
        logger.info("BackgroundService.getBackgroundsByClause");
        MtBackground mtBackground = new MtBackground();
        //Page
        List<MtBackground> backgrounds = backgroundService.getBackgroundsByClause(mtBackground);
        System.out.println("backgrounds :" + backgrounds.toString());
    }

    @Test
    public void testGetBackgroundByClause() {
        logger.info("BackgroundService.getBackgroundByClause");
        String items = "";
        MtBackground mtBackground = new MtBackground();
        mtBackground.setId(2);

        mtBackground = backgroundService.getBackgroundByClause(items, mtBackground);
        System.out.println("background :" + mtBackground.toString());
    }

    @Test
    public void testUpdateBackground(){
        logger.info("BackgroundService.updateBackground");
        MtBackground mtBackground = new MtBackground();
        mtBackground.setImg("sdadada");
        mtBackground.setId(2);
        int affectCount = backgroundService.updateBackground(mtBackground);
        System.out.println("background :" + affectCount);
    }

    @Test
    public void testDeleteCategoryById() {
        logger.info("BackgroundService.deleteCagegoryById");
        Integer affectCount = backgroundService.deleteBackgroundById(2);
        System.out.println("delete id is :" + affectCount);
    }
}

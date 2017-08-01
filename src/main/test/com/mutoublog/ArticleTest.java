package com.mutoublog;

import com.mutoublog.dao.entity.MtArticle;
import com.mutoublog.service.ArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * com.mutoublog
 * Created by mutou on 2017/6/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/applicationContext.xml"})
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
        TransactionalTestExecutionListener.class})
public class ArticleTest {
    private Logger logger = Logger.getLogger(this.getClass().toString());
    @Autowired
    private ArticleService articleService;

    @Test
    public void testSaveArticle() {
        logger.info("userService.saveArticle");
        MtArticle mtArticle = new MtArticle();
        mtArticle.setTitle("article1");
        mtArticle.setContent("<p>dsdadasdjalkdjal</p>");
        mtArticle.setAuthor("liushunlin");

        int articleId = articleService.saveArticle(mtArticle);
        System.out.println("articleId is :" + articleId);
    }

    @Test
    public void testGetArticlesByClause() {
        logger.info("userService.getArticlesByClause");
        Map<String,Object> clauseMap = new HashMap<>();
        clauseMap.put("uid",1);

        List<MtArticle> articles = articleService.getArticlesByClause(clauseMap);
        System.out.println("articles :" + articles.toString());
    }
}

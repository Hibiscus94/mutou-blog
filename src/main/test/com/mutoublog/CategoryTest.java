package com.mutoublog;

import com.mutoublog.dao.entity.MtArticleCategory;
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
public class CategoryTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private CategoryService categoryService;

    @Test
    public void testSaveCategory() {
        logger.info("CategoryService.saveCategory");
        MtArticleCategory mtArticleCategory = new MtArticleCategory();
        mtArticleCategory.setName("分类1");
        mtArticleCategory.setParentId((byte) 0);
        mtArticleCategory.setLink("http://www.zbj.com");
        mtArticleCategory.setSort((byte) 0);
        mtArticleCategory.setStatus((byte) 1);
        mtArticleCategory.setCreateTime(new Date());
        mtArticleCategory.setUpdateTime(new Date());

        int categoryId = categoryService.saveCategory(mtArticleCategory);
        System.out.println("categoryId is :" + categoryId);
    }

    @Test
    public void testGetCategorysByClause() {
        logger.info("CategoryService.getCategorysByClause");
        String items = "id,name,parent_id";
        MtArticleCategory mtArticleCategory = new MtArticleCategory();
        mtArticleCategory.setStatus((byte) 1);
        List<MtArticleCategory> categorys = categoryService.getCategorysByClause(items, mtArticleCategory);
        System.out.println("articles :" + categorys.toString());
    }

    @Test
    public void testGetCategoryByClause() {
        logger.info("CategoryService.getCategoryByClause");
        String items = "";
        MtArticleCategory mtArticleCategory = new MtArticleCategory();
        mtArticleCategory.setId((byte) 1);

        mtArticleCategory = categoryService.getCategoryByClause(items, mtArticleCategory);
        System.out.println("article :" + mtArticleCategory.toString());
    }

    @Test
    public void testDeleteCategoryById() {
        logger.info("CategoryService.deleteCagegoryById");
        Integer cateId = categoryService.deleteCategoryById((byte) 1);
        System.out.println("delete id is :" + cateId);
    }
}

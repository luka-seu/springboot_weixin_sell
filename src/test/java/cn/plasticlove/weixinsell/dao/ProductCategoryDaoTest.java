package cn.plasticlove.weixinsell.dao;

import cn.plasticlove.weixinsell.entity.ProductCategoryEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDaoTest {
    @Autowired
    private ProductCategoryDao productCategoryDao;
    @Test
    public void getCategoryById() {
        ProductCategoryEntity category = productCategoryDao.getCategoryById(1);
        System.out.println(category);
    }
}
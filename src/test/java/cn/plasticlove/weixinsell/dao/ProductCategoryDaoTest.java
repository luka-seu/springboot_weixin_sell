package cn.plasticlove.weixinsell.dao;

import cn.plasticlove.weixinsell.entity.ProductCategoryEntity;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;


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

    @Test
    public void listProductCategoryInTypeList() {
        List<Integer> list = Arrays.asList(1,2,3,4);
        List<ProductCategoryEntity> categoryList = productCategoryDao.listProductCategoryInTypeList(list);
        for (ProductCategoryEntity productCategory:categoryList){
            System.out.println(productCategory);
        }
    }

    @Test
    public void saveProductCategory() {
        ProductCategoryEntity category = new ProductCategoryEntity("nanjing",3);
        productCategoryDao.saveProductCategory(category);

    }
}
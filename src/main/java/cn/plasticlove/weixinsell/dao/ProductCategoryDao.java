package cn.plasticlove.weixinsell.dao;

import cn.plasticlove.weixinsell.entity.ProductCategoryEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The interface Product category dao.
 *
 * @author Luka
 * @date 2019 /05/23
 */
@Mapper
public interface ProductCategoryDao {
    /**
     * Gets category by id.
     *
     * @param categoryId the category id
     * @return the category by id
     */
    ProductCategoryEntity getCategoryById(@Param("categoryId") int categoryId);

    /**
     * List product category by type list.
     *
     * @param typeList the type list
     * @return list list
     */
    List<ProductCategoryEntity> listProductCategoryInTypeList(@Param("typeList")List<Integer> typeList);

    /**
     * Save product category.
     *
     * @param productCategoryEntity the product category entity
     */
    void saveProductCategory(ProductCategoryEntity productCategoryEntity);

}

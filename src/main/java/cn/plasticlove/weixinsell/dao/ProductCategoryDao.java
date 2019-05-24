package cn.plasticlove.weixinsell.dao;

import cn.plasticlove.weixinsell.entity.ProductCategoryEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * The interface Product category dao.
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
}

package cn.plasticlove.weixinsell.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Luka
 * @date 2019/05/24
 */
@Data
public class ProductCategoryEntity {
    /**
     * category id
     */
    private Integer categoryId;
    /**
     * category name
     */
    private String categoryName;
    /**
     * category type
     */
    private Integer categoryType;

    /**
     * define for mybatis <selectKey></selectKey>
     */
    private Integer count;


    private Date createTime;
    private Date updateTime;

    public ProductCategoryEntity(String categoryName, int categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    public ProductCategoryEntity() {
    }
}

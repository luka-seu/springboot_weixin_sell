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
    private int categoryId;
    /**
     * category name
     */
    private String categoryName;
    /**
     * category type
     */
    private int categoryType;


    private Date createTime;
    private Date updateTime;
}

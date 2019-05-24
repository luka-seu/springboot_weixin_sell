package cn.plasticlove.weixinsell.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The type Product entity.
 *
 * @author Luka
 * @date 2019 /05/24
 */
@Data
public class ProductEntity {
    /**
     * product id
     */
    private String productId;
    /**
     * product name
     */
    private String productName;
    /**
     * produce price
     */
    private BigDecimal productPrice;
    /**
     * product amount
     */
    private int productStock;
    /**
     * product desc
     */
    private String productDescription;
    /**
     * product icon
     */
    private String productIcon;
    /**
     * product status
     */
    private int productStatus;
    /**
     * product category id
     */
    private int categoryType;
    private Date createTime;
    private Date updateTime;
}

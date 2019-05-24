package cn.plasticlove.weixinsell.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The type Order detail entity.
 *
 * @author Luka
 * @date 2019 /05/23
 */
@Data
public class OrderProductEntity {
    /**
     * order detail id
     */
    private String datailId;
    /**
     * order id
     */
    private String orderId;
    /**
     * product id
     */
    private String productId;
    /**
     * product name
     */
    private String productName;
    /**
     * product price
     */
    private BigDecimal productPrice;
    /**
     * product quantity
     */
    private Integer productQuantity;
    /**
     * product icon
     */
    private String productIcon;
    /**
     * create time
     */
    private Date createTime;
    /**
     * updateTime
     */
    private Date updateTime;
}

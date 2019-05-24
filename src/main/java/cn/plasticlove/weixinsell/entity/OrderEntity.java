package cn.plasticlove.weixinsell.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The type Order entity.
 */
@Data
public class OrderEntity {
    /**
     *  order ID
     */
    private String orderId;
    /**
     * buyer name
     */
    private String buyerName;
    /**
     * buyer phone number
     */
    private String buyerPhone;
    /**
     * buyer address
     */
    private String buyerAddress;
    /**
     * buyer weixin openid
     */
    private String buyerOpenid;
    /**
     * order amount
     */
    private BigDecimal orderAmount;
    /**
     * order status
     */
    private int orderStatus;
    /**
     * pay status
     */
    private int payStatus;


    private Date createTime;
    private Date updateTime;
}

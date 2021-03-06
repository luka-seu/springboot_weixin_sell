package cn.plasticlove.weixinsell.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The type Order detail entity.
 *
 * @author Luka
 * @date 2019 /05/30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.detail_id
     *
     *
     */
    private String detailId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.order_id
     *
     *
     */
    private String orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.product_id
     *
     *
     */
    private String productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.product_name
     *
     *
     */
    private String productName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.product_price
     *
     *
     */
    private BigDecimal productPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.product_quantity
     *
     *
     */
    private Integer productQuantity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.product_icon
     *
     *
     */
    private String productIcon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.create_time
     *
     *
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.update_time
     *
     *
     */
    private Date updateTime;



}
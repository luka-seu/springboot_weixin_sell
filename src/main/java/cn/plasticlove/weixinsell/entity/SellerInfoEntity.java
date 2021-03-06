package cn.plasticlove.weixinsell.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * The type Seller info entity.
 *
 * @author Luka
 * @date 2019 /05/30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SellerInfoEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_info.id
     *
     *
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_info.username
     *
     *
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_info.password
     *
     *
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_info.openid
     *
     *
     */
    private String openid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_info.create_time
     *
     *
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_info.update_time
     *
     *
     */
    private Date updateTime;

}
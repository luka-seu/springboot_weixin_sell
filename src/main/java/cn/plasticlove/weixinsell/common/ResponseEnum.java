package cn.plasticlove.weixinsell.common;

/**
 * The enum Response enum.
 *
 * @author Luka
 * @date 2019 /06/03
 */
public enum ResponseEnum {
    /**
     * Success response enum.
     */
    SUCCESS(200,"success"),
    /**
     * Bad request response enum.
     */
    BAD_REQUEST(400,"bad_request");




    private Integer res_code;
    private String res_msg;

    /**
     * Gets res code.
     *
     * @return the res code
     */
    public Integer getRes_code() {
        return res_code;
    }

    ResponseEnum(Integer res_code, String res_msg) {
        this.res_code = res_code;
        this.res_msg = res_msg;
    }

    /**
     * Gets res msg.
     *
     * @return the res msg
     */
    public String getRes_msg() {
        return res_msg;
    }

}

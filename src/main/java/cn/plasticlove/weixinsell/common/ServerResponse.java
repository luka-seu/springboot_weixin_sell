package cn.plasticlove.weixinsell.common;

/**
 * The type Server response.
 *
 * @param <T> the type parameter
 * @author Luka
 * @date 2019 /06/03
 */
public class ServerResponse<T> {
    /**
     * return code
     */
    private Integer code;
    /**
     * return msg
     */
    private String msg;
    /**
     * return data
     */
    private T data;

    private ServerResponse(int code){
        this.code = code;
    }

    private ServerResponse(int code,String msg){
        this.code = code;
        this.msg = msg;
    }
    private ServerResponse(int code,String msg,T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * Create response by success msg server response.
     *
     * @param msg the msg
     * @return the server response
     */
    public ServerResponse createResponseBySuccessMsg(String msg){
        return new ServerResponse(ResponseEnum.SUCCESS.getRes_code(),msg);
    }

    /**
     * Create response by success msg and data server response.
     *
     * @param msg  the msg
     * @param data the data
     * @return the server response
     */
    public ServerResponse createResponseBySuccessMsgAndData(String msg,T data){
        return new ServerResponse(ResponseEnum.SUCCESS.getRes_code(),msg,data);
    }

    /**
     * Create response by error msg and data server response.
     *
     * @param msg  the msg
     * @param data the data
     * @return the server response
     */
    public ServerResponse createResponseByErrorMsgAndData(String msg,T data){
        return new ServerResponse(ResponseEnum.BAD_REQUEST.getRes_code(),msg,data);
    }

    /**
     * Create response by error msg server response.
     *
     * @param msg the msg
     * @return the server response
     */
    public ServerResponse createResponseByErrorMsg(String msg){
        return new ServerResponse(ResponseEnum.BAD_REQUEST.getRes_code(),msg);
    }
}

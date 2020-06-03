package com.manyin.vhr.common.result;


import java.io.Serializable;

/**
 * 返回数据
 *
 * @author manyin
 */
public class ResultBean<T> implements Serializable {

    private int code;
    private String msg;
    private Object data;

    /**
     *  成功时候的调用
     * */
    public static  <T> ResultBean<T> success(SuccessMsg successMsg){
        return new ResultBean<T>(successMsg);
    }

    /**
     *  失败时候的调用
     * */
    public static  <T> ResultBean<T> error(CodeMsg codeMsg){
        return new ResultBean<T>(codeMsg);
    }

    private ResultBean(T data) {
        this.data = data;
    }

    private ResultBean(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private ResultBean(CodeMsg codeMsg) {
        if(codeMsg != null) {
            this.code = codeMsg.getCode();
            this.msg = codeMsg.getMsg();
            this.data = "发生异常，请查看异常信息";
        }
    }

    private ResultBean(SuccessMsg successMsg) {
        if(successMsg != null) {
            this.code = successMsg.getCode();
            this.msg = successMsg.getMsg();
            this.data=successMsg.getObject();
        }
    }


    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Object getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
}
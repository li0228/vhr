package com.manyin.vhr.common.result;

public class SuccessMsg {
    private int code;
    private String msg;
    private Object object;

    //返回值无参数返回的时候返回
    public static SuccessMsg SUCCESS = new SuccessMsg(200,"操作成功！","该方法无需返回值");
    //返回值中需要带参数返回
    public static SuccessMsg SUCCESS_WITH_RESULT(Object object){
        SuccessMsg successMsg = new SuccessMsg();
        successMsg.setCode(200);
        successMsg.setMsg("操作成功！");
        successMsg.setObject(object);
        return successMsg;
    }

    //构造方法
    public SuccessMsg() {}
    public SuccessMsg(int code, String msg,Object o) {
        this.code = code;
        this.msg = msg;
        this.object=o;
    }

    public int getCode() { return code; }
    public void setCode(int code) { this.code = code;}
    public String getMsg() {return msg; }
    public void setMsg(String msg) {this.msg = msg;}
    public Object getObject() { return object; }
    public void setObject(Object object) { this.object = object; }

    @Override
    public String toString() {
        return "{\"SuccessMsg\":{" + "\"code\":" + code + ",\"msg\":\"" + msg + '\"'+ ",\"object\":"+ object+ "}}";}
}

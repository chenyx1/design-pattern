package com.chenyx.design.constant.enums;
/**
 * @desc 返回信息常量
 * @author chenyx
 * @date 2019-03-02
 *
 * */
public enum ResultEnum {
    SUCCESS("200","1","成功"),//200代表成功
    FAIL("201","0","失败"),//200代表成功
    ERROR("500","2","系统异常");//500代表系统异常
    protected String respCode;//返回编码
    protected String respType;//返回类型
    protected String respDesc;//返回信息描述
    protected Object result;//返回结果

    ResultEnum(String respCode, String respType, String respDesc, Object result) {
        this.respCode = respCode;
        this.respType = respType;
        this.respDesc = respDesc;
        this.result = result;
    }

    ResultEnum(String respCode, String respType, String respDesc) {
        this.respCode = respCode;
        this.respType = respType;
        this.respDesc = respDesc;
    }

    ResultEnum(String respCode, String respType) {
        this.respCode = respCode;
        this.respType = respType;
    }

    public String getRespCode() {
        return respCode;
    }

    public String getRespType() {
        return respType;
    }

    public String getRespDesc() {
        return respDesc;
    }

    public Object getResult() {
        return result;
    }
}

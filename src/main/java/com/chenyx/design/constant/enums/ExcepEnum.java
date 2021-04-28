package com.chenyx.design.constant.enums;

/**
 * @desc 异常常量
 * @author chenyx
 * @date 2019-03-02
 *
 * */
public enum ExcepEnum {

    PARAM_EXCEP("excep-10001","参数异常"),
    REQUEST_DB_EXCEP("excep-10002","访问数据异常"),
    LOGIN_EXCEP("excep-10002","登陆异常"),;

    private String excepCode;//异常编码
    private String excepMag;//异常信息

    ExcepEnum(String excepCode, String excepMag) {
        this.excepCode = excepCode;
        this.excepMag = excepMag;
    }

    public String getExcepCode() {
        return excepCode;
    }

    public String getExcepMag() {
        return excepMag;
    }
}

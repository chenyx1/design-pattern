package com.chenyx.design.common.dto;

/**
 * @author ：chenyx
 * @description：返回结果处理DTO
 * @date ：2021/4/28 10:00
 */
public class ResultDTO<T extends ResponseDTO> {

    /**
     * @desc 返回结果编码
     * @auhtor chenyx
     * @date 2021-04-28
     * */
    private String code;


    /**
     * @desc 返回结果状态
     *@auhtor chenyx
     * @date 2021-04-28
     * */
    private String type;


    /**
     * @desc 返回信息描述
     * @author chenyx
     * @date 2021-04-28
     * */
    private String desc;

    /**
     * @desc 返回结果
     * @auhtor chenyx
     * @date 2021-04-28
     * */
    private T data;

    public ResultDTO() {
    }

    public ResultDTO(String code, String type, T data) {
        this.code = code;
        this.type = type;
        this.data = data;
    }

    public ResultDTO(String code, String type, String desc, T data) {
        this.code = code;
        this.type = type;
        this.desc = desc;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

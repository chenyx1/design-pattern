package com.chenyx.design.constant.enums;

/**
 * @author ：chenyx
 * @description：状态枚举
 * @date ：2021/4/28 14:23
 */
public enum StateEnum {

    INIT(1,"初始化状态"),END(100,"结束状态");

    /**
     * @desc 状态值
     * @auhtor chenyx
     * @date 2021-04-28
     */
    private Integer state;

    /**
     * @desc 状态描述
     * @auhtor chenyx
     * @date 2021-04-28
     */
    private String desc;


    StateEnum(Integer state, String desc) {
        this.state = state;
        this.desc = desc;
    }

    public Integer getState() {
        return state;
    }

    public String getDesc() {
        return desc;
    }}

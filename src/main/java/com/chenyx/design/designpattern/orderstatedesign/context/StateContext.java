package com.chenyx.design.designpattern.orderstatedesign.context;

import com.chenyx.design.common.co.RequestCO;

/**
 * @author ：chenyx
 * @description：状态上下文
 * @date ：2021/4/28 9:46
 */
public class StateContext<T extends RequestCO> {

    /**
     * @desc 状态
     * @auhtor chenyx
     * @date 2021-04-28
     * */
    private Integer state;


    /**
     * @desc 业务场景
     * @author chenyx
     * @date 2021-04-28
     * */
    private String bizId;

    /**
     * @desc 业务参数
     * @author chenxy
     * @date 2021-04-28
     * */
    private T param;


    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public T getParam() {
        return param;
    }

    public void setParam(T param) {
        this.param = param;
    }
}

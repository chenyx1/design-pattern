package com.chenyx.design.designpattern.orderstatedesign.param;

import com.chenyx.design.common.co.RequestCO;

/**
 * @author ：chenyx
 * @description：TODO
 * @date ：2021/4/28 15:10
 */
public class StateEndCO extends RequestCO {

    /**
     * @desc 状态
     *
     * */
    private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "StateEndCO{" +
                "type=" + type +
                '}';
    }
}

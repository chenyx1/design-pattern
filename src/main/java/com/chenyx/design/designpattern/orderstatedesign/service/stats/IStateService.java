package com.chenyx.design.designpattern.orderstatedesign.service.stats;

import com.chenyx.design.common.dto.ResultDTO;
import com.chenyx.design.designpattern.orderstatedesign.context.StateContext;

/**
 * @author ：chenyx
 * @description：状态接口
 * @date ：2021/4/28 9:56
 */
public interface IStateService {


    /**
     * @desc 业务执行方法
     * @auhtor chenyx
     * @date 2021-04-28
     * */
    ResultDTO doAction(StateContext stateContext) throws Exception;
}

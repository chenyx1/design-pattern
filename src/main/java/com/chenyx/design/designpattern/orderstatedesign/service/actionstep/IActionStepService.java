package com.chenyx.design.designpattern.orderstatedesign.service.actionstep;

import com.chenyx.design.common.co.RequestCO;
import com.chenyx.design.common.dto.ResponseDTO;
import com.chenyx.design.common.dto.ResultDTO;
import com.chenyx.design.designpattern.orderstatedesign.context.StateContext;

/**
 * @author ：chenyx
 * @description：执行步骤
 * @date ：2021/4/28 10:13
 */
public interface IActionStepService<R extends ResponseDTO, T extends RequestCO> {

    /**
     * @desc 准备数据
     * @auhtor chenyx
     * @date 2021-04-28
     */
    void prepare(StateContext<T> context);
    /**
     * @desc 校验
     * @author chenyx
     * @date 2021-04-28
     */
    ResultDTO<R> check(StateContext<T> context);

    /**
     * @desc 状态动作方法，主要状态迁移逻辑
     * @auhtor chenyx
     * @date 2021-04-28
     */
    ResultDTO<R> action(StateContext<T> context) throws Exception;

    /**
     * @desc 持久化后执行的前续处理
     * @auhtor chenyx
     * @date 2021-04-08
     *
     */
    void before(StateContext<T> context) throws Exception;

    /**
     *@desc  状态数据持久化
     * @auhtor chenyx
     * @date 2021-04-28
     */
    ResultDTO<R> save(StateContext<T> context) throws Exception;

    /**
     * @desc 状态迁移成功，持久化后执行的后续处理
     * @auhtor chenyx
     * @date 2021-04-08
     *
     */
    void after(StateContext<T> context) throws Exception;
}

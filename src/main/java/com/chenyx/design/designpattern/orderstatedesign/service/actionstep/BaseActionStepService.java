package com.chenyx.design.designpattern.orderstatedesign.service.actionstep;

import com.chenyx.design.common.co.RequestCO;
import com.chenyx.design.common.dto.ResponseDTO;
import com.chenyx.design.common.dto.ResultDTO;
import com.chenyx.design.designpattern.orderstatedesign.context.StateContext;
import com.chenyx.design.util.ResultUtil;

/**
 * @author ：chenyx
 * @description：执行步奏基本实现类
 * @date ：2021/4/28 10:30
 */
public abstract class BaseActionStepService<R extends ResponseDTO,T extends RequestCO> implements IActionStepService<R,T> {

    @Override
    public void prepare(StateContext<T> context) {

    }

    @Override
    public ResultDTO<R> check(StateContext<T> context) {
        return ResultUtil.success();
    }

    @Override
    public ResultDTO<R> action(StateContext<T> context) throws Exception {
        return ResultUtil.success();
    }

    @Override
    public void before(StateContext<T> context) throws Exception {

    }

    @Override
    public ResultDTO<R> save(StateContext<T> context) throws Exception {
        return ResultUtil.success();
    }

    @Override
    public void after(StateContext<T> context) throws Exception {

    }
}

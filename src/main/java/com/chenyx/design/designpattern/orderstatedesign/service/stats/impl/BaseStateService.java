package com.chenyx.design.designpattern.orderstatedesign.service.stats.impl;

import com.chenyx.design.common.co.RequestCO;
import com.chenyx.design.common.dto.ResponseDTO;
import com.chenyx.design.common.dto.ResultDTO;
import com.chenyx.design.constant.enums.ResultEnum;
import com.chenyx.design.designpattern.orderstatedesign.context.StateContext;
import com.chenyx.design.designpattern.orderstatedesign.service.actionstep.IActionStepService;
import com.chenyx.design.designpattern.orderstatedesign.service.stats.IStateService;
import com.chenyx.design.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ：chenyx
 * @description：状态基本实现类
 * @date ：2021/4/28 11:15
 */

public abstract class BaseStateService<R extends ResponseDTO,T extends RequestCO> implements IActionStepService<R,T>, IStateService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseStateService.class);


    @Override
    public ResultDTO doAction(StateContext stateContext) throws Exception {
        ResultDTO resultDTO = ResultUtil.fail();
        try {
            //封装参数
            this.prepare(stateContext);
            //业务校验
            resultDTO = this.check(stateContext);
            if (ResultEnum.SUCCESS.getRespCode() != resultDTO.getCode()) {
                return resultDTO;
            }
            //执行业务
            resultDTO = this.action(stateContext);
            if (ResultEnum.SUCCESS.getRespCode() != resultDTO.getCode()) {
                return resultDTO;
            }
            //前续操作
            this.before(stateContext);
            //持久化数据
            resultDTO = this.save(stateContext);
            if (ResultEnum.SUCCESS.getRespCode() != resultDTO.getCode()) {
                return resultDTO;
            }
            //后续操作
            this.after(stateContext);
        } catch (Exception e) {
            LOGGER.error("根据状态：{}，执行:{}业务异常：{}", stateContext.getState(), stateContext.getBizId(), e.getMessage());
            throw e;
        }
        return resultDTO;
    }

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

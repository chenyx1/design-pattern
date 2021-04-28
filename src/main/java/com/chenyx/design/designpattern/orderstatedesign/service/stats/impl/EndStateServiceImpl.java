package com.chenyx.design.designpattern.orderstatedesign.service.stats.impl;

import com.chenyx.design.common.co.RequestCO;
import com.chenyx.design.common.dto.ResultDTO;
import com.chenyx.design.designpattern.orderstatedesign.context.StateContext;
import com.chenyx.design.designpattern.orderstatedesign.param.StateEndCO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author ：chenyx
 * @description：结束状态实现类
 * @date ：2021/4/28 11:13
 */
@Service
public class EndStateServiceImpl extends BaseStateService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EndStateServiceImpl.class);
    @Override
    public void prepare(StateContext context) {
        LOGGER.info("EndStateServiceImpl---->prepare");
        StateEndCO requestCO = (StateEndCO) context.getParam();
        if (requestCO instanceof StateEndCO) {
            StateEndCO endCO = (StateEndCO) requestCO;
            LOGGER.info("EndStateServiceImpl---->prepare:requestCO:{}", endCO.toString());
        }

        super.prepare(context);
    }

    @Override
    public ResultDTO check(StateContext context) {
        LOGGER.info("EndStateServiceImpl---->check");
        return super.check(context);
    }

    @Override
    public ResultDTO action(StateContext context) throws Exception {
        LOGGER.info("EndStateServiceImpl---->action");
        return super.action(context);
    }

    @Override
    public void before(StateContext context) throws Exception {
        LOGGER.info("EndStateServiceImpl---->before");
        super.before(context);
    }

    @Override
    public ResultDTO save(StateContext context) throws Exception {
        LOGGER.info("EndStateServiceImpl---->save");
        return super.save(context);
    }

    @Override
    public void after(StateContext context) throws Exception {
        LOGGER.info("InitStateServiceImpl---->after");
        super.after(context);
    }
}

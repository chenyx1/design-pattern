package com.chenyx.design.designpattern.orderstatedesign.service.stats.impl;

import com.chenyx.design.common.dto.ResultDTO;
import com.chenyx.design.designpattern.orderstatedesign.context.StateContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author ：chenyx
 * @description：初始化状态实现类
 * @date ：2021/4/28 11:13
 */
@Service
public class InitStateServiceImpl extends BaseStateService {

    private static final Logger LOGGER = LoggerFactory.getLogger(InitStateServiceImpl.class);
    @Override
    public void prepare(StateContext context) {
        LOGGER.info("InitStateServiceImpl---->prepare");
        super.prepare(context);
    }

    @Override
    public ResultDTO check(StateContext context) {
        LOGGER.info("InitStateServiceImpl---->check");
        return super.check(context);
    }

    @Override
    public ResultDTO action(StateContext context) throws Exception {
        LOGGER.info("InitStateServiceImpl---->action");
        return super.action(context);
    }

    @Override
    public void before(StateContext context) throws Exception {
        LOGGER.info("InitStateServiceImpl---->before");
        super.before(context);
    }

    @Override
    public ResultDTO save(StateContext context) throws Exception {
        LOGGER.info("InitStateServiceImpl---->save");
        return super.save(context);
    }

    @Override
    public void after(StateContext context) throws Exception {
        LOGGER.info("InitStateServiceImpl---->after");
        super.after(context);
    }
}

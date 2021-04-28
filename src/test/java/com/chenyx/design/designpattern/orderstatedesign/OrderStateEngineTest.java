package com.chenyx.design.designpattern.orderstatedesign;

import com.chenyx.design.constant.enums.StateEnum;
import com.chenyx.design.designpattern.orderstatedesign.context.StateContext;
import com.chenyx.design.designpattern.orderstatedesign.factory.StateFactory;
import com.chenyx.design.designpattern.orderstatedesign.param.StateEndCO;
import com.chenyx.design.designpattern.orderstatedesign.service.stats.IStateService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ：chenyx
 * @description：订单状态模板引擎测试
 * @date ：2021/4/28 14:35
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderStateEngineTest {

    @Test
    public void testInitState()throws Exception {
        StateContext stateContext = new StateContext();
        stateContext.setState(StateEnum.INIT.getState());
        IStateService stateService = StateFactory.create(stateContext);
        stateService.doAction(stateContext);
    }

    @Test
    public void testEndState()throws Exception {
        StateContext stateContext = new StateContext();
        stateContext.setState(StateEnum.END.getState());
        StateEndCO stateEndCO = new StateEndCO();
        stateEndCO.setType(StateEnum.END.getState());
        stateContext.setParam(stateEndCO);
        IStateService stateService = StateFactory.create(stateContext);
        stateService.doAction(stateContext);
    }
}

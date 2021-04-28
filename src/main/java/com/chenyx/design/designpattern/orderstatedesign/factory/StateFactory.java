package com.chenyx.design.designpattern.orderstatedesign.factory;

import com.chenyx.design.constant.enums.StateEnum;
import com.chenyx.design.designpattern.orderstatedesign.context.StateContext;
import com.chenyx.design.designpattern.orderstatedesign.service.stats.IStateService;
import com.chenyx.design.util.ContextUtil;

/**
 * @author ：chenyx
 * @description：状态工厂
 * @date ：2021/4/28 11:35
 */
public class StateFactory {

    private StateFactory() {

    }

    /**
     * @desc 根据状态上下文创建状态业务实现类
     *       此处可以替换为基于事件实现
     * @auhtor chenyx
     * @date 2021-04-08
     */
    public static IStateService create(StateContext stateContext)throws Exception {

        IStateService stateService = null;
        try {
            //通过查询库表查询具体业务实现
            String clzzstr = findBizClazz(stateContext);
            Class clzz = Class.forName(clzzstr);
            stateService = (IStateService) ContextUtil.getContext().getBean(clzz);
        } catch (Exception e) {
            throw e;
        }
        return stateService;
    }

    /**
     * @desc 模拟查询库表
     * @auhto chenyx
     * @date 2021-04-28
     *
     * */
    private static String findBizClazz(StateContext stateContext) {
        String clzzstr = "";
        if (StateEnum.INIT.getState() == stateContext.getState()) {
            clzzstr = "com.chenyx.design.designpattern.orderstatedesign.service.stats.impl.InitStateServiceImpl";
        }
        if (StateEnum.END.getState() == stateContext.getState()) {
            clzzstr = "com.chenyx.design.designpattern.orderstatedesign.service.stats.impl.EndStateServiceImpl";
        }
        return clzzstr;
    }
}

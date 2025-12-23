package com.xiaoyudi.jc.dp.strategy;
import com.xiaoyudi.jc.dp.strategy.service.Strategy1Service;
import com.xiaoyudi.jc.dp.strategy.service.Strategy2Service;
import com.xiaoyudi.jc.dp.strategy.service.Strategy3Service;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * 策略处理器
 */
@Component
public class StrategyHandler {
    @Autowired
    private Strategy1Service strategy1;
    @Autowired
    private Strategy2Service strategy2;
    @Autowired
    private Strategy3Service strategy3;

    /**
     * 根据不同的策略类型执行不同的策略
     * @param strategy
     * @return
     */
    public Object getResult(String strategy){
        //策略映射
        Map<String, ObjectFactory<Object>> strategyHandlerMap = new HashMap<>();
        strategyHandlerMap.put("Type1", this::invokeStrategy1);
        strategyHandlerMap.put("Type2", this::invokeStrategy2);
        strategyHandlerMap.put("Type3", this::invokeStrategy3);
        //根据strategy获取对应的策略
        ObjectFactory<Object> factory = strategyHandlerMap.getOrDefault(strategy,this::defaultStrategy);
        return factory.getObject();
    }

    /**
     * 策略1调用
     * @return
     */
    private int invokeStrategy1(){
        return strategy1.getDiscountAmount();
    }

    /**
     * 策略2调用
     * @return
     */
    private int invokeStrategy2(){
        return strategy2.getReducedAmount();
    }

    /**
     * 策略3调用
     * @return
     */
    private int invokeStrategy3(){
        return strategy3.getRandomAmount();
    }

    private int defaultStrategy(){
        return 0;
    }
}

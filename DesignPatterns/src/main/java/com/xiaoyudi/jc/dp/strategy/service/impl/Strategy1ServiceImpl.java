package com.xiaoyudi.jc.dp.strategy.service.impl;

import com.xiaoyudi.jc.dp.strategy.service.Strategy1Service;
import com.xiaoyudi.jc.dp.strategy.service.Strategy2Service;
import org.springframework.stereotype.Component;

@Component
public class Strategy1ServiceImpl implements Strategy1Service {

    @Override
    public int getDiscountAmount(){
        return 1;
    }
}

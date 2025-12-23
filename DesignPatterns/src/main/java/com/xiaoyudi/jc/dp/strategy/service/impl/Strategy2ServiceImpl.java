package com.xiaoyudi.jc.dp.strategy.service.impl;

import com.xiaoyudi.jc.dp.strategy.service.Strategy2Service;
import org.springframework.stereotype.Component;

@Component
public class Strategy2ServiceImpl implements Strategy2Service {

    @Override
    public int getReducedAmount(){
        return 1;
    }
}

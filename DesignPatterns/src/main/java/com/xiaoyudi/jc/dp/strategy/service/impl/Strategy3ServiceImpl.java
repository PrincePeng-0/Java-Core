package com.xiaoyudi.jc.dp.strategy.service.impl;

import com.xiaoyudi.jc.dp.strategy.service.Strategy3Service;
import org.springframework.stereotype.Component;

@Component
public class Strategy3ServiceImpl implements Strategy3Service {

    @Override
    public int getRandomAmount(){
        return (int) (Math.random()*1000);
    }
}

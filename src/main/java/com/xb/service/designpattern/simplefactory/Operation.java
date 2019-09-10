package com.xb.service.designpattern.simplefactory;

import lombok.Data;

/**
 * @ClassName: Operation
 * @Description:
 * @Author: Coding_wxb
 * @Date 2019.09.10 17:27
 */
@Data
public abstract class Operation {
    private double numberA;
    private double numberB;

    public double calculate(){
        return 0.0;
    }
}

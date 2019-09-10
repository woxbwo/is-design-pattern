package com.xb.service.designpattern.simplefactory;

/**
 * @ClassName: OperationMultiplication
 * @Description:
 * @Author: Coding_wxb
 * @Date 2019.09.10 17:35
 */
public class OperationMultiplication extends Operation {
    @Override
    public double calculate() {
        return super.getNumberA() * super.getNumberB();
    }
}

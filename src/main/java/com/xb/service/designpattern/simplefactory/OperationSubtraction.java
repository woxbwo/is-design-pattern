package com.xb.service.designpattern.simplefactory;

/**
 * @ClassName: OperationSubtraction
 * @Description:
 * @Author: Coding_wxb
 * @Date 2019.09.10 17:36
 */
public class OperationSubtraction extends Operation {
    @Override
    public double calculate() {
        return super.getNumberA() - super.getNumberB();
    }
}

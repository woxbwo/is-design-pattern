package com.xb.service.designpattern.simplefactory;

/**
 * @ClassName: OperationAddition
 * @Description:
 * @Author: Coding_wxb
 * @Date 2019.09.10 17:28
 */
public class OperationAddition extends Operation{
    @Override
    public double calculate() {
        return super.getNumberA()+super.getNumberB();
    }
}

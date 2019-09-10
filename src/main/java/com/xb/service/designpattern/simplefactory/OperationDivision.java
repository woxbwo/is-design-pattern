package com.xb.service.designpattern.simplefactory;

/**
 * @ClassName: OperationDivision
 * @Description:
 * @Author: Coding_wxb
 * @Date 2019.09.10 17:33
 */
public class OperationDivision extends Operation {
    @Override
    public double calculate() {
        return super.getNumberA() / super.getNumberB();
    }
}

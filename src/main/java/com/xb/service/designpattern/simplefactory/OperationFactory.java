package com.xb.service.designpattern.simplefactory;

/**
 * @ClassName: OperationFactory
 * @Description:
 * @Author: Coding_wxb
 * @Date 2019.09.10 17:47
 */
public class OperationFactory {
    public static final String ADD = "+";
    public static final String SUB = "-";
    public static final String MUL = "*";
    public static final String DIV = "/";

    public static Operation createOpertion(String type){
        if(!ADD.equals(type)||!SUB.equals(type)||!MUL.equals(type)||!DIV.equals(type)){
            throw new IllegalArgumentException("参数不合法");
        }
        Operation operation = null;
        switch (type) {
            case ADD:
                operation = new OperationAddition();
                break;
            case SUB:
                operation = new OperationSubtraction();
                break;
            case MUL:
                operation = new OperationMultiplication();
                break;
            case DIV:
                operation = new OperationDivision();
                break;
            default:
        }
        return operation;
    }

}

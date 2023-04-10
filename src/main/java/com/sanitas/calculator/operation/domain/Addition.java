package com.sanitas.calculator.operation.domain;

public class Addition extends Operation{
    public Addition(double operand1, double operand2){
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = "+";
    }
    @Override
    public double execute(){
        return operand1 + operand2;
    }
}

package com.sanitas.calculator.operation.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
public class OperationResult {
    private double operand1;
    private double operand2;
    private double result;
    private String operation;

    public OperationResult(Operation operation){
        operand1 = operation.getOperand1();
        operand2 = operation.getOperand2();
        this.operation = operation.getOperation();
        result = operation.execute();
    }

    public String getStringResult(){
        return operand1 + " " + operation + " " + operand2 + " = " + result;
    }
}

package com.sanitas.calculator.operation.domain;

import lombok.Getter;

@Getter
public abstract class Operation implements BaseOperation{
    double operand1;
    double operand2;
    String operation;
}

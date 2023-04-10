package com.sanitas.calculator.operation.application.inputport;

import com.sanitas.calculator.operation.domain.OperationResult;

public interface AdditionInputPort {
    OperationResult calculateArithmeticAddition(double operand1, double operand2);
}

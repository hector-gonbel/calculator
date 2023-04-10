package com.sanitas.calculator.operation.application.inputport;

import com.sanitas.calculator.operation.domain.OperationResult;

public interface SubtractionInputPort {
    OperationResult calculateArithmeticSubtraction(double operand1, double operand2);
}

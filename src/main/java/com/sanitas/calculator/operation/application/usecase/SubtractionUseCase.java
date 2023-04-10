package com.sanitas.calculator.operation.application.usecase;

import com.sanitas.calculator.operation.application.inputport.SubtractionInputPort;
import com.sanitas.calculator.operation.domain.OperationResult;
import com.sanitas.calculator.operation.domain.Subtraction;
import org.springframework.stereotype.Component;

@Component
public class SubtractionUseCase implements SubtractionInputPort {
    @Override
    public OperationResult calculateArithmeticSubtraction(double operand1, double operand2) {
        OperationResult operationResult = new OperationResult(new Subtraction(operand1, operand2));
        return operationResult;
    }
}

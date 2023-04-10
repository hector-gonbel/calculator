package com.sanitas.calculator.operation.application.usecase;

import com.sanitas.calculator.operation.application.inputport.AdditionInputPort;
import com.sanitas.calculator.operation.domain.Addition;
import com.sanitas.calculator.operation.domain.OperationResult;
import org.springframework.stereotype.Component;

@Component
public class AdditionUseCase implements AdditionInputPort {
    @Override
    public OperationResult calculateArithmeticAddition(double operand1, double operand2) {
        OperationResult operationResult = new OperationResult(new Addition(operand1, operand2));
        return operationResult;
    }
}

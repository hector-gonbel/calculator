package com.sanitas.calculator.application.usecase;

import com.sanitas.calculator.operation.application.inputport.AdditionInputPort;
import com.sanitas.calculator.operation.application.usecase.AdditionUseCase;
import com.sanitas.calculator.operation.domain.Addition;
import com.sanitas.calculator.operation.domain.OperationResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class AdditionUseCaseTest {

    @Mock
    private Addition addition;

    @InjectMocks
    private AdditionUseCase additionUseCase;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCalculateArithmeticAddition() {
        double operand1 = 5.0;
        double operand2 = 10.0;
        double expectedResult = 15.0;

        when(addition.execute()).thenReturn(expectedResult);

        OperationResult operationResult = additionUseCase.calculateArithmeticAddition(operand1, operand2);

        assertEquals(operand1, operationResult.getOperand1());
        assertEquals(operand2, operationResult.getOperand2());
        assertEquals(expectedResult, operationResult.getResult());
        assertEquals("+", operationResult.getOperation());
        assertEquals(operand1 + " " + "+" + " " + operand2 + " = " + expectedResult, operationResult.getStringResult());
    }
}

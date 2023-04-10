package com.sanitas.calculator.application.usecase;

import com.sanitas.calculator.operation.application.usecase.SubtractionUseCase;
import com.sanitas.calculator.operation.domain.OperationResult;
import com.sanitas.calculator.operation.domain.Subtraction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class SubtractionUseCaseTest {

    @Mock
    private Subtraction subtraction;

    @InjectMocks
    private SubtractionUseCase subtractionUseCase;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCalculateArithmeticAddition() {
        double operand1 = 5.0;
        double operand2 = 10.0;
        double expectedResult = -5.0;

        when(subtraction.execute()).thenReturn(expectedResult);

        OperationResult operationResult = subtractionUseCase.calculateArithmeticSubtraction(operand1, operand2);

        assertEquals(operand1, operationResult.getOperand1());
        assertEquals(operand2, operationResult.getOperand2());
        assertEquals(expectedResult, operationResult.getResult());
        assertEquals("-", operationResult.getOperation());
        assertEquals(operand1 + " " + "-" + " " + operand2 + " = " + expectedResult, operationResult.getStringResult());
    }
}

package com.sanitas.calculator.operation.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OperationResultTest {
    @Test
    void testGetStringResult() {
        OperationResult operationResult = new OperationResult(new Addition(2.0, 3.0));
        String expectedStringResult = "2.0 + 3.0 = 5.0";
        Assertions.assertEquals(expectedStringResult, operationResult.getStringResult());
    }
}

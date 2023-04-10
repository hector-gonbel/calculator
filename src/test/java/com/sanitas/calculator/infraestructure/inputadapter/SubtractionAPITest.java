package com.sanitas.calculator.infraestructure.inputadapter;

import com.sanitas.calculator.operation.application.inputport.SubtractionInputPort;
import com.sanitas.calculator.operation.domain.OperationResult;
import com.sanitas.calculator.operation.domain.Subtraction;
import com.sanitas.calculator.operation.infrastructure.inputadapter.SubtractionAPI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ContextConfiguration
public class SubtractionAPITest {

    private MockMvc mockMvc;

    @Mock
    private SubtractionInputPort subtractionInputPort;

    @InjectMocks
    private SubtractionAPI subtractionAPI;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(subtractionAPI).build();
    }

    @Test
    public void calculateArithmeticAddition_Success() throws Exception {
        double operand1 = 5.0;
        double operand2 = 10.0;
        double expectedResult = -5.0;

        when(subtractionInputPort.calculateArithmeticSubtraction(anyDouble(), anyDouble())).thenReturn(new OperationResult(new Subtraction(operand1, operand2)));

        mockMvc.perform(get("/subtraction/arithmetic")
                        .param("operand1", String.valueOf(operand1))
                        .param("operand2", String.valueOf(operand2)))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"result\": -5.0}"));
    }
}

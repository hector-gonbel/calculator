package com.sanitas.calculator.infraestructure.inputadapter;
import com.sanitas.calculator.operation.application.inputport.AdditionInputPort;
import com.sanitas.calculator.operation.domain.Addition;
import com.sanitas.calculator.operation.domain.Operation;
import com.sanitas.calculator.operation.domain.OperationResult;
import com.sanitas.calculator.operation.infrastructure.inputadapter.AdditionAPI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@ContextConfiguration
public class AdditionAPITest {

    private MockMvc mockMvc;

    @Mock
    private AdditionInputPort additionInputPort;

    @InjectMocks
    private AdditionAPI additionAPI;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(additionAPI).build();
    }

    @Test
    public void calculateArithmeticAddition_Success() throws Exception {
        double operand1 = 5.0;
        double operand2 = 10.0;
        double expectedResult = 15.0;

        when(additionInputPort.calculateArithmeticAddition(anyDouble(), anyDouble())).thenReturn(new OperationResult(new Addition(operand1, operand2)));

        mockMvc.perform(get("/addition/arithmetic")
                        .param("operand1", String.valueOf(operand1))
                        .param("operand2", String.valueOf(operand2)))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"result\": 15.0}"));
    }
}

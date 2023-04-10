package com.sanitas.calculator.operation.infrastructure.inputadapter;

import com.sanitas.calculator.operation.application.inputport.AdditionInputPort;
import com.sanitas.calculator.operation.domain.OperationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "addition")
public class AdditionAPI {
    @Autowired
    AdditionInputPort additionInputPort;

    @GetMapping("/arithmetic")
    public OperationResult calculateArithmeticAddition(@RequestParam("operand1") double operand1,
                                                       @RequestParam("operand2") double operand2){
        return additionInputPort.calculateArithmeticAddition(operand1, operand2);
    }

}

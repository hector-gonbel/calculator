package com.sanitas.calculator.operation.infrastructure.outputadapter;

import io.corp.calculator.TracerImpl;
import com.sanitas.calculator.operation.application.outputport.LoggingOutputPort;
import org.springframework.stereotype.Component;

@Component
public class LoggingAdapter implements LoggingOutputPort {
    @Override
    public void loggin(String msg) {
        new TracerImpl().trace(msg);
    }
}

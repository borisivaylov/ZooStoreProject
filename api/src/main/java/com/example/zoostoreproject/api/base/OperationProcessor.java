package com.example.zoostoreproject.api.base;

public interface OperationProcessor<I extends OperationInput, T extends  OperationResult>{

    T process(I operationInput);
}

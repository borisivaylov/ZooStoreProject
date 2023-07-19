package com.example.zoostoreproject.API.Operations.base;

public interface OperationProcessor<I extends OperationInput, T extends  OperationResult>{

    T process(I operationInput);
}

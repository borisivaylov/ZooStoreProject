package com.example.zoostoreproject.api.base;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OperationPageProcessor  <I extends OperationInput, T extends OperationResult>{
    Page<T> process(I operationInput, Pageable pageable) throws Exception;
}

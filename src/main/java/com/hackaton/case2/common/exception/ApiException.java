package com.hackaton.case2.common.exception;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ApiException extends RuntimeException {
    private final String type;
    private final String reason;
    private final Integer code;
}

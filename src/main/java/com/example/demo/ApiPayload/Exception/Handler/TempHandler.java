package com.example.demo.ApiPayload.Exception.Handler;

import com.example.demo.ApiPayload.Code.BaseErrorCode;
import com.example.demo.ApiPayload.Exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
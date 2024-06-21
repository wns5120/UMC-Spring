package com.example.demo.Service.TempService;

import com.example.demo.ApiPayload.Code.Status.ErrorStatus;
import com.example.demo.ApiPayload.Exception.Handler.TempHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TempQueryServiceImpl implements TempQueryService{

    @Override
    public void CheckFlag(Integer flag) {
        if (flag == 1)
            throw new TempHandler(ErrorStatus.TEMP_EXCEPTION);
    }
}

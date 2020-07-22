package com.echo.zim.common;

import com.echo.zim.dto.ResultDto;
import com.echo.zim.util.ErrorCodeConst;
import org.springframework.util.StringUtils;

public class ResultGenerator {

    public static ResultDto generateResultMsg(String errorCode, String errorMsg, Object data) {
        return new ResultDto(errorCode, errorMsg, data);
    }
}

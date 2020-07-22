package com.echo.zim.common;

import com.echo.zim.dto.ResultDto;
import com.echo.zim.util.ErrorCodeConst;
import org.springframework.util.StringUtils;

public class BaseController {
    public static ResultDto error(String errorCode, String errorMsg) {
        return ResultGenerator.generateResultMsg(errorCode, errorMsg, null);
    }

    public static ResultDto error(String errorCode) {
        String errMsg = ErrorCodeConst.ERROR_CODE_MAP.get(errorCode);
        errMsg = StringUtils.isEmpty(errMsg) ? ErrorCodeConst.CODE_ERROR_SERVER_MSG : errMsg;
        return ResultGenerator.generateResultMsg(errorCode, errMsg, null);
    }

    public static ResultDto success() {
        return ResultGenerator.generateResultMsg(ErrorCodeConst.CODE_SUCCESS, null, ErrorCodeConst.CODE_SUCCESS_MSG);
    }

    public static ResultDto success(Object data) {
        return ResultGenerator.generateResultMsg(ErrorCodeConst.CODE_SUCCESS, null, data);
    }
}

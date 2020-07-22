package com.echo.zim.util;

import java.util.HashMap;
import java.util.Map;

public interface ErrorCodeConst {
    String CODE_SUCCESS = "E00000";
    String CODE_SUCCESS_MSG = "success";


    String CODE_ERROR_SERVER = "E00000";
    String CODE_ERROR_SERVER_MSG = "system error";


    Map<String, String> ERROR_CODE_MAP = new HashMap() {
        {
            put(CODE_SUCCESS, CODE_SUCCESS_MSG);

            put(CODE_ERROR_SERVER, CODE_ERROR_SERVER_MSG);
        }
    };
}

package com.echo.zim.controller;

import com.echo.zim.common.BaseController;
import com.echo.zim.dto.ResultDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController extends BaseController {

    @PostMapping("/echo")
    public ResultDto echo() {
        return success();
    }
}

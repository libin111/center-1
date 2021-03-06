package com.tlong.center.api.web;

import com.tlong.center.api.dto.AppUserRequestDto;
import com.tlong.center.api.dto.AppUserResponseDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Api("Web登录接口")
public interface WebLoginApi {
    @PostMapping("/login")
    @ApiOperation("测试登录")
    AppUserResponseDto webLogin(@RequestBody AppUserRequestDto requestDto);
}

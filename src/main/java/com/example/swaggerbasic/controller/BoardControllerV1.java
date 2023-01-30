package com.example.swaggerbasic.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Api(value = "BoardController V1")
@RequestMapping("/v1/api")
public class BoardControllerV1 {

    @ApiOperation(value = "exam", notes = "예제입니다.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 500, message = "Internal Server Error"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    @GetMapping(value = "/board")
    public Map<String, String> selectOneBoard(@ApiParam(value = "게시판 번호", required = true, example = "1") @RequestParam String no) {
        Map<String, String> result = new HashMap<>();
        result.put("author", "홍길동");
        result.put("content", "V1 API 내용");
        return result;
    }
}

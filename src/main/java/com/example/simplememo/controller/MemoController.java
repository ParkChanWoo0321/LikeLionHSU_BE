package com.example.simplememo.controller;

import com.example.simplememo.CommonResponse;
import com.example.simplememo.dto.MemoRequestDto;
import com.example.simplememo.dto.MemoResponseDto;
import com.example.simplememo.entity.Memo;
import com.example.simplememo.service.MemoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping("/api/memo") //모든 메모 API의 기본 URL
public class MemoController {

    public final MemoService memoService;

    @PostMapping
    public ResponseEntity<CommonResponse<MemoResponseDto>> memoCreate(@RequestBody MemoRequestDto request) {
        Memo memo = memoService.createMemo(request);
        MemoResponseDto response = new MemoResponseDto(memo);
        return ResponseEntity.ok()
                .body(CommonResponse.<MemoResponseDto>builder()
                        .statusCode(200)
                        .msg("메모 생성이 완료되었습니다.")
                        .data(response)
                        .build());
    }
}

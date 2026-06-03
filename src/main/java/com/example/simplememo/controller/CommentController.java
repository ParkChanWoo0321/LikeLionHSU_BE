package com.example.simplememo.controller;

import com.example.simplememo.CommonResponse;
import com.example.simplememo.dto.CommentRequestDto;
import com.example.simplememo.dto.CommentResponseDto;
import com.example.simplememo.entity.Comment;
import com.example.simplememo.service.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping("/api/memo/comments")
public class CommentController {

    private final CommentService commentService;

    @PostMapping("/{memoId}")
    public ResponseEntity<CommonResponse<CommentResponseDto>> createComment(
            @PathVariable Long memoId,
            @RequestBody CommentRequestDto request) {

        Comment comment = commentService.createComment(memoId, request);
        CommentResponseDto response = new CommentResponseDto(comment);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(CommonResponse.<CommentResponseDto>builder()
                        .statusCode(HttpStatus.CREATED.value())
                        .msg("댓글 작성이 완료되었습니다.")
                        .data(response)
                        .build());
    }

    @GetMapping("/{memoId}")
    public ResponseEntity<CommonResponse<List<CommentResponseDto>>> getComments(@PathVariable Long memoId) {
        List<Comment> comments = commentService.getComments(memoId);

        List<CommentResponseDto> response = comments.stream()
                .map(CommentResponseDto::new)
                .collect(Collectors.toList());

        return ResponseEntity.ok()
                .body(CommonResponse.<List<CommentResponseDto>>builder()
                        .statusCode(HttpStatus.OK.value())
                        .msg("댓글 목록 조회가 완료되었습니다.")
                        .data(response)
                        .build());
    }

    @PutMapping("/{commentId}")
    public ResponseEntity<CommonResponse<CommentResponseDto>> updateComment(
            @PathVariable Long commentId,
            @RequestBody CommentRequestDto request) {

        Comment comment = commentService.updateComment(commentId, request);
        CommentResponseDto response = new CommentResponseDto(comment);

        return ResponseEntity.ok()
                .body(CommonResponse.<CommentResponseDto>builder()
                        .statusCode(HttpStatus.OK.value())
                        .msg("댓글 수정이 완료되었습니다.")
                        .data(response)
                        .build());
    }

    @DeleteMapping("/{commentId}")
    public ResponseEntity<CommonResponse<Void>> deleteComment(@PathVariable Long commentId) {
        commentService.deleteComment(commentId);

        return ResponseEntity.ok()
                .body(CommonResponse.<Void>builder()
                        .statusCode(HttpStatus.OK.value())
                        .msg("댓글 삭제가 완료되었습니다.")
                        .build());
    }
}
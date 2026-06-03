package com.example.simplememo.dto;

import com.example.simplememo.entity.Comment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentResponseDto {

    private Long commentId;
    private Long memoId;
    private String content;

    public CommentResponseDto(Comment comment) {
        this.commentId = comment.getCommentId();
        this.memoId = comment.getMemo().getMemoId();
        this.content = comment.getContent();
    }
}
package com.example.simplememo.dto;

import com.example.simplememo.entity.Comment;
import com.example.simplememo.entity.Memo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentRequestDto {

    private String content;

    public Comment toEntity(Memo memo) {
        return Comment.builder()
                .content(content)
                .memo(memo)
                .build();
    }
}
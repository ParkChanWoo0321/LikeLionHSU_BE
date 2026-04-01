package com.example.simplememo.dto;

import com.example.simplememo.entity.Memo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemoRequestDto {
    private String title;
    private String content;

    public Memo toEntity() {
        return Memo.builder()
                .title(title)
                .content(content)
                .build();
    }
}

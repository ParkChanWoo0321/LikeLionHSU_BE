package com.example.simplememo.service;

import com.example.simplememo.dto.CommonResponse;
import com.example.simplememo.dto.MemoRequestDto;
import com.example.simplememo.dto.MemoResponseDto;
import com.example.simplememo.entity.Memo;
import com.example.simplememo.repository.MemoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MemoService {

    private final MemoRepository memoRepository;

    public Memo createMemo(MemoRequestDto request) {
        Memo memo = request.toEntity();
        return memoRepository.save(memo);
    }
}

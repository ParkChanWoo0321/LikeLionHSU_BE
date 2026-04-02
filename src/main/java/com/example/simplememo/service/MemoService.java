package com.example.simplememo.service;

import com.example.simplememo.dto.MemoRequestDto;
import com.example.simplememo.entity.Memo;
import com.example.simplememo.repository.MemoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MemoService {

    private final MemoRepository memoRepository;

    public Memo createMemo(MemoRequestDto request) {
        Memo memo = request.toEntity();
        return memoRepository.save(memo);
    }
}

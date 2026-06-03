package com.example.simplememo.repository;

import com.example.simplememo.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByMemo_MemoIdOrderByCommentIdDesc(Long memoId);
}
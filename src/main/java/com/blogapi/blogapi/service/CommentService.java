package com.blogapi.blogapi.service;

import com.blogapi.blogapi.payload.CommentDto;

import java.util.List;

public interface CommentService {
    CommentDto createComment(long postId, CommentDto commentDto);
    public List<CommentDto> findCommentByPostId(long postId);

    void deleteCommentById(long postId, long id);

    CommentDto getCommentById(long postId, long id);

    CommentDto updateComment(long postId, long commentId, CommentDto commentDto);
}

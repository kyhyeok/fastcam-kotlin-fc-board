package com.fastcompus.fcboard.controller

import com.fastcompus.fcboard.controller.dto.CommentCreateRequest
import com.fastcompus.fcboard.controller.dto.CommentUpdateRequest
import com.fastcompus.fcboard.controller.dto.toDto
import com.fastcompus.fcboard.service.CommentService
import org.springframework.web.bind.annotation.*

@RestController
class CommentController(
    val commentService: CommentService,
) {

    @PostMapping("posts/{postId}/comments")
    fun createComment(
        @PathVariable postId: Long,
        @RequestBody commentCreateRequest: CommentCreateRequest,
    ): Long {
        return commentService.createComment(postId, commentCreateRequest.toDto())
    }

    @PutMapping("comments/{commentId}")
    fun commentUpdate(
        @PathVariable commentId: Long,
        @RequestBody commentUpdateRequest: CommentUpdateRequest,
    ): Long {
        return commentService.updateComment(commentId, commentUpdateRequest.toDto())
    }

    @DeleteMapping("comments/{commentId}")
    fun commentDelete(
        @PathVariable commentId: Long,
        @RequestParam deleteBy: String
    ): Long {
        return commentService.deleteComment(commentId, deleteBy)
    }
}

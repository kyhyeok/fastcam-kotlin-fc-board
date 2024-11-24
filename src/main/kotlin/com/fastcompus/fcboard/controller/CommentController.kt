package com.fastcompus.fcboard.controller

import com.fastcompus.fcboard.controller.dto.CommentCreateRequest
import com.fastcompus.fcboard.controller.dto.CommentUpdateRequest
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CommentController {

    @PostMapping("posts/{postId}/comments")
    fun createComment(
        @PathVariable postId: Long,
        @RequestBody commentCreateRequest: CommentCreateRequest,
    ): Long {
        println(commentCreateRequest.content)
        println(commentCreateRequest.createdBy)
        return 1L
    }

    @PutMapping("comments/{commentId}")
    fun commentUpdate(
        @PathVariable commentId: Long,
        @RequestBody commentUpdateRequest: CommentUpdateRequest,
    ): Long {
        println(commentUpdateRequest.content)
        println(commentUpdateRequest.updatedBy)
        return commentId
    }

    @DeleteMapping("comments/{commentId}")
    fun commentDelete(
        @PathVariable commentId: Long,
        @RequestParam deleteBy: String
    ): Long {
        println(deleteBy)
        return commentId
    }
}

package com.fastcompus.fcboard.service.dto

import com.fastcompus.fcboard.controller.dto.CommentCreateRequest
import com.fastcompus.fcboard.domain.Comment
import com.fastcompus.fcboard.domain.Post

data class CommentCreateRequestDto(
    val content: String,
    val createdBy: String,
)

fun CommentCreateRequestDto.toEntity(post: Post) = Comment(
    content = content,
    createdBy = createdBy,
    post = post
)

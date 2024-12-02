package com.fastcompus.fcboard.controller.dto

import com.fastcompus.fcboard.service.dto.PostUpdateRequestDto

data class PostUpdateRequest(
    val title: String,
    val content: String,
    val updatedBy: String,
    val tags: List<String> = emptyList(),
)

fun PostUpdateRequest.toDto() = PostUpdateRequestDto (
    title = title,
    content = content,
    updatedBy = updatedBy,
)

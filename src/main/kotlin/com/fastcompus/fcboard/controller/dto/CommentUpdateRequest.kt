package com.fastcompus.fcboard.controller.dto

data class CommentUpdateRequest(
    val content: String,
    val updatedBy: String,
)

package com.fastcompus.fcboard.controller

import com.fastcompus.fcboard.controller.dto.*
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.*
import java.time.LocalDateTime

@RestController
class PostController {

    @PostMapping("/posts")
    fun createPost(
        @RequestBody postCreateRequest: PostCreateRequest,
    ): Long {
        return 1L
    }

    @PutMapping("/posts/{id}")
    fun updatePost(
        @PathVariable("id") id: Long,
        @RequestBody postUpdateRequest: PostUpdateRequest,
    ): Long {
        return id
    }

    @DeleteMapping("/posts/{id}")
    fun deletePost(
        @PathVariable("id") id: Long,
        @RequestParam createdBy: String,
    ): Long {
        println(createdBy)
        return id
    }

    @GetMapping("/posts/{id}")
    fun getPost(
        @PathVariable id: Long,
    ): PostDetailResponse {
        return PostDetailResponse(1L, "title", "content", "hyeok", LocalDateTime.now().toString())
    }

    @GetMapping("/posts")
    fun getPosts(
        pageable: Pageable,
        postSearchRequest: PostSearchRequest,
    ): Page<PostSummaryResponse> {
        println("title: ${postSearchRequest.title}")
        println("title: ${postSearchRequest.createdBy}")
        return Page.empty()
    }
}
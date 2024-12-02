package com.fastcompus.fcboard.controller;

@org.springframework.web.bind.annotation.RestController
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0017J\u001c\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0017J\u0012\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\n\u001a\u00020\u0006H\u0017J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\u001c\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u0018H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/fastcompus/fcboard/controller/PostController;", "", "postService", "Lcom/fastcompus/fcboard/service/PostService;", "(Lcom/fastcompus/fcboard/service/PostService;)V", "createPost", "", "postCreateRequest", "Lcom/fastcompus/fcboard/controller/dto/PostCreateRequest;", "deletePost", "id", "createdBy", "", "getPost", "Lcom/fastcompus/fcboard/controller/dto/PostDetailResponse;", "getPosts", "Lorg/springframework/data/domain/Page;", "Lcom/fastcompus/fcboard/controller/dto/PostSummaryResponse;", "pageable", "Lorg/springframework/data/domain/Pageable;", "postSearchRequest", "Lcom/fastcompus/fcboard/controller/dto/PostSearchRequest;", "updatePost", "postUpdateRequest", "Lcom/fastcompus/fcboard/controller/dto/PostUpdateRequest;", "fc-board"})
public class PostController {
    @org.jetbrains.annotations.NotNull
    private final com.fastcompus.fcboard.service.PostService postService = null;
    
    public PostController(@org.jetbrains.annotations.NotNull
    com.fastcompus.fcboard.service.PostService postService) {
        super();
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/posts"})
    public long createPost(@org.springframework.web.bind.annotation.RequestBody
    @org.jetbrains.annotations.NotNull
    com.fastcompus.fcboard.controller.dto.PostCreateRequest postCreateRequest) {
        return 0L;
    }
    
    @org.springframework.web.bind.annotation.PutMapping(value = {"/posts/{id}"})
    public long updatePost(@org.springframework.web.bind.annotation.PathVariable(value = "id")
    long id, @org.springframework.web.bind.annotation.RequestBody
    @org.jetbrains.annotations.NotNull
    com.fastcompus.fcboard.controller.dto.PostUpdateRequest postUpdateRequest) {
        return 0L;
    }
    
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/posts/{id}"})
    public long deletePost(@org.springframework.web.bind.annotation.PathVariable(value = "id")
    long id, @org.springframework.web.bind.annotation.RequestParam
    @org.jetbrains.annotations.NotNull
    java.lang.String createdBy) {
        return 0L;
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/posts/{id}"})
    @org.jetbrains.annotations.NotNull
    public com.fastcompus.fcboard.controller.dto.PostDetailResponse getPost(@org.springframework.web.bind.annotation.PathVariable
    long id) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/posts"})
    @org.jetbrains.annotations.NotNull
    public org.springframework.data.domain.Page<com.fastcompus.fcboard.controller.dto.PostSummaryResponse> getPosts(@org.jetbrains.annotations.NotNull
    org.springframework.data.domain.Pageable pageable, @org.jetbrains.annotations.NotNull
    com.fastcompus.fcboard.controller.dto.PostSearchRequest postSearchRequest) {
        return null;
    }
}
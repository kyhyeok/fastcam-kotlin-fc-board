package com.fastcompus.fcboard.controller;

@org.springframework.web.bind.annotation.RestController
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0017J\u001c\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\nH\u0017J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u0004H\u0017J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0017J\u001c\u0010\u0014\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u0016H\u0017\u00a8\u0006\u0017"}, d2 = {"Lcom/fastcompus/fcboard/controller/PostController;", "", "()V", "createPost", "", "postCreateRequest", "Lcom/fastcompus/fcboard/controller/dto/PostCreateRequest;", "deletePost", "id", "createdBy", "", "getPost", "Lcom/fastcompus/fcboard/controller/dto/PostDetailResponse;", "getPosts", "Lorg/springframework/data/domain/Page;", "Lcom/fastcompus/fcboard/controller/dto/PostSummaryResponse;", "pageable", "Lorg/springframework/data/domain/Pageable;", "postSearchRequest", "Lcom/fastcompus/fcboard/controller/dto/PostSearchRequest;", "updatePost", "postUpdateRequest", "Lcom/fastcompus/fcboard/controller/dto/PostUpdateRequest;", "fc-board"})
public class PostController {
    
    public PostController() {
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
package com.fastcompus.fcboard.service;

@org.springframework.stereotype.Service
@org.springframework.transaction.annotation.Transactional(readOnly = true)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0017J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0017H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/fastcompus/fcboard/service/PostService;", "", "postRepository", "Lcom/fastcompus/fcboard/repository/PostRepository;", "(Lcom/fastcompus/fcboard/repository/PostRepository;)V", "createPost", "", "requestDto", "Lcom/fastcompus/fcboard/service/dto/PostCreateRequestDto;", "deletePost", "id", "deletedBy", "", "findPageBy", "Lorg/springframework/data/domain/Page;", "Lcom/fastcompus/fcboard/service/dto/PostSummaryResponseDto;", "pageRequest", "Lorg/springframework/data/domain/Pageable;", "postSearchRequestDto", "Lcom/fastcompus/fcboard/service/dto/PostSearchRequestDto;", "getPost", "Lcom/fastcompus/fcboard/service/dto/PostDetailResponseDto;", "updatePost", "Lcom/fastcompus/fcboard/service/dto/PostUpdateRequestDto;", "fc-board"})
public class PostService {
    @org.jetbrains.annotations.NotNull
    private final com.fastcompus.fcboard.repository.PostRepository postRepository = null;
    
    public PostService(@org.jetbrains.annotations.NotNull
    com.fastcompus.fcboard.repository.PostRepository postRepository) {
        super();
    }
    
    @org.springframework.transaction.annotation.Transactional
    public long createPost(@org.jetbrains.annotations.NotNull
    com.fastcompus.fcboard.service.dto.PostCreateRequestDto requestDto) {
        return 0L;
    }
    
    @org.springframework.transaction.annotation.Transactional
    public long updatePost(long id, @org.jetbrains.annotations.NotNull
    com.fastcompus.fcboard.service.dto.PostUpdateRequestDto requestDto) {
        return 0L;
    }
    
    @org.springframework.transaction.annotation.Transactional
    public long deletePost(long id, @org.jetbrains.annotations.NotNull
    java.lang.String deletedBy) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.fastcompus.fcboard.service.dto.PostDetailResponseDto getPost(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.springframework.data.domain.Page<com.fastcompus.fcboard.service.dto.PostSummaryResponseDto> findPageBy(@org.jetbrains.annotations.NotNull
    org.springframework.data.domain.Pageable pageRequest, @org.jetbrains.annotations.NotNull
    com.fastcompus.fcboard.service.dto.PostSearchRequestDto postSearchRequestDto) {
        return null;
    }
}
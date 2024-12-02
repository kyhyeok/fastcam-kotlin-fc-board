package com.fastcompus.fcboard.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/fastcompus/fcboard/repository/CustomPostRepositoryImpl;", "Lcom/fastcompus/fcboard/repository/CustomPostRepository;", "Lorg/springframework/data/jpa/repository/support/QuerydslRepositorySupport;", "()V", "findPageBy", "Lorg/springframework/data/domain/Page;", "Lcom/fastcompus/fcboard/domain/Post;", "pageRequest", "Lorg/springframework/data/domain/Pageable;", "postSearchRequestDto", "Lcom/fastcompus/fcboard/service/dto/PostSearchRequestDto;", "fc-board"})
public class CustomPostRepositoryImpl extends org.springframework.data.jpa.repository.support.QuerydslRepositorySupport implements com.fastcompus.fcboard.repository.CustomPostRepository {
    
    public CustomPostRepositoryImpl() {
        super(null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.springframework.data.domain.Page<com.fastcompus.fcboard.domain.Post> findPageBy(@org.jetbrains.annotations.NotNull
    org.springframework.data.domain.Pageable pageRequest, @org.jetbrains.annotations.NotNull
    com.fastcompus.fcboard.service.dto.PostSearchRequestDto postSearchRequestDto) {
        return null;
    }
}
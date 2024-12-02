package com.fastcompus.fcboard.repository;

@org.springframework.stereotype.Repository
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/fastcompus/fcboard/repository/PostRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lcom/fastcompus/fcboard/domain/Post;", "", "Lcom/fastcompus/fcboard/repository/CustomPostRepository;", "fc-board"})
public abstract interface PostRepository extends org.springframework.data.jpa.repository.JpaRepository<com.fastcompus.fcboard.domain.Post, java.lang.Long>, com.fastcompus.fcboard.repository.CustomPostRepository {
}
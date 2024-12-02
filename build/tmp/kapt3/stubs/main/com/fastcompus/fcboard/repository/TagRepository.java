package com.fastcompus.fcboard.repository;

@org.springframework.stereotype.Repository
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/fastcompus/fcboard/repository/TagRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lcom/fastcompus/fcboard/domain/Tag;", "", "findByPostId", "", "postId", "fc-board"})
public abstract interface TagRepository extends org.springframework.data.jpa.repository.JpaRepository<com.fastcompus.fcboard.domain.Tag, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.fastcompus.fcboard.domain.Tag> findByPostId(long postId);
}
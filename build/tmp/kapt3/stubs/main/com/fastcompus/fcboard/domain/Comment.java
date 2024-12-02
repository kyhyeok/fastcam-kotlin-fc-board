package com.fastcompus.fcboard.domain;

@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "comment")
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058\u0006@DX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0019"}, d2 = {"Lcom/fastcompus/fcboard/domain/Comment;", "Lcom/fastcompus/fcboard/domain/BaseEntity;", "content", "", "post", "Lcom/fastcompus/fcboard/domain/Post;", "createdBy", "(Ljava/lang/String;Lcom/fastcompus/fcboard/domain/Post;Ljava/lang/String;)V", "<set-?>", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "id", "", "getId", "()J", "getPost", "()Lcom/fastcompus/fcboard/domain/Post;", "setPost", "(Lcom/fastcompus/fcboard/domain/Post;)V", "update", "", "updateRequestDto", "Lcom/fastcompus/fcboard/service/dto/CommentUpdateRequestDto;", "fc-board"})
public final class Comment extends com.fastcompus.fcboard.domain.BaseEntity {
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull
    private java.lang.String content;
    @jakarta.persistence.ManyToOne(fetch = jakarta.persistence.FetchType.LAZY)
    @org.jetbrains.annotations.NotNull
    private com.fastcompus.fcboard.domain.Post post;
    
    public Comment(@org.jetbrains.annotations.NotNull
    java.lang.String content, @org.jetbrains.annotations.NotNull
    com.fastcompus.fcboard.domain.Post post, @org.jetbrains.annotations.NotNull
    java.lang.String createdBy) {
        super(null);
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getContent() {
        return null;
    }
    
    protected final void setContent(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.fastcompus.fcboard.domain.Post getPost() {
        return null;
    }
    
    protected final void setPost(@org.jetbrains.annotations.NotNull
    com.fastcompus.fcboard.domain.Post p0) {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull
    com.fastcompus.fcboard.service.dto.CommentUpdateRequestDto updateRequestDto) {
    }
}
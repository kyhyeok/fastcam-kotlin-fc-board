package com.fastcompus.fcboard.domain;

@jakarta.persistence.Entity
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/fastcompus/fcboard/domain/Tag;", "Lcom/fastcompus/fcboard/domain/BaseEntity;", "name", "", "post", "Lcom/fastcompus/fcboard/domain/Post;", "createdBy", "(Ljava/lang/String;Lcom/fastcompus/fcboard/domain/Post;Ljava/lang/String;)V", "id", "", "getId", "()J", "<set-?>", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getPost", "()Lcom/fastcompus/fcboard/domain/Post;", "setPost", "(Lcom/fastcompus/fcboard/domain/Post;)V", "fc-board"})
public final class Tag extends com.fastcompus.fcboard.domain.BaseEntity {
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull
    private java.lang.String name;
    @jakarta.persistence.ManyToOne(fetch = jakarta.persistence.FetchType.LAZY)
    @org.jetbrains.annotations.NotNull
    private com.fastcompus.fcboard.domain.Post post;
    
    public Tag(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    com.fastcompus.fcboard.domain.Post post, @org.jetbrains.annotations.NotNull
    java.lang.String createdBy) {
        super(null);
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    protected final void setName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.fastcompus.fcboard.domain.Post getPost() {
        return null;
    }
    
    public final void setPost(@org.jetbrains.annotations.NotNull
    com.fastcompus.fcboard.domain.Post p0) {
    }
}
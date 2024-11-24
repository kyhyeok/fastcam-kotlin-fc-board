package com.fastcompus.fcboard.domain;

@jakarta.persistence.Entity
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R$\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b\u00a8\u0006\u0012"}, d2 = {"Lcom/fastcompus/fcboard/domain/Post;", "Lcom/fastcompus/fcboard/domain/BaseEntity;", "createdBy", "", "title", "content", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "<set-?>", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "id", "", "getId", "()J", "getTitle", "setTitle", "fc-board"})
public final class Post extends com.fastcompus.fcboard.domain.BaseEntity {
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull
    private java.lang.String content;
    
    public Post(@org.jetbrains.annotations.NotNull
    java.lang.String createdBy, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String content) {
        super(null);
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    protected final void setTitle(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getContent() {
        return null;
    }
    
    protected final void setContent(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
}
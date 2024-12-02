package com.fastcompus.fcboard.domain;

@jakarta.persistence.Entity
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\u001e\u001a\u00020\u001f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0002J\u000e\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"R2\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@DX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0005\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R2\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00190\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00190\n8\u0006@DX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0010R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014\u00a8\u0006#"}, d2 = {"Lcom/fastcompus/fcboard/domain/Post;", "Lcom/fastcompus/fcboard/domain/BaseEntity;", "createdBy", "", "title", "content", "tags", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "<set-?>", "", "Lcom/fastcompus/fcboard/domain/Comment;", "comments", "getComments", "()Ljava/util/List;", "setComments", "(Ljava/util/List;)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "id", "", "getId", "()J", "Lcom/fastcompus/fcboard/domain/Tag;", "getTags", "setTags", "getTitle", "setTitle", "replaceTags", "", "update", "postUpdateRequestDto", "Lcom/fastcompus/fcboard/service/dto/PostUpdateRequestDto;", "fc-board"})
public final class Post extends com.fastcompus.fcboard.domain.BaseEntity {
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull
    private java.lang.String content;
    @jakarta.persistence.OneToMany(mappedBy = "post", orphanRemoval = true, cascade = {jakarta.persistence.CascadeType.ALL})
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.fastcompus.fcboard.domain.Comment> comments;
    @jakarta.persistence.OneToMany(mappedBy = "post", orphanRemoval = true, cascade = {jakarta.persistence.CascadeType.ALL})
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.fastcompus.fcboard.domain.Tag> tags;
    
    public Post(@org.jetbrains.annotations.NotNull
    java.lang.String createdBy, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String content, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> tags) {
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
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.fastcompus.fcboard.domain.Comment> getComments() {
        return null;
    }
    
    protected final void setComments(@org.jetbrains.annotations.NotNull
    java.util.List<com.fastcompus.fcboard.domain.Comment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.fastcompus.fcboard.domain.Tag> getTags() {
        return null;
    }
    
    protected final void setTags(@org.jetbrains.annotations.NotNull
    java.util.List<com.fastcompus.fcboard.domain.Tag> p0) {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull
    com.fastcompus.fcboard.service.dto.PostUpdateRequestDto postUpdateRequestDto) {
    }
    
    private final void replaceTags(java.util.List<java.lang.String> tags) {
    }
}
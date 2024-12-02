package com.fastcompus.fcboard.domain;

@jakarta.persistence.MappedSuperclass
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0003R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR(\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\u0004\u00a8\u0006\u0014"}, d2 = {"Lcom/fastcompus/fcboard/domain/BaseEntity;", "", "createdBy", "", "(Ljava/lang/String;)V", "createdAt", "Ljava/time/LocalDateTime;", "getCreatedAt", "()Ljava/time/LocalDateTime;", "getCreatedBy", "()Ljava/lang/String;", "<set-?>", "updatedAt", "getUpdatedAt", "setUpdatedAt", "(Ljava/time/LocalDateTime;)V", "updatedBy", "getUpdatedBy", "setUpdatedBy", "", "fc-board"})
public abstract class BaseEntity {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String createdBy = null;
    @org.jetbrains.annotations.NotNull
    private final java.time.LocalDateTime createdAt = null;
    @org.jetbrains.annotations.Nullable
    private java.lang.String updatedBy;
    @org.jetbrains.annotations.Nullable
    private java.time.LocalDateTime updatedAt;
    
    public BaseEntity(@org.jetbrains.annotations.NotNull
    java.lang.String createdBy) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCreatedBy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDateTime getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUpdatedBy() {
        return null;
    }
    
    protected final void setUpdatedBy(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDateTime getUpdatedAt() {
        return null;
    }
    
    protected final void setUpdatedAt(@org.jetbrains.annotations.Nullable
    java.time.LocalDateTime p0) {
    }
    
    public final void updatedBy(@org.jetbrains.annotations.NotNull
    java.lang.String updatedBy) {
    }
}
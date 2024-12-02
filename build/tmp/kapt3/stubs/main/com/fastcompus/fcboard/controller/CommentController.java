package com.fastcompus.fcboard.controller;

@org.springframework.web.bind.annotation.RestController
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0017J\u001c\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0017J\u001c\u0010\u000f\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/fastcompus/fcboard/controller/CommentController;", "", "commentService", "Lcom/fastcompus/fcboard/service/CommentService;", "(Lcom/fastcompus/fcboard/service/CommentService;)V", "getCommentService", "()Lcom/fastcompus/fcboard/service/CommentService;", "commentDelete", "", "commentId", "deleteBy", "", "commentUpdate", "commentUpdateRequest", "Lcom/fastcompus/fcboard/controller/dto/CommentUpdateRequest;", "createComment", "postId", "commentCreateRequest", "Lcom/fastcompus/fcboard/controller/dto/CommentCreateRequest;", "fc-board"})
public class CommentController {
    @org.jetbrains.annotations.NotNull
    private final com.fastcompus.fcboard.service.CommentService commentService = null;
    
    public CommentController(@org.jetbrains.annotations.NotNull
    com.fastcompus.fcboard.service.CommentService commentService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.fastcompus.fcboard.service.CommentService getCommentService() {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"posts/{postId}/comments"})
    public long createComment(@org.springframework.web.bind.annotation.PathVariable
    long postId, @org.springframework.web.bind.annotation.RequestBody
    @org.jetbrains.annotations.NotNull
    com.fastcompus.fcboard.controller.dto.CommentCreateRequest commentCreateRequest) {
        return 0L;
    }
    
    @org.springframework.web.bind.annotation.PutMapping(value = {"comments/{commentId}"})
    public long commentUpdate(@org.springframework.web.bind.annotation.PathVariable
    long commentId, @org.springframework.web.bind.annotation.RequestBody
    @org.jetbrains.annotations.NotNull
    com.fastcompus.fcboard.controller.dto.CommentUpdateRequest commentUpdateRequest) {
        return 0L;
    }
    
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"comments/{commentId}"})
    public long commentDelete(@org.springframework.web.bind.annotation.PathVariable
    long commentId, @org.springframework.web.bind.annotation.RequestParam
    @org.jetbrains.annotations.NotNull
    java.lang.String deleteBy) {
        return 0L;
    }
}
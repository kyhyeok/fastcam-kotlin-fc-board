package com.fastcompus.fcboard;

@org.springframework.web.bind.annotation.RestController
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H\u0017\u00a8\u0006\u0007"}, d2 = {"Lcom/fastcompus/fcboard/SampleController;", "", "()V", "sample", "", "samplePost", "name", "fc-board"})
public class SampleController {
    
    public SampleController() {
        super();
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/sample"})
    @org.jetbrains.annotations.NotNull
    public java.lang.String sample() {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/sample"})
    @org.jetbrains.annotations.NotNull
    public java.lang.String samplePost(@org.springframework.web.bind.annotation.RequestParam
    @org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return null;
    }
}
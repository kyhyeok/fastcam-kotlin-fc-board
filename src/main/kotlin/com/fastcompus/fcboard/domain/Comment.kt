package com.fastcompus.fcboard.domain

import jakarta.persistence.*

@Entity
@Table(name = "comment")
class Comment(
    content: String,
    post: Post,
    createdBy: String
): BaseEntity(createdBy =  createdBy) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L

    var content: String = content
        protected set

    @ManyToOne(fetch = FetchType.LAZY)
    var post: Post = post
        protected set
}

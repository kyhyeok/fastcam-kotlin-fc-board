package com.fastcompus.fcboard.domain

import jakarta.persistence.*

@Entity
@Table(name = "likes")
class Like(
    post: Post,
    createdBy: String,
) : BaseEntity(createdBy) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0

    @ManyToOne(fetch = FetchType.LAZY)
    var post: Post = post
        private set
}

package com.fastcompus.fcboard.domain

import com.fastcompus.fcboard.exception.CommentNotUpdatableException
import com.fastcompus.fcboard.service.dto.CommentUpdateRequestDto
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

    fun update(updateRequestDto: CommentUpdateRequestDto) {
        if (updateRequestDto.updatedBy != this.createdBy) {
            throw CommentNotUpdatableException()
        }
        this.content = updateRequestDto.content
        super.updatedBy(updateRequestDto.updatedBy)
    }
}

package com.fastcompus.fcboard.service

import com.fastcompus.fcboard.domain.Comment
import com.fastcompus.fcboard.exception.CommentNotDeletableException
import com.fastcompus.fcboard.exception.CommentNotFoundException
import com.fastcompus.fcboard.exception.PostNotFoundException
import com.fastcompus.fcboard.repository.CommentRepository
import com.fastcompus.fcboard.repository.PostRepository
import com.fastcompus.fcboard.service.dto.CommentCreateRequestDto
import com.fastcompus.fcboard.service.dto.CommentUpdateRequestDto
import com.fastcompus.fcboard.service.dto.toEntity
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class CommentService(
    private val commentRepository: CommentRepository,
    private val postRepository: PostRepository,
) {

    @Transactional
    fun createComment(postId: Long, createRequestDto: CommentCreateRequestDto): Long {
        val post = postRepository.findByIdOrNull(postId) ?: throw PostNotFoundException()
        return commentRepository.save(createRequestDto.toEntity(post)).id
    }

    @Transactional
    fun updateComment(id: Long, updateRequestDto: CommentUpdateRequestDto): Long {
        val comment = commentRepository.findByIdOrNull(id) ?: throw CommentNotFoundException()
        comment.update(updateRequestDto)
        return comment.id
    }

    @Transactional
    fun deleteComment(id: Long, deletedBy: String): Long {
        val comment = commentRepository.findByIdOrNull(id) ?: throw CommentNotFoundException()
        if (comment.createdBy != deletedBy) {
            throw CommentNotDeletableException()
        }
        commentRepository.delete(comment)
        return id
    }
}

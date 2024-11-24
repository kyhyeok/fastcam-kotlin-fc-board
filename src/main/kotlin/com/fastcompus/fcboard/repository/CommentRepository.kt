package com.fastcompus.fcboard.repository

import com.fastcompus.fcboard.domain.Comment
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CommentRepository: JpaRepository<Comment, Long> {
}

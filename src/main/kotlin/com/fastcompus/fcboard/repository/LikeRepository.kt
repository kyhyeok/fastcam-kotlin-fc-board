package com.fastcompus.fcboard.repository

import com.fastcompus.fcboard.domain.Like
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LikeRepository: JpaRepository<Like, Long> {
}

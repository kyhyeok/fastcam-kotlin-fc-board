package com.fastcompus.fcboard.service


import com.fastcompus.fcboard.domain.Like
import com.fastcompus.fcboard.exception.PostNotFoundException
import com.fastcompus.fcboard.repository.LikeRepository
import com.fastcompus.fcboard.repository.PostRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class LikeService (
    private val likeRepository: LikeRepository,
    private val postRepository: PostRepository,
) {
    @Transactional
    fun createLike(postId: Long, createdBy: String): Long {
        val post = postRepository.findByIdOrNull(postId) ?: throw PostNotFoundException()
        return likeRepository.save(Like(post, createdBy)).id
    }

    fun countLike(postId: Long): Long {
        return likeRepository.countByPostId(postId)
    }
}

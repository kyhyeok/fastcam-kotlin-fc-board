package com.fastcompus.fcboard.service


import com.fastcompus.fcboard.domain.Like
import com.fastcompus.fcboard.event.dto.LikeEvent
import com.fastcompus.fcboard.exception.PostNotFoundException
import com.fastcompus.fcboard.repository.LikeRepository
import com.fastcompus.fcboard.repository.PostRepository
import com.fastcompus.fcboard.util.RedisUtil
import org.springframework.context.ApplicationEventPublisher
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class LikeService (
    private val likeRepository: LikeRepository,
    private val postRepository: PostRepository,
    private val redisUtil: RedisUtil,
    private val applicationEventPublisher: ApplicationEventPublisher,
) {
    fun createLike(postId: Long, createdBy: String) {
        applicationEventPublisher.publishEvent(LikeEvent(postId, createdBy))
    }

    fun countLike(postId: Long): Long {
        redisUtil.getCount(redisUtil.getLikeCountKey(postId))?.let { return it }
        with(likeRepository.countByPostId(postId)) {
            redisUtil.setData(redisUtil.getLikeCountKey(postId), this)
            return this
        }
    }
}

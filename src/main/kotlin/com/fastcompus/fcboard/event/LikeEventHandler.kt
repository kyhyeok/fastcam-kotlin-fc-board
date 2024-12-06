package com.fastcompus.fcboard.event

import com.fastcompus.fcboard.domain.Like
import com.fastcompus.fcboard.event.dto.LikeEvent
import com.fastcompus.fcboard.exception.PostNotFoundException
import com.fastcompus.fcboard.repository.LikeRepository
import com.fastcompus.fcboard.repository.PostRepository
import com.fastcompus.fcboard.util.RedisUtil
import org.springframework.data.repository.findByIdOrNull
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Service
import org.springframework.transaction.event.TransactionalEventListener

@Service
class LikeEventHandler(
    private val likeRepository: LikeRepository,
    private val postRepository: PostRepository,
    private val redisUtil: RedisUtil,
) {

    @Async
    @TransactionalEventListener(LikeEvent::class)
    fun handle(event: LikeEvent) {
        Thread.sleep(3000)
        val post = postRepository.findByIdOrNull(event.postId) ?: throw PostNotFoundException()
        redisUtil.increment(redisUtil.getLikeCountKey(event.postId))
        likeRepository.save(Like(post, event.createdBy))
    }
}

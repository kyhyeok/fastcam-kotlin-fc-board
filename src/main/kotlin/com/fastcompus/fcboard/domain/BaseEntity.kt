package com.fastcompus.fcboard.domain

import jakarta.persistence.MappedSuperclass
import java.time.LocalDateTime

@MappedSuperclass
abstract class BaseEntity (
    createdBy: String
) {
    val createdBy: String = createdBy
    val createdAt: LocalDateTime = LocalDateTime.now()
    var updatedBy: String? = null
        protected set // 외부에서 수정할 수 없게
    var updatedAt: LocalDateTime? = null
        protected set

    fun update(
        updatedBy: String
    ) {
        this.updatedBy = updatedBy
        this.updatedAt = LocalDateTime.now()
    }
}

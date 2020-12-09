package org.selffish.domain.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Measure(@Id val id: String?, val creationDate: Long, val type: Type, val value: Double,
                   val deviceId: String)

enum class Type {
    WATER_TEMP, BOX_HUMIDITY, BOX_TEMP
}
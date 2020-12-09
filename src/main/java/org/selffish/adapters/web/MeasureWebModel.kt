package org.selffish.adapters.web

import org.selffish.domain.entities.Type

data class MeasureWebModel(val type: Type, val value: Double, val deviceId: String)
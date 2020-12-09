package org.selffish.adapters.web

import org.selffish.domain.entities.Measure
import org.springframework.stereotype.Service

@Service
class MeasureWebModelMapper {

    fun createMeasure(webModel: MeasureWebModel) =
        Measure(null, System.currentTimeMillis(), webModel.type, webModel.value, webModel.deviceId)

}
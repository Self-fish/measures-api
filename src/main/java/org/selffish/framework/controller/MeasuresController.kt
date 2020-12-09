package org.selffish.framework.controller

import org.selffish.adapters.web.MeasureWebModel
import org.selffish.adapters.web.MeasureWebModelMapper
import org.selffish.domain.entities.Measure
import org.selffish.domain.usecases.AddMeasureUseCase
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("measures")
class MeasuresController(private val addUseCase: AddMeasureUseCase,
                         private val mapper: MeasureWebModelMapper  ){

    @RequestMapping(method = [RequestMethod.POST], consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun add(@RequestBody measuresWebModel: MeasureWebModel): Measure {
        return addUseCase.create(mapper.createMeasure(measuresWebModel))
    }
}
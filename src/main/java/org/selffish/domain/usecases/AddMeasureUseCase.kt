package org.selffish.domain.usecases

import org.selffish.domain.contracts.MeasureRepository
import org.selffish.domain.entities.Measure
import org.springframework.stereotype.Service

@Service
class AddMeasureUseCase(private val repository: MeasureRepository) {

    fun create(measure: Measure): Measure {
        return repository.insert(measure)
    }
}
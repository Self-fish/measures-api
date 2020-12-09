package org.selffish.adapters.repositories

import org.selffish.adapters.database.MeasuresDataBase
import org.selffish.domain.contracts.MeasureRepository
import org.selffish.domain.entities.Measure
import org.springframework.stereotype.Component

@Component
class MeasureRepositoryImpl(private val dataBase: MeasuresDataBase): MeasureRepository {

    override fun insert(measure: Measure): Measure = dataBase.insert(measure)
}
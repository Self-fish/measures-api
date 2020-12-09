package org.selffish.domain.contracts

import org.selffish.domain.entities.Measure

interface MeasureRepository {

    fun insert(measure: Measure): Measure
}
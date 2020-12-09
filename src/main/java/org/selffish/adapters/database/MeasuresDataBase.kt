package org.selffish.adapters.database

import org.selffish.domain.entities.Measure
import org.springframework.data.mongodb.repository.MongoRepository

interface MeasuresDataBase: MongoRepository<Measure, String> {
}
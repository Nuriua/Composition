package com.selva.composition.domain.repository

import com.selva.composition.domain.entity.GameSettings
import com.selva.composition.domain.entity.Level
import com.selva.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}
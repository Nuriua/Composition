package com.selva.composition.domain.usecases

import com.selva.composition.domain.entity.GameSettings
import com.selva.composition.domain.entity.Level
import com.selva.composition.domain.entity.Question
import com.selva.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}
package com.renan.labapi.model

data class CharacterModel(
    val id: Int,
    val name: String,
    val status: String,
    val origin: OriginModel,
    val episodes: List<String>
)
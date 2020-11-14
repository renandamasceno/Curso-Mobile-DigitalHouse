package com.renan.labapi.model

data class ApiResponseModel<T> (
    val info: PageInfoModel,
    val results: List<T>
)
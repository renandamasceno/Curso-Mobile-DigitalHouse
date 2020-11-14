package com.renan.labapi.model

data class PageInfoModel (
    val count: Int,
    val pages: Int,
    val next: String?,
    val prev: String?

)

package com.renan.revisaoproject.listCategories.repository

class CategoriesRepository {
    private val request = EndPointCategories.endpoint

    suspend fun getCategoriesNow() = request.getCategories()

}
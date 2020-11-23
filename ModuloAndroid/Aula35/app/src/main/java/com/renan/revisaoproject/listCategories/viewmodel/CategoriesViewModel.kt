package com.renan.revisaoproject.listCategories.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.renan.revisaoproject.listCategories.repository.CategoriesRepository
import kotlinx.coroutines.Dispatchers


class CategoriesViewModel(
    private val repository: CategoriesRepository
) : ViewModel() {

    var categoriesList: MutableList<String> = mutableListOf()

    fun obterCategorias() = liveData(Dispatchers.IO) {
        val lista = repository.getCategoriesNow()
        emit(lista)

    }

    class CategoriesViewModelFactory(
        private val respository: CategoriesRepository
    ):ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return CategoriesViewModel(respository) as T
        }

    }



}
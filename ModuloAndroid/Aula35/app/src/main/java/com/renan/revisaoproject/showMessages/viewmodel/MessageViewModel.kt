package com.renan.revisaoproject.showMessages.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.renan.revisaoproject.showMessages.repository.MessageRepository
import kotlinx.coroutines.Dispatchers

class MessageViewModel(
    private val repository: MessageRepository
) : ViewModel() {

    fun getMessage(categorie: String) = liveData(Dispatchers.IO) {
        val message = repository.getMessage(categorie);
        emit(message)
    }

    class MessageViewModelFactory(
        private val repository: MessageRepository
    ) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return MessageViewModel(repository) as T
        }

    }
}
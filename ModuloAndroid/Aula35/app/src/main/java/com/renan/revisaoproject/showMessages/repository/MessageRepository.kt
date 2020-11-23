package com.renan.revisaoproject.showMessages.repository

class MessageRepository {
    private val request = MessageEndPoint.endpointMessage

    suspend fun getMessage(categorie:String) = request.getMessage(categorie)
}
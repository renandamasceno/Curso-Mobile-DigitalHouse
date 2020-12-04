package com.renan.aula39.cartao.repository

import com.renan.aula39.cartao.dao.CartaoDao
import com.renan.aula39.cartao.entity.CartaoEntity

class CartaoRepository(private val cartaoDao: CartaoDao) {

    suspend fun addCartao(cartao: CartaoEntity) = cartaoDao.addCartao(cartao)

    suspend fun count() = cartaoDao.count()
}
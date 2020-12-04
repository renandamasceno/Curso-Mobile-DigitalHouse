package com.renan.aula39.cartao.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.renan.aula39.R
import com.renan.aula39.cartao.entity.CartaoEntity
import com.renan.aula39.cartao.repository.CartaoRepository
import com.renan.aula39.cartao.viewmodel.CartaoViewModel
import com.renan.aula39.db.AppDatabase

class CartaoFragment : Fragment() {
    lateinit var viewModel: CartaoViewModel
    lateinit var _view: View


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cartao, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _view = view
        viewModel = ViewModelProvider(
            this,
            CartaoViewModel.CartaoViewModelFactory(
                CartaoRepository(
                    AppDatabase.getDatabase(view.context).cartaoDao()
                )
            )
        ).get(CartaoViewModel::class.java)

        cadastrarCartao(CartaoEntity(0, "6723671222671", "Renan", "123", "11/11", "visa"))
        cadastrarCartao(CartaoEntity(0, "6723671222671", "Renan", "123", "11/11", "visa"))
        cadastrarCartao(CartaoEntity(0, "6723671222671", "Renan", "123", "11/11", "visa"))

    }

    fun cadastrarCartao(cartaoEntity: CartaoEntity) {
        viewModel.addCartao(
            CartaoEntity(0, "6723671222671", "Renan", "123", "11/11", "visa")
        ).observe(viewLifecycleOwner, {
            Log.i("PAGB", it.toString())

            viewModel.count().observe(viewLifecycleOwner, {
                _view.findViewById<TextView>(R.id.txtQuantidade).text = it.toString()
            })
        })
    }
}
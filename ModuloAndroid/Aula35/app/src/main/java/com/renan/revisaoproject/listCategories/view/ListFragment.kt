package com.renan.revisaoproject.listCategories.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.renan.revisaoproject.R
import com.renan.revisaoproject.listCategories.repository.CategoriesRepository
import com.renan.revisaoproject.listCategories.viewmodel.CategoriesViewModel


class ListFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController:NavController = Navigation.findNavController(view)

        val viewManager = LinearLayoutManager(view.context)
        val recyclerView = view.findViewById<RecyclerView>(R.id.myList)
        val listCategories = mutableListOf<String>()

        val viewAdapter = MyAdapter(listCategories){
            val bundle = bundleOf("categories" to it )
            navController.navigate(R.id.action_mainFragment_to_messagesFragment,bundle)
        }

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter

        }

        val viewModel = ViewModelProvider(this, CategoriesViewModel.CategoriesViewModelFactory(
            CategoriesRepository()
        )).get(CategoriesViewModel::class.java)

        viewModel.obterCategorias().observe(viewLifecycleOwner,{
            listCategories.addAll(it)
            viewAdapter.notifyDataSetChanged()
        })


    }
}
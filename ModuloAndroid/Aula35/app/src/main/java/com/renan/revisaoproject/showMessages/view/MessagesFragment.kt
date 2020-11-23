package com.renan.revisaoproject.showMessages.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.renan.revisaoproject.R
import com.renan.revisaoproject.showMessages.model.MessageModel
import com.renan.revisaoproject.showMessages.repository.MessageRepository
import com.renan.revisaoproject.showMessages.viewmodel.MessageViewModel
import com.squareup.picasso.Picasso


class MessagesFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_messages, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val categories = arguments?.getString("categories")

        val viewModel = ViewModelProvider(
            this, MessageViewModel.MessageViewModelFactory(
                MessageRepository()
            )
        ).get(MessageViewModel::class.java)

        viewModel.getMessage(categories!!).observe(viewLifecycleOwner, {
            showMessages(it, view)
        })

    }

    fun showMessages(it: MessageModel, view: View) {
        val icon = view.findViewById<ImageView>(R.id.imgMessage)
        val message = view.findViewById<TextView>(R.id.txtMessages)

        message.text = it.message
        Picasso.get()
            .load(it.icon)
            .into(icon)

    }

}
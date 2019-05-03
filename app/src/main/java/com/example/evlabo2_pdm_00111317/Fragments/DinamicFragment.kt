package com.example.evlabo2_pdm_00111317.Fragments

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.evlabo2_pdm_00111317.R
import kotlinx.android.synthetic.main.fragment_dinamic.view.*

class DinamicFragment : Fragment() {

    private var initColor: Int? = null
    private var listener: OnFragmentInteractionListener? = null

    companion object {

        fun newInstance(initColor: Int): DinamicFragment{
            val newFragment = DinamicFragment()
            newFragment.initColor = initColor
            return newFragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_dinamic, container, false)

        view.background_color.setBackgroundColor(this!!.initColor!!)

        return view
    }

    fun onButtonPressed() {
        listener?.onFragmentInteraction()
    }

    /*fun initSearchButton(container:View) = container.btn_search_pokemon.setOnClickListener {
        listenerTools?.searchPokemon(container.et_pokemon_name.text.toString())
    }*/

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }


    interface OnFragmentInteractionListener {
        fun onFragmentInteraction()
    }

}

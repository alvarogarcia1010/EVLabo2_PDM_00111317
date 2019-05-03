package com.example.evlabo2_pdm_00111317

import android.graphics.Color
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.evlabo2_pdm_00111317.Fragments.DinamicFragment
import com.example.evlabo2_pdm_00111317.Fragments.StaticFragment

class MainActivity : AppCompatActivity() , StaticFragment.OnFragmentInteractionListener, DinamicFragment.OnFragmentInteractionListener{

    var color = Color.rgb(255,0,0)

    override fun onFragmentStaticInteractionPrev() {
        if(color == Color.rgb(255,0,0))
        {
            color = Color.rgb(0,0,255)

        }else if (color == Color.rgb(0,255,0)){
            color = Color.rgb(255,0,0)
        }else{
            color = Color.rgb(0,255,0)

        }

        var myFragment = DinamicFragment.newInstance(color)
        supportFragmentManager.beginTransaction().replace(R.id.main_fragment, myFragment).commit()
    }

    override fun onFragmentStaticInteraction() {
        if(color == Color.rgb(255,0,0))
        {
            color = Color.rgb(0,255,0)
        }else if (color == Color.rgb(0,255,0)){
            color = Color.rgb(0,0,255)
        }else{
            color = Color.rgb(255,0,0)
        }
        var myFragment = DinamicFragment.newInstance(color)
        supportFragmentManager.beginTransaction().replace(R.id.main_fragment, myFragment).commit()
    }

    override fun onFragmentInteraction() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myFragment = DinamicFragment.newInstance(color)
        supportFragmentManager.beginTransaction().replace(R.id.main_fragment, myFragment).commit()

    }
}

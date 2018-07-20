package com.filzah.mvpsimplecalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), CalculateView {


    var presenter : CalculatePresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = CalculatePresenter(this)


        tnPlus.setOnClickListener{
            presenter!!.calculate(input1.text.toString(), input2.text.toString(),"+")
        }

        tnMinus.setOnClickListener{
            presenter!!.calculate(input1.text.toString(), input2.text.toString(),"-")
        }

        tnMultiply.setOnClickListener{
            presenter!!.calculate(input1.text.toString(), input2.text.toString(),"*")
        }

        tnDivide.setOnClickListener{
            presenter!!.calculate(input1.text.toString(), input2.text.toString(),"/")
        }
    }

    override fun hasil(hasil: String) {
        textHasil.text = hasil
    }

    override fun error(error: String) {
        Toast.makeText(this@MainActivity, "Fiil me!!", Toast.LENGTH_LONG).show()
    }
}

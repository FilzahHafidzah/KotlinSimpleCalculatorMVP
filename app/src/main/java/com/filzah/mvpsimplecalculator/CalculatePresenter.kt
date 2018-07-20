package com.filzah.mvpsimplecalculator

class CalculatePresenter (val main : CalculateView){

    fun calculate(input1 : String, input2 : String, operator : String){
        if (valid(input1, input2)){
            calculatereal(input1, input2, operator)
        }
        else main.error("may not empty!")
    }

    private fun calculatereal(input1: String, input2: String, operator: String) {
        val a1 = input1.toDouble()
        val a2 = input2.toDouble()

        when(operator){
            "+" -> main.hasil((a1 + a2).toString())
            "-" -> main.hasil((a1 - a2).toString())
            "*" -> main.hasil((a1 * a2).toString())
            "/" -> main.hasil((a1 / a2).toString())
        }
    }



    private fun valid(input1: String, input2: String): Boolean {
        return input1 !="" && input2 !=""
    }
}
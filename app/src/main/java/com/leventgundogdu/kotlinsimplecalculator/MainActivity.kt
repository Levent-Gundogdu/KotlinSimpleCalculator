package com.leventgundogdu.kotlinsimplecalculator

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.leventgundogdu.kotlinsimplecalculator.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences

    var number1 : Int? = null
    var number2 : Int? = null
    var result : Int? = null
    var resultCarrier : Int? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPreferences = this.getSharedPreferences("com.leventgundogdu.kotlinsimplecalculator", MODE_PRIVATE)

        resultCarrier = sharedPreferences.getInt("result", 0)

        if (resultCarrier == 0) {
            binding.resultText.text = "Result: "
        } else {
            binding.resultText.text = "Result : $resultCarrier"
        }

    }

    fun mySum(view : View) {

        number1 = binding.editTextNumber.text.toString().toIntOrNull()
        number2 = binding.editTextNumber2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {
            binding.resultText.text = "Error!"

        } else {
            result = number1!! + number2!!
            binding.resultText.text = "Result : $result"
            sharedPreferences.edit().putInt("result", result!!).apply()
        }

    }

    fun mySub(view: View) {

        number1 = binding.editTextNumber.text.toString().toIntOrNull()
        number2 = binding.editTextNumber2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {
            binding.resultText.text = "Error!"

        } else {
            result = number1!! - number2!!
            binding.resultText.text = "Result : $result"
            sharedPreferences.edit().putInt("result", result!!).apply()
        }

    }

    fun myMult(view: View) {

        number1 = binding.editTextNumber.text.toString().toIntOrNull()
        number2 = binding.editTextNumber2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {
            binding.resultText.text = "Error!"

        } else {
            result = number1!! * number2!!
            binding.resultText.text = "Result : $result"
            sharedPreferences.edit().putInt("result", result!!).apply()
        }

    }

    fun myDiv(view: View) {

        number1 = binding.editTextNumber.text.toString().toIntOrNull()
        number2 = binding.editTextNumber2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {
            binding.resultText.text = "Error!"

        } else {
            result = number1!! / number2!!
            binding.resultText.text = "Result : $result"
            sharedPreferences.edit().putInt("result", result!!).apply()
        }
    }

}
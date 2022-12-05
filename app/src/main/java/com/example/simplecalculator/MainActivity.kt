package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val View = binding.root
        setContentView(View)
        binding.calculate.setOnClickListener { calculating() }
    }
    private fun calculating() {
        val input1= binding.num1.text.toString()
        val num1= input1.toInt()
        val input2= binding.num2.text.toString()
        val num2= input2.toDouble()
        val selectedId = binding.options.checkedRadioButtonId
        val result = when(selectedId){
            binding.add.id ->{ num1 + num2}
            binding.sub.id ->{num1-num2}
            binding.div.id ->{num1/num2}
            else -> {num1*num2}
        }
        binding.result.text="The result : ${result.toString()}"
    }
}
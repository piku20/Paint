package com.example.paint

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.paint.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){

    private lateinit var binding:ActivityMainBinding
    private lateinit var canvasView: CanvasView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        canvasView = binding.canvasView

        binding.apply {
            colorButton.setOnClickListener{
                canvasView.setColor()
            }

            clearButton.setOnClickListener{
                canvasView.clearCanvas()
            }
        }
    }
}
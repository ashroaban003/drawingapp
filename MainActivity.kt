package com.example.drawingapplication

import android.graphics.Color
import android.graphics.Color.RED
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.drawingapplication.paintView.Companion.colorList
import com.example.drawingapplication.paintView.Companion.currentbrush
import com.example.drawingapplication.paintView.Companion.pathList

class MainActivity : AppCompatActivity() {
    companion object{
    var path = Path()
    var paintbrush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val red=findViewById<ImageButton>(R.id.redcolor)
        red.setOnClickListener{
            Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()
            paintbrush.color=Color.RED
            currentcolor(paintbrush.color)
        }

        val black=findViewById<ImageButton>(R.id.blackcolor)
        black.setOnClickListener{
            Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()
            paintbrush.color=Color.BLACK
            currentcolor(paintbrush.color)
        }
        val eraser=findViewById<ImageButton>(R.id.eraser)
        eraser.setOnClickListener{
            Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()
            paintbrush.color=Color.WHITE
            currentcolor(paintbrush.color)
        }
        val reset=findViewById<ImageButton>(R.id.clear)
        reset.setOnClickListener{
            Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()
        }

    }
    private fun currentcolor(color:Int){
        currentbrush=color
        path= Path()
    }
}

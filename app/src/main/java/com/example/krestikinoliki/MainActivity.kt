package com.example.krestikinoliki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Block()
    }

    fun Start(view: View){
        But1.text = ""
        But2.text = ""
        But3.text = ""
        But4.text = ""
        But5.text = ""
        But6.text = ""
        But7.text = ""
        But8.text = ""
        But9.text = ""
        OX = false
        XO = false
        X = "O"
        //____________________________________________
        But1.isEnabled = true
        But2.isEnabled = true
        But3.isEnabled = true
        But4.isEnabled = true
        But5.isEnabled = true
        But6.isEnabled = true
        But7.isEnabled = true
        But8.isEnabled = true
        But9.isEnabled = true

        start.isEnabled = false
    }
    fun Button(view: View){
        if(X == "X")
            X = "O"
        else
            X = "X"
        var button:Button = findViewById(view.id)
        button.text = X
        button.isEnabled = false
        Win()
        Win2()
        EnableStart()
    }
    fun Win(){
        if((But1.text=="X")&&(But2.text=="X")&&(But3.text == "X"))
            XO = true

        if((But4.text=="X")&&(But5.text=="X")&&(But6.text == "X"))
            XO = true

        if((But7.text=="X")&&(But8.text=="X")&&(But9.text == "X"))
            XO = true
//______________________________________________________________
        if((But1.text=="X")&&(But4.text=="X")&&(But7.text == "X"))
            XO = true

        if((But2.text=="X")&&(But5.text=="X")&&(But8.text == "X"))
            XO = true

        if((But3.text=="X")&&(But6.text=="X")&&(But9.text == "X"))
            XO = true
//______________________________________________________________
        if((But1.text=="X")&&(But5.text=="X")&&(But9.text == "X"))
            XO = true

        if((But3.text=="X")&&(But5.text=="X")&&(But7.text == "X"))
            XO = true

        if(XO == true) {
            Block()
            score += 1
            val toast = Toast.makeText(this@MainActivity, "Победа Крестиков!", Toast.LENGTH_LONG)
            toast.show()
            Score1.text ="Крестики: " + score + " | "
        }

    }

    fun Win2(){
        if((But1.text=="O")&&(But2.text=="O")&&(But3.text == "O"))
            OX = true

        if((But4.text=="O")&&(But5.text=="O")&&(But6.text == "O"))
            OX = true

        if((But7.text=="O")&&(But8.text=="O")&&(But9.text == "O"))
            OX = true

        if((But1.text=="O")&&(But4.text=="O")&&(But7.text == "O"))
            OX = true

        if((But2.text=="O")&&(But5.text=="O")&&(But8.text == "O"))
            OX = true

        if((But3.text=="O")&&(But6.text=="O")&&(But9.text == "O"))
            OX = true

        if((But1.text=="O")&&(But5.text=="O")&&(But9.text == "O"))
            OX = true

        if((But3.text=="O")&&(But5.text=="O")&&(But7.text == "O"))
            OX = true

        if(OX == true) {
            Block()
            score2 += 1
            val toast = Toast.makeText(this@MainActivity, "Победа ноликов!", Toast.LENGTH_LONG)
            toast.show()
            Score2.text ="Нолики: " + score2
        }

    }
    fun Block(){
        But1.isEnabled = false
        But2.isEnabled = false
        But3.isEnabled = false
        But4.isEnabled = false
        But5.isEnabled = false
        But6.isEnabled = false
        But7.isEnabled = false
        But8.isEnabled = false
        But9.isEnabled = false
        start.isEnabled = true
    }
    fun EnableStart(){
        if((But1.isEnabled == false)&&(But2.isEnabled == false)&&(But3.isEnabled == false)&&(But4.isEnabled == false)&&(But5.isEnabled == false)&&(But6.isEnabled == false)&&(But7.isEnabled == false)&&(But8.isEnabled == false)&&(But9.isEnabled == false)&&(OX == false)&&(XO == false)){
            start.isEnabled = true
            val toast = Toast.makeText(this@MainActivity, "Ничья!", Toast.LENGTH_LONG)
            toast.show()
        }
    }
    var score:Int = 0
    var X:String = "O"
    var OX:Boolean = false
    var score2:Int = 0
    var XO:Boolean = false
}

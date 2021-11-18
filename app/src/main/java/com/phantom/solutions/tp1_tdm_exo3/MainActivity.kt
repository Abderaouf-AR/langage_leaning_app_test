package com.phantom.solutions.tp1_tdm_exo3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val submitBtn = findViewById(R.id.submitBtn) as Button
        val wordField = findViewById(R.id.wordField) as EditText
        val scoreView = findViewById(R.id.scoreView) as TextView



        /*************************************/
        var userWord : String? = ""
        var score =0
        var randomWord =""
        var words = arrayOf("tool", "heal", "meal","cool","rear")//,"fear","near","hear","lean","mean","teen","seen")


        submitBtn.setOnClickListener {
            userWord = wordField.text.toString()
            if (userWord?.length == 4){

                val rndm = (0..(words.size-1)).random()
                randomWord = words.get(rndm)
                wordGenerated.text = randomWord

                if (randomWord == userWord){
                    Toast.makeText(this, " Bravo !!!! Vous avez obtenu 5 points, le \n" +
                            "score total est : $score points”.", Toast.LENGTH_SHORT).show()
                    score+=5
                    scoreView.text = score.toString()
                }else{
                    Toast.makeText(this,"Echec !!!!\n" +
                            "score total est : $score points”.", Toast.LENGTH_SHORT).show()
                }

            }else{
                Toast.makeText(this, " the word is not a 4 letter word \n", Toast.LENGTH_SHORT).show()
            }

        }





    }
}
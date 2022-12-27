package com.picker.texttospeech

import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {
    lateinit var mtts:TextToSpeech
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mtts = TextToSpeech(this) {
            mtts.language = Locale.ENGLISH
        }
    }

    fun onSpeech(view: View) {
        val tv = findViewById<TextView>(R.id.input)
        mtts.speak(tv.text, TextToSpeech.QUEUE_FLUSH, null, null)
    }
}
package edu.temple.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        // TODO Step 3: Extract transferred value and use for lyricsDisplayView text size
        with (findViewById<TextView>(R.id.lyricsDisplayTextView)) {

            // Get the selected text size from the intent
            val selectedTextSize = intent.getIntExtra("SELECTED_TEXT_SIZE", 10)

            // Set the text size of the lyricsDisplayTextView
            textSize = selectedTextSize.toFloat()
        }
    }

}
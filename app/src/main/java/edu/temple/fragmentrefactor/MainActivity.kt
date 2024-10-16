package edu.temple.fragmentrefactor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*

        // functionality: if nameEditText is blank,
        // show "Please enter your name" in displayTextView
        // else, show string of that textfield with greeting in displayTextView

        // move these to MianFragment
        val displayTextView = findViewById<TextView>(R.id.displayTextView)
        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val changeButton = findViewById<Button>(R.id.changeButton)


        changeButton.setOnClickListener {
            val name = nameEditText.text

            displayTextView.text = if (name.isNotBlank()) {
                "Hello, $name!"
            } else {
                "Please enter your name"
            }
        }

         */

        // Add MainFragment to tthe activity
        if (savedInstanceState == null) {
            // create MainFragment object
            // which performs the functionality performed by the original Activity
            val mainFragment = MainFragment()

            // supportFragmentManager and use transaction
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, mainFragment)
                .commit()   // invoke commit
        } // end
    }
}



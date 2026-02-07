package com.example.first_app_vertinsky_agapov

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.first_app_vertinsky_agapov.databinding.ActivityMainBinding
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.TextView
import androidx.core.view.WindowCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonRoll.setOnClickListener {
            val diceResult = Random.nextInt(1, 7)
            binding.resultTextView.text = getString(R.string.result_format, diceResult)
        }
    }
}






















      //  val buttonRoll = findViewById<Button>(R.id.buttonRoll)
     //   val resultTextView = findViewById<TextView>(R.id.resultTextView)

   //     buttonRoll.setOnClickListener {
    //        val diceResult = Random.nextInt(1, 7) // 1..6
     //       resultTextView.text = "Выпало: $diceResult"













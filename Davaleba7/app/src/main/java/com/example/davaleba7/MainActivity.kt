package com.example.davaleba7

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.text.method.DigitsKeyListener
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import androidx.annotation.RequiresApi
import com.example.davaleba7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @RequiresApi(Build.VERSION_CODES.S)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAddField.setOnClickListener {

            val userInput = binding.etFieldName.text.toString().trim()

            if (userInput.isNotEmpty()) {

                if (binding.checkbox.isChecked) {

                    val newEditText = EditText(this)

                    newEditText.hint = userInput
                    newEditText.inputType = InputType.TYPE_CLASS_NUMBER
                    //newEditText.inputType = InputType.TYPE_DATETIME_VARIATION_NORMAL

                    val params = LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                    )

                    val convertToDpStart = resources.displayMetrics.density.toInt() * 50
                    val convertToDpTop = resources.displayMetrics.density.toInt() * 40
                    val convertToDpEnd = resources.displayMetrics.density.toInt() * 40

                    params.setMargins(convertToDpStart, convertToDpTop, convertToDpEnd, 0)
                    newEditText.layoutParams = params
                    binding.mainLinearLayout.addView(newEditText)

                } else {


                    val newEditText = EditText(this)

                      newEditText.hint = userInput

                    val params = LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                    )

                    val convertToDpStart = resources.displayMetrics.density.toInt() * 50
                    val convertToDpTop = resources.displayMetrics.density.toInt() * 40
                    val convertToDpEnd = resources.displayMetrics.density.toInt() * 40

                    params.setMargins(convertToDpStart, convertToDpTop, convertToDpEnd, 0)
                    newEditText.layoutParams = params
                    binding.mainLinearLayout.addView(newEditText)
                }

            }

        }
    }

}
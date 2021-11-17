package com.example.new_kotlin_project

import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import com.example.new_kotlin_project.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }

    override fun onStart() {
        super.onStart()

        bindingClass.buttonStart.setOnClickListener {
            random()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.run {
            putInt("KEY", bindingClass.vegetableCounter.text.toString().toInt())
        }
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        bindingClass.vegetableCounter.text = savedInstanceState.getInt("KEY").toString()
    }

    private fun random() {
        when (Random.nextInt(1, 7)) {
            1 -> tomatoGame()
            2 -> carrotGame()
            3 -> cabbageGame()
            4 -> eggplantGame()
            5 -> turnipGame()
            6 -> cucumberGame()
            else -> return
        }
        bindingClass.buttonStart.visibility = View.INVISIBLE
        bindingClass.face.visibility = View.VISIBLE
    }

    private fun tomatoGame() {
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val tomatoNumber = Random.nextInt(1, 11)
        val tomatoText = listOf("помидор", "помидора", "помидоров")
        var count = 0
        val tomatoName: String = when (tomatoNumber) {
            1 -> tomatoText.elementAt(0)
            2, 3, 4 -> tomatoText.elementAt(1)
            else -> tomatoText.elementAt(2)
        }
        bindingClass.taskView.text = "Собери $tomatoNumber $tomatoName"
        bindingClass.tomatoButton.setOnClickListener {
            bindingClass.vegetableCounter.text = "${++count}"
            if (count == tomatoNumber) {
                bindingClass.textResult.text = getString(R.string.result)
                bindingClass.tomatoButton.visibility = View.INVISIBLE
                bindingClass.buttonNext.visibility = View.VISIBLE
            } else bindingClass.textResult.text = getString(R.string.error)
        }
        bindingClass.buttonNext.setOnClickListener {
            bindingClass.buttonNext.visibility = View.INVISIBLE
            random()
        }
    }

    private fun carrotGame() {
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val carrotNumber = Random.nextInt(1, 11)
        val carrotText = listOf("морковку", "морковки", "морковок")
        var count = 0
        val carrotName: String = when (carrotNumber) {
            1 -> carrotText.elementAt(0)
            2, 3, 4 -> carrotText.elementAt(1)
            else -> carrotText.elementAt(2)
        }
        bindingClass.taskView.text = "Собери $carrotNumber $carrotName"
        bindingClass.carrotButton.setOnClickListener {
            bindingClass.vegetableCounter.text = "${++count}"
            if (count == carrotNumber) {
                bindingClass.textResult.text = getString(R.string.result)
                bindingClass.carrotButton.visibility = View.INVISIBLE
                bindingClass.buttonNext.visibility = View.VISIBLE
            } else bindingClass.textResult.text = getString(R.string.error)
        }
        bindingClass.buttonNext.setOnClickListener {
            bindingClass.buttonNext.visibility = View.INVISIBLE
            random()
        }
    }

    private fun cabbageGame() {
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val cabbageNumber = Random.nextInt(1, 11)
        val cabbageText = listOf("капусту", "капусты", "капуст")
        var count = 0
        val cabbageName: String = when (cabbageNumber) {
            1 -> cabbageText.elementAt(0)
            2, 3, 4 -> cabbageText.elementAt(1)
            else -> cabbageText.elementAt(2)
        }
        bindingClass.taskView.text = "Собери $cabbageNumber $cabbageName"
        bindingClass.cabbageButton.setOnClickListener {
            bindingClass.vegetableCounter.text = "${++count}"
            if (count == cabbageNumber) {
                bindingClass.textResult.text = getString(R.string.result)
                bindingClass.cabbageButton.visibility = View.INVISIBLE
                bindingClass.buttonNext.visibility = View.VISIBLE
            } else bindingClass.textResult.text = getString(R.string.error)
        }
        bindingClass.buttonNext.setOnClickListener {
            bindingClass.buttonNext.visibility = View.INVISIBLE
            random()
        }
    }

    private fun eggplantGame() {
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val eggplantNumber = Random.nextInt(1, 11)
        val eggplantText = listOf("баклажан", "баклажана", "баклажанов")
        var count = 0
        val eggplantName: String = when (eggplantNumber) {
            1 -> eggplantText.elementAt(0)
            2, 3, 4 -> eggplantText.elementAt(1)
            else -> eggplantText.elementAt(2)
        }
        bindingClass.taskView.text = "Собери $eggplantNumber $eggplantName"
        bindingClass.eggplantButton.setOnClickListener {
            bindingClass.vegetableCounter.text = "${++count}"
            if (count == eggplantNumber) {
                bindingClass.textResult.text = getString(R.string.result)
                bindingClass.eggplantButton.visibility = View.INVISIBLE
                bindingClass.buttonNext.visibility = View.VISIBLE
            } else bindingClass.textResult.text = getString(R.string.error)
        }
        bindingClass.buttonNext.setOnClickListener {
            bindingClass.buttonNext.visibility = View.INVISIBLE
            random()
        }
    }

    private fun turnipGame() {
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val turnipNumber = Random.nextInt(1, 11)
        val turnipText = listOf("репку", "репки", "репок")
        var count = 0
        val turnipName: String = when (turnipNumber) {
            1 -> turnipText.elementAt(0)
            2, 3, 4 -> turnipText.elementAt(1)
            else -> turnipText.elementAt(2)
        }
        bindingClass.taskView.text = "Собери $turnipNumber $turnipName"
        bindingClass.turnipButton.setOnClickListener {
            bindingClass.vegetableCounter.text = "${++count}"
            if (count == turnipNumber) {
                bindingClass.textResult.text = getString(R.string.result)
                bindingClass.turnipButton.visibility = View.INVISIBLE
                bindingClass.buttonNext.visibility = View.VISIBLE
            } else bindingClass.textResult.text = getString(R.string.error)
        }
        bindingClass.buttonNext.setOnClickListener {
            bindingClass.buttonNext.visibility = View.INVISIBLE
            random()
        }
    }

    private fun cucumberGame() {
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val cucumberNumber = Random.nextInt(1, 11)
        val cucumberText = listOf("огурец", "огурца", "огурцов")
        var count = 0
        val cucumberName: String = when (cucumberNumber) {
            1 -> cucumberText.elementAt(0)
            2, 3, 4 -> cucumberText.elementAt(1)
            else -> cucumberText.elementAt(2)
        }
        bindingClass.taskView.text = "Собери $cucumberNumber $cucumberName"
        bindingClass.cucumberButton.setOnClickListener {
            bindingClass.vegetableCounter.text = "${++count}"
            if (count == cucumberNumber) {
                bindingClass.textResult.text = getString(R.string.result)
                bindingClass.cucumberButton.visibility = View.INVISIBLE
                bindingClass.buttonNext.visibility = View.VISIBLE
            } else bindingClass.textResult.text = getString(R.string.error)
        }
        bindingClass.buttonNext.setOnClickListener {
            bindingClass.buttonNext.visibility = View.INVISIBLE
            random()
        }
    }
}





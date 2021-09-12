package android.clicker.school_live_simulator.User_interface

import android.clicker.school_live_simulator.Classes.Enum_classes.Months
import android.clicker.school_live_simulator.Classes.GameDate.GameDate
import android.clicker.school_live_simulator.Game
import android.clicker.school_live_simulator.NormalMode
import android.clicker.school_live_simulator.Player
import android.clicker.school_live_simulator.R
import android.clicker.school_live_simulator.databinding.ActivityMainMenuBinding
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.util.*
import android.graphics.Color.*
import androidx.core.content.ContextCompat

class MainMenuActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (Game.isDefaultLanguage) {
//            Game.locale = resources.configuration.locale.toString().take(2)
            Game.locale = Locale.getDefault().toString().take(2)
        }
        else {
            Game.setLocale(resources, this@MainMenuActivity)
        }
        binding = ActivityMainMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        when(Game.locale){
            "ru" -> binding.RussianButton.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_dark))
            else -> binding.EnglishButton.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_dark))
        }
        Game.context_bundle.context = this.applicationContext
    }

    fun onClickContinueGame(view: View) {
        val intent = Intent(this, GameActivity::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.start_activity_1, R.anim.start_activity_2)
        Game.load(this.applicationContext.filesDir)
    }

    fun onClickNewGame(view: View){
        /**
         * Assign defaults to all properties of Game
         */
        Game.difficulty_state = NormalMode
        Game.counters = mutableMapOf()
        Game.player = Player()
        Game.game_date = GameDate(1, Months.September, 2009)

        /**
         * start GameActivity
         */
        val intent = Intent(this, GameActivity::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.start_activity_1, R.anim.start_activity_2)
    }
    fun onClickRussianLanguage(view: View){
        Game.locale = "ru"
        Game.isDefaultLanguage = false
        this.recreate()
    }
    fun onClickEnglishLanguage(view: View){
        Game.locale = "en"
        Game.isDefaultLanguage = false
        this.recreate()
    }
    fun onClickAboutGame(view: View){
        val intent = Intent(this, MyItemRecyclerViewAdapter::class.java)
        startActivity(intent)
    }
    fun onClickRateGame(view: View){
        TODO("There should be placed code for link")
    }
}

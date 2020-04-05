package com.samuelpampolini.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.samuelpampolini.swoosh.Model.Player
import com.samuelpampolini.swoosh.R
import com.samuelpampolini.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    private lateinit var player: Player

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onBallerClick(view: View) {
        beginnerSkillBtn.isChecked = false

        player.skill = "baller"
    }

    fun onBeginnerClick(view: View) {
        ballerSkillBtn.isChecked = false

        player.skill = "beginner"
    }

    fun onFinishClick(view: View) {
        if(player.skill == "") {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
            return
        }

        val finishActivity = Intent(this, FinishActivity::class.java)
        finishActivity.putExtra(EXTRA_PLAYER, player)
        startActivity(finishActivity)
    }
}

package com.samuelpampolini.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.samuelpampolini.swoosh.Utilities.EXTRA_LEAGUE
import com.samuelpampolini.swoosh.R
import com.samuelpampolini.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBallerClick(view: View) {
        beginnerSkillBtn.isChecked = false

        skill = "baller"
    }

    fun onBeginnerClick(view: View) {
        ballerSkillBtn.isChecked = false

        skill = "beginner"
    }

    fun onFinishClick(view: View) {
        if(skill == "") {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
            return
        }

        val finishActivity = Intent(this, FinishActivity::class.java)
        finishActivity.putExtra(EXTRA_SKILL, skill)
        finishActivity.putExtra(EXTRA_LEAGUE, league)
        startActivity(finishActivity)
    }
}

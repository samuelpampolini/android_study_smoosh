package com.samuelpampolini.swoosh.Controller

import android.os.Bundle
import com.samuelpampolini.swoosh.Utilities.EXTRA_LEAGUE
import com.samuelpampolini.swoosh.R

class SkillActivity : BaseActivity() {
    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }
}

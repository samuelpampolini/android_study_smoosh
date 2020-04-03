package com.samuelpampolini.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.samuelpampolini.swoosh.R
import com.samuelpampolini.swoosh.Utilities.EXTRA_LEAGUE
import com.samuelpampolini.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        league = intent.getStringExtra(EXTRA_LEAGUE)
        skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "Looking for $league $skill league near you..."
    }
}

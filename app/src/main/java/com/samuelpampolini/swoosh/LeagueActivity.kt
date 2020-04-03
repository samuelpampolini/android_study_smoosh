package com.samuelpampolini.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View) {
        if(selectedLeague == "") {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
            return
        }

        var skillActivity = Intent(this, SkillActivity::class.java)
        skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
        startActivity(skillActivity)
    }

    fun onMensClicked(view: View) {
        womensLeagueBtn.isChecked = false
        coEdLeagueBtn.isChecked = false

        selectedLeague = "mens"
    }

    fun onWomensClicked(view: View) {
        mensLeagueBtn.isChecked = false
        coEdLeagueBtn.isChecked = false

        selectedLeague = "womens"
    }

    fun onCoEdClicked(view: View) {
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        selectedLeague = "co-ed"
    }
}

package ks.hs.dgsw.toss.ui.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import ks.hs.dgsw.toss.R

class RemitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_remit)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishActivity()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finishActivity()
            }
        }

        return super.onOptionsItemSelected(item)
    }

    private fun finishActivity() {
        if (supportFragmentManager.backStackEntryCount == 0) {
            finish()
            overridePendingTransition(R.anim.pop_slide_in_left, R.anim.pop_slide_out_right)
        }
    }
}
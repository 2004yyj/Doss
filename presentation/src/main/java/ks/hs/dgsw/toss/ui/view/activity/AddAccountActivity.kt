package ks.hs.dgsw.toss.ui.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import ks.hs.dgsw.toss.R

@AndroidEntryPoint
class AddAccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_account)

        viewModelStore.clear()
    }
}
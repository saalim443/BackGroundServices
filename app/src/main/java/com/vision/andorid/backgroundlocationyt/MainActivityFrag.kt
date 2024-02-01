package com.vision.andorid.backgroundlocationyt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivityFrag : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_frag)
        // Replace the fragment container with BlankFragment
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, BlankFragment.newInstance("param1", "param2"))
            .commit()
    }
}
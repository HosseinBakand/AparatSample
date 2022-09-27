package com.hb.aparatviewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hb.aparatviewer.data.api.VideoApi
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var api:VideoApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
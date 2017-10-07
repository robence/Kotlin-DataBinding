package com.example.user.kotlinexample

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.user.kotlinexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.apply {
            repositoryName.text = "Medium Android Repository Article"
            repositoryOwner.text = "Fleka"
            numberOfStars.text = "1000"
        }

        var repository = Repository("Medium Android Repository Article",
                "Fleka", 2000, true)

        Handler().postDelayed({ repository.repositoryName="New Name" }, 2000)


    }

}
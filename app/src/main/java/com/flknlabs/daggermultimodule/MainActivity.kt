package com.flknlabs.daggermultimodule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.flknlabs.calculator.ui.CalculatorActivity
import com.flknlabs.core.modes.AppSubscription
import com.flknlabs.daggermultimodule.di.provider.ApplicationComponentProvider
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var appSubscription: AppSubscription

    lateinit var subscriptionTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as ApplicationComponentProvider)
            .getApplicationComponent()
            .inject(this)

        bindViews()
        bindListeners()

        showSubscription()
    }

    private fun showSubscription() {
        subscriptionTextView.text = appSubscription.getUserSubscription()
    }

    private fun startCalculatorActivity() {
        startActivity(
            Intent(this, CalculatorActivity::class.java)
        )
    }

    private fun bindViews() {
        subscriptionTextView = findViewById(R.id.subscription_type_textview)
    }

    private fun bindListeners() {
        findViewById<Button>(R.id.calculator_button).setOnClickListener {
            startCalculatorActivity()
        }
    }
}
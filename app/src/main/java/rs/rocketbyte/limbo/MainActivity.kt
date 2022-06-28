package rs.rocketbyte.limbo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import rs.rocketbyte.handyextensions.R
import rs.rocketbyte.limbo.ext.isLimbo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        isLimbo()
    }
}
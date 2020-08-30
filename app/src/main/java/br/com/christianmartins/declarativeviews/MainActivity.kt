package br.com.christianmartins.declarativeviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.facebook.litho.ComponentContext
import com.facebook.litho.LithoView
import com.facebook.litho.widget.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        val componentContext = ComponentContext(this)
        val component = Text.create(componentContext)
            .text("- Test -")
            .textSizeDip(50f)
            .build()

        setContentView(LithoView.create(componentContext, component))
    }
}
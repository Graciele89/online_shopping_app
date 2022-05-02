package ie.dorset.student_22711.onlineshoppingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //in build gradle is necessary to add android-kotlin-extensions for use kotlin synthetics
        login_button.setOnClickListener {
           // Toast.makeText(this,"Button Clicked", Toast.LENGTH_LONG).show()
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        signUp_button.setOnClickListener{
        val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        exit_button.setOnClickListener{
            finishAffinity()
        }



        // in case i want use Kotlin synthetics:
      //  val loginButton = findViewById<Button>(R.id.login_button)
      //  loginButton
    }
}
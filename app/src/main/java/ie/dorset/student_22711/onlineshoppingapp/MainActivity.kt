package ie.dorset.student_22711.onlineshoppingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //in build gradle is necessary to add android-kotlin-extensions for use kotlin synthetics
        loginButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        signUpButton.setOnClickListener{
        val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        forgotPassword.setOnClickListener{
            val intent = Intent(this, ForgotPwdActivity::class.java)
            startActivity(intent)
        }

        exitButton.setOnClickListener{
            finishAffinity()

        }



        // Toast.makeText(this,"Button Clicked", Toast.LENGTH_LONG).show()
        // in case i want use Kotlin synthetics:
      //  val loginButton = findViewById<Button>(R.id.login_button)
      //  loginButton
    }
}
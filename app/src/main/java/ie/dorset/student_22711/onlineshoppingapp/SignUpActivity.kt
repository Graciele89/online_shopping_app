package ie.dorset.student_22711.onlineshoppingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import ie.dorset.student_22711.onlineshoppingapp.databinding.ActivitySignUpBinding
import kotlinx.android.synthetic.main.activity_main.*

class SignUpActivity: AppCompatActivity() {

    private lateinit var binding:ActivitySignUpBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.textViewBottomSignIn.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.buttonSignUp.setOnClickListener{
            val email = binding.emailText.text.toString()
            val pwd = binding.pwdText.text.toString()
            val confirmPwd = binding.confirmPwd.text.toString()

            if (email.isNotEmpty() && pwd.isNotEmpty() && confirmPwd.isNotEmpty()){
                if (pwd == confirmPwd) {
                    firebaseAuth.createUserWithEmailAndPassword(email, pwd).addOnCompleteListener{
                        if (it.isSuccessful){
                            val intent = Intent(this, LoginActivity::class.java)
                            startActivity(intent)
                        }else{
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_LONG).show()
                        }
                    }

                 }else{
                Toast.makeText(this, "Sorry, password doesn't match", Toast.LENGTH_LONG).show()
                }
            }else{
                Toast.makeText(this, "This field can NOT be empty", Toast.LENGTH_LONG).show()
            }

        }
    }
}
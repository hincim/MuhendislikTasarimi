package com.example.muhendisliktasarimi.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.muhendisliktasarimi.MainActivity
import com.example.muhendisliktasarimi.R
import com.example.muhendisliktasarimi.databinding.ActivitySignUpBinding
import com.example.muhendisliktasarimi.databinding.ActivitySolveQuestionBinding
import com.google.firebase.auth.FirebaseAuth

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.emailLayout.boxStrokeColor = ContextCompat.getColor(this, R.color.black)
        binding.passwordLayout.boxStrokeColor = ContextCompat.getColor(this, R.color.black)
        binding.passwordAgainLayout.boxStrokeColor = ContextCompat.getColor(this, R.color.black)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.signUpBtn.setOnClickListener {
            val email = binding.emailInput.text.toString().trim()
            val password = binding.passwordInput.text.toString().trim()
            val passwordAgain = binding.passwordAgainInput.text.toString().trim()


            if (email.isNotEmpty() && password.isNotEmpty() && passwordAgain.isNotEmpty()){
                if (password == passwordAgain){
                    binding.progressBar3.visibility = View.VISIBLE
                    binding.linearLayout.visibility = View.GONE
                    firebaseAuth.createUserWithEmailAndPassword(email,password)
                        .addOnFailureListener {
                            Toast.makeText(this,"Hata", Toast.LENGTH_SHORT).show()
                            binding.linearLayout.visibility = View.VISIBLE
                            binding.progressBar3.visibility = View.GONE
                        }
                        .addOnCompleteListener {
                            if (it.isSuccessful){
                                binding.progressBar3.visibility = View.GONE
                                Toast.makeText(this,"Kayıt oluşturuldu", Toast.LENGTH_SHORT).show()
                                startActivity(Intent(this,MainActivity::class.java))
                                ActivityCompat.finishAffinity(this)
                            }else if(it.exception!!.message == "The email address is already in use by another account."){
                                Toast.makeText(this,"Aynı hesapla kullanıcı var", Toast.LENGTH_SHORT).show()
                                binding.linearLayout.visibility = View.VISIBLE
                            }else if (it.exception!!.message == "The email address is badly formatted."){
                                Toast.makeText(this,"Geçerli bir email adresi girin", Toast.LENGTH_SHORT).show()
                            }else{
                                Toast.makeText(this,"Hata", Toast.LENGTH_SHORT).show()
                                binding.linearLayout.visibility = View.VISIBLE
                            }
                        }
                }else{
                    Toast.makeText(this,"Şifreler aynı değil", Toast.LENGTH_SHORT).show()
                }

            }else{
                Toast.makeText(this,"Boş alanları doldurun", Toast.LENGTH_SHORT).show()
            }

        }
    }
}
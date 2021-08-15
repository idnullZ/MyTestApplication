package idnull.znz.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.appcompat.app.AppCompatActivity
import idnull.znz.myapplication.utils.RegistrationUtils

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var editTextConfirmedPassword: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextEmail = findViewById(R.id.editText_login)
        editTextPassword = findViewById(R.id.edit_text_password)
        editTextConfirmedPassword = findViewById(R.id.edit_text_confirmedpassword)
        button = findViewById(R.id.buttonLogin)


    }

    override fun onStart() {
        super.onStart()
        button.setOnClickListener {
           val result =  login()
            if(result){
                Toast.makeText(this,"login ok ", LENGTH_LONG).show()
            }else{

                Toast.makeText(this,"eror ", LENGTH_LONG).show()
            }
        }
    }





    fun login():Boolean{
        val name = editTextEmail.text.toString()
        val password = editTextPassword.text.toString()
        val confirmedPassword = editTextPassword.text.toString()

       return RegistrationUtils.validateRegistrationUtils(
            username = name,
            password = password,
            confirmedPassword = confirmedPassword
        )

    }


}
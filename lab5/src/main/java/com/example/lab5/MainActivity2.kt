package com.example.androidcamera
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.RemoteActionCompatParcelizer
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //button click to get input and call sendEmail method
        sendEmailBtn.setOnClickListener {
            //get input from EditTexts and save in variables
            val mail = mail.text.toString().trim()
            val subject = subject.text.toString().trim()
            val message = message.text.toString().trim()

            //method call for email intent with these inputs as parameters
            sendEmail(mail, subject, message)
        }
    }
        }
private fun sendEmail(mail: String, subject: String, message: String) {
    /*ACTION_SEND action to launch an email client installed on your Android device.*/
    val mIntent = Intent(Intent.ACTION_SEND)
    /*To send an email you need to specify mailto: as URI using setData() method
    and data type will be to text/plain using setType() method*/
    mIntent.data = Uri.parse("mailto:")
    mIntent.type = "text/plain"
    // put recipient email in intent
    /* recipient is put as array because you may wanna send email to multiple emails
       so enter comma(,) separated emails, it will be stored in array*/
    mIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(mail))
    //put the Subject in the intent
    mIntent.putExtra(Intent.EXTRA_SUBJECT, subject)
    //put the message in the intent
    mIntent.putExtra(Intent.EXTRA_TEXT, message)


    try {
        //start email intent
        startActivity(Intent.createChooser(mIntent, "Choose Email Client..."))
    }
    catch (e: Exception){
        //if any thing goes wrong for example no email client application or any exception
        //get and show exception message
        Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
    }


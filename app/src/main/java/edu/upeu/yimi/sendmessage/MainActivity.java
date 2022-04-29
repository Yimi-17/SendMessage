package edu.upeu.yimi.sendmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    //Definiendo Variables

    Button btnSend;
    EditText numberPhone, message;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Asignando Variables
        btnSend=findViewById(R.id.btnSend);
        numberPhone=findViewById(R.id.numberPhone);
        message=findViewById(R.id.message);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                SmsManager sms=SmsManager.getDefault();
                sms.sendTextMessage(numberPhone.getText().toString(),null, message.getText().toString(),null,null);
                Toast.makeText(MainActivity.this, "Message Sent Successfully", Toast.LENGTH_SHORT).show();

            }
        });


    }

    }

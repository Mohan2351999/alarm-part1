package com.example.axu1.richarddawkinsalarmclock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Phone_Activity extends AppCompatActivity {

    EditText phone_num;
    String pnum;
    TextView sample;
    Button set;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_);
        phone_num=(EditText)findViewById(R.id.phone_number);
        sample=(TextView)findViewById(R.id.sample);
        set=(Button)findViewById(R.id.set);



        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SimpleDateFormat sdf =  new SimpleDateFormat("HH:mm:ss");
                final String str= sdf.format(new Date());

                pnum=phone_num.getText().toString();
                sample.setText("The number is :" +str);
            }
        });
    }
}

package com.gmail.sakthikavin.vera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btnleader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnleader=(Button)findViewById(R.id.btnleader);
    }
    public void getdata(View view)
    {
            Intent myintent=new Intent(this,Main2Activity.class);
            startActivity(myintent);

    }
}

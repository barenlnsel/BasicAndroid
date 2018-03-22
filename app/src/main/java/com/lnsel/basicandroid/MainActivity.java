package com.lnsel.basicandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button btn_next;
    EditText etn_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_next=(Button)findViewById(R.id.btn_next);
        etn_text=(EditText)findViewById(R.id.etn_text);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*String text=etn_text.getText().toString();
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("w",text);
                startActivity(intent);
                finish();*/



                Intent intent=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);

            }
        });
    }
}

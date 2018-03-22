package com.lnsel.basicandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView tv_title;
    Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv_title=(TextView)findViewById(R.id.tv_title);

        String text = getIntent().getStringExtra("w");
        tv_title.setText(text);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);


        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Title");
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_logout) {
           Toast.makeText(getApplicationContext(),"Logout click",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(SecondActivity.this,MainActivity.class);
            startActivity(intent);
           return true;
        }

        if(id == R.id.action_about){
            Toast.makeText(getApplicationContext(),"about click",Toast.LENGTH_SHORT).show();
            return true;
        }

        if(id == R.id.action_change_password){
            Toast.makeText(getApplicationContext(),"change password click",Toast.LENGTH_SHORT).show();
            return true;
        }

        if(id == android.R.id.home){
            Toast.makeText(getApplicationContext(),"back click",Toast.LENGTH_SHORT).show();
            return true;
        }


        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent intent=new Intent(SecondActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
        Toast.makeText(getApplicationContext(),"Back button press",Toast.LENGTH_SHORT).show();
    }
}

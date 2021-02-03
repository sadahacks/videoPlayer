package com.sidzee.sidzeevideoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splish extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splish);

        Thread td=new Thread(){
            public void run()
            {
                try{
                    sleep(2000);
                }catch(Exception ex)
                {
                    ex.printStackTrace();
                }finally
                {
                    Intent it=new Intent(Splish.this,MainActivity.class);
                    startActivity(it);
                }
            }
        };td.start();


    }
}

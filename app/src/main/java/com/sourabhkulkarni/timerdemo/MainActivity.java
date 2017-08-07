package com.sourabhkulkarni.timerdemo;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000,1000){
        public void onTick(long millisecUntilDone){
            // Count is on
            Log.i("Sec left", String.valueOf(millisecUntilDone/1000));

        }
        public void onFinish(){

            //Count is finished
            Log.i("Sec left", "Done");

        }



        }.start();
    }
/*
        final Handler handler=new Handler();
        Runnable run=new Runnable() {
            @Override
            public void run() {

                Log.i("Run ", "A sec is done");
            handler.postDelayed(this,1000);

            }
        };
        handler.post(run);

    }
    */
}

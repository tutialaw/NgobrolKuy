package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        super.setHideActionBar();
        splsh();
    }

    private void splsh()
    {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                PrefManager prefManager = new PrefManager(getApplicationContext());
                Intent intent;
                if (prefManager.getISLogged_IN())
                {
                    intent = new Intent(getApplicationContext(), RegisterActivity.class);
                }else{
                    intent = new Intent(getApplicationContext(), LoginActivity.class);
                }
                startActivity(intent);
            }
        }, AppConfig.THREE_DELAY);
    }

}
package com.responsi.ngobrolkuy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    Button sign_up;
    MaterialEditText username, email, password, konfirpass;

}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        super.setHideActionBar();
        init();
        event();
        registerSession();
        sign_up=findViewById(R.id.regist);

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(pindah);
            }
        });

    }
}
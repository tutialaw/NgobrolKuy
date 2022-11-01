package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class InputProfileActivity extends AppCompatActivity {
    private CircleImageView civprofil;
    private TextView tvhomep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_profile);

        civprofil=findViewById(R.id.profilePic);
        Bundle extras=getIntent().getExtras();
        if (extras != null){
            if (extras.getString("hasil_profile")!=null){
                Uri myUri =Uri.parse(extras.getString("hasil_profile"));
                civprofil.setImageURI(myUri);
            }

        }else {
            Toast.makeText(this, "Intent is missing", Toast.LENGTH_SHORT).show();
        }

        public void handleView (View view) {
            Uri url= Uri.parse(tvhomep.getText().toString());
            Intent intent = new Intent(Intent.ACTION_VIEW, url);
            startActivity(intent);
        }
    }
}
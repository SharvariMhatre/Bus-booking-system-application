package com.example.busbook;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.dhaval2404.imagepicker.ImagePicker;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;

public class ProfilePageActivity extends AppCompatActivity {

    ImageView profile_1;
    FloatingActionButton fab;
    ImageButton lm;
    TextView d1,d2,d3;
    String s,s1,s2;
    Button lg,lgt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_page);

        profile_1=findViewById(R.id.profile_image);
        fab=findViewById(R.id.fab_cam);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ImagePicker.with(ProfilePageActivity.this)
                        .crop()
                        //Crop image(Optional), Check Customization for more option
                        /*.compress(1024)			//Final image size will be less than 1 MB(Optional)
                        .maxResultSize(1080, 1080)	//Final image resolution will be less than 1080 x 1080(Optional)*/
                        .start();


            }
        });

        //logout

        lgt=findViewById(R.id.goto_lgout);
        lgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
        });





     //profile details display

        d1=findViewById(R.id.display_us);
        s=getIntent().getStringExtra("msg_1");
        d1.setText(s);

        d2=findViewById(R.id.display_us2);
        s1=getIntent().getStringExtra("msg_2");
        d2.setText(s1);

        d3=findViewById(R.id.display_us3);
        s2=getIntent().getStringExtra("msg_3");
        d3.setText(s2);

     //location page

        lm=findViewById(R.id.locate_me);
            lm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(ProfilePageActivity.this,LocationpageActivity.class);
                    startActivity(intent);
                }
            });

     //profile details display

        lg=findViewById(R.id.goto_lg);
            lg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    Intent intent=new Intent(ProfilePageActivity.this,MainActivity.class);
                    startActivity(intent);
                }
            });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Uri uri=data.getData();
        profile_1.setImageURI(uri);

    }


}
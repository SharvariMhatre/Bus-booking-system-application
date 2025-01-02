package com.example.busbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinalpageActivity extends AppCompatActivity
{

    Button homepg;
    TextView fd1, fd2, fd3, fd4, fd5;
    String a1,a2,a3,a4,a5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finalpage);

        homepg=findViewById(R.id.home_page);
            homepg.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Intent intent=new Intent(FinalpageActivity.this,BusSearchPageActivity.class);
                    startActivity(intent);
                }
            });
//display the bus details from the prev pg
        fd1=findViewById(R.id.display_cvtv_11);
        a1=getIntent().getStringExtra("mssg1");
        fd1.setText(a1);

        fd2=findViewById(R.id.display_cvtv_12);
        a2=getIntent().getStringExtra("mssg2");
        fd2.setText(a2);

        fd3=findViewById(R.id.display_cvtv_13);
        a3=getIntent().getStringExtra("mssg3");
        fd3.setText(a3);

        fd4=findViewById(R.id.display_cvtv_14);
        a4=getIntent().getStringExtra("mssg4");
        fd4.setText(a4);

        fd5=findViewById(R.id.display_cvtv_15);
        a5=getIntent().getStringExtra("mssg5");
        fd5.setText(a5);
//display the bus details from the prev pg
    }
}
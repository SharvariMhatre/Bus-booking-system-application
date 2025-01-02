package com.example.busbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TicketconfirmationpageActivity extends AppCompatActivity {

    Button npg;
    TextView location_5, location_6, dates_1, dis1, dis2, dis3, dis4, dis5,a1,a2,a3,a4,a5;
    String desti_5, desti_6, date_display_2, dc1, dc2, dc3, dc4, dc5;
    ImageView m3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ticketconfirmationpage);

        a1=findViewById(R.id.display_cvtv_01);
        a2=findViewById(R.id.display_cvtv_02);
        a3=findViewById(R.id.display_cvtv_03);
        a4=findViewById(R.id.display_cvtv_04);
        a5=findViewById(R.id.display_cvtv_05);
        npg=findViewById(R.id.con_btn);
            npg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    startActivity(new Intent(TicketconfirmationpageActivity.this,FinalpageActivity.class).putExtra("mssg1","" +a1.getText().toString()).putExtra("mssg1","" +a1.getText().toString()).putExtra("mssg2","" +a2.getText().toString()).putExtra("mssg3","" +a3.getText().toString()).putExtra("mssg4","" +a4.getText().toString()).putExtra("mssg5","" +a5.getText().toString()));
                }
            });



        //arrow to backup
        m3=findViewById(R.id.arrow_3);
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TicketconfirmationpageActivity.this,BookingPageActivity.class);
                startActivity(intent);
            }
        });
        //arrow to backup

        //display ticket and other details

        location_5=findViewById(R.id.tv_place5);
        desti_5=getIntent().getStringExtra("msgs1");
        location_5.setText(desti_5);

        location_6=findViewById(R.id.tv_place6);
        desti_6=getIntent().getStringExtra("msgs2");
        location_6.setText(desti_6);

        dates_1=findViewById(R.id.tv_8);
        date_display_2=getIntent().getStringExtra("msgs3");
        dates_1.setText(date_display_2);

        //display ticket and other details

        //seat1 cardview

        dis1=findViewById(R.id.display_cvtv_01);
        dc1=getIntent().getStringExtra("msgs4");
        dis1.setText(dc1);

        dis2=findViewById(R.id.display_cvtv_02);
        dc2=getIntent().getStringExtra("msgs5");
        dis2.setText(dc2);

        dis3=findViewById(R.id.display_cvtv_03);
        dc3=getIntent().getStringExtra("msgs6");
        dis3.setText(dc3);

        dis4=findViewById(R.id.display_cvtv_04);
        dc4=getIntent().getStringExtra("msgs7");
        dis4.setText(dc4);

        dis5=findViewById(R.id.display_cvtv_05);
        dc5=getIntent().getStringExtra("msgs8");
        dis5.setText(dc5);

        //seat1 cardview
    }
}
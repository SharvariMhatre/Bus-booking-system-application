package com.example.busbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class BusSelectionPageActivity extends AppCompatActivity {

    TextView location_1, location_2, date_display, desti_3, desti_4, date_display_1, cvtv_11, cvtv_12, cvtv_13, cvtv_14, cvtv_15, cvtv_21, cvtv_22, cvtv_23, cvtv_24, cvtv_25, cvtv_31, cvtv_32, cvtv_33, cvtv_34, cvtv_35, cvtv_41, cvtv_42, cvtv_43, cvtv_44, cvtv_45, cvtv_51, cvtv_52, cvtv_53, cvtv_54, cvtv_55;
    String desti, desti_1,date;

    ImageView m1;

    CardView c_1,c_2,c_3,c_4,c_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bus_selection_page);

        // text view display for the detination and from

        location_1=findViewById(R.id.tv_place1);
        desti=getIntent().getStringExtra("message_1");
        location_1.setText(desti);


        location_2=findViewById(R.id.tv_place2);
        desti_1=getIntent().getStringExtra("message_2");
        location_2.setText(desti_1);

        date_display=findViewById(R.id.tv_3);
        date=getIntent().getStringExtra("message_3");
        date_display.setText(date);


        // text view display for the detination and from


        //arrow to backup
        m1=findViewById(R.id.arrow_1);
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BusSelectionPageActivity.this,BusSearchPageActivity.class);
                startActivity(intent);
            }
        });
        //arrow to backup


//bus selection passthrough connection

        desti_3=findViewById(R.id.tv_place1);
        desti_4=findViewById(R.id.tv_place2);
        date_display_1=findViewById(R.id.tv_3);
        cvtv_11=findViewById(R.id.cv_1_tv_1);
        cvtv_12=findViewById(R.id.cv_1_tv_2);
        cvtv_13=findViewById(R.id.cv_1_tv_3);
        cvtv_14=findViewById(R.id.cv_1_tv_4);
        cvtv_15=findViewById(R.id.cv_1_tv_5);
        c_1=findViewById(R.id.cv_1);
        c_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BusSelectionPageActivity.this,BookingPageActivity.class).putExtra("message_4",""+desti_3.getText().toString()).putExtra("message_5",""+desti_4.getText().toString()).putExtra("message_6",""+date_display_1.getText().toString())

                        .putExtra("message_9",""+cvtv_11.getText().toString()) .putExtra("message_10",""+cvtv_12.getText().toString()) .putExtra("message_11",""+cvtv_13.getText().toString()) .putExtra("message_12",""+cvtv_14.getText().toString()) .putExtra("message_13",""+cvtv_15.getText().toString()));
            }
        });

        desti_3=findViewById(R.id.tv_place1);
        desti_4=findViewById(R.id.tv_place2);
        date_display_1=findViewById(R.id.tv_3);
        cvtv_21=findViewById(R.id.cv_2_tv_1);
        cvtv_22=findViewById(R.id.cv_2_tv_2);
        cvtv_23=findViewById(R.id.cv_2_tv_3);
        cvtv_24=findViewById(R.id.cv_2_tv_4);
        cvtv_25=findViewById(R.id.cv_2_tv_5);
        c_2=findViewById(R.id.cv_2);
        c_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(BusSelectionPageActivity.this,BookingPageActivity.class).putExtra("message_4",""+desti_3.getText().toString()).putExtra("message_5",""+desti_4.getText().toString()).putExtra("message_6",""+date_display_1.getText().toString())

                .putExtra("message_9",""+cvtv_21.getText().toString()) .putExtra("message_10",""+cvtv_22.getText().toString()) .putExtra("message_11",""+cvtv_23.getText().toString()) .putExtra("message_12",""+cvtv_24.getText().toString()) .putExtra("message_13",""+cvtv_25.getText().toString()));
            }
        });


        desti_3=findViewById(R.id.tv_place1);
        desti_4=findViewById(R.id.tv_place2);
        date_display_1=findViewById(R.id.tv_3);
        cvtv_31=findViewById(R.id.cv_3_tv_1);
        cvtv_32=findViewById(R.id.cv_3_tv_2);
        cvtv_33=findViewById(R.id.cv_3_tv_3);
        cvtv_34=findViewById(R.id.cv_3_tv_4);
        cvtv_35=findViewById(R.id.cv_3_tv_5);
        c_3=findViewById(R.id.cv_3);
        c_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BusSelectionPageActivity.this,BookingPageActivity.class).putExtra("message_4",""+desti_3.getText().toString()).putExtra("message_5",""+desti_4.getText().toString()).putExtra("message_6",""+date_display_1.getText().toString())

                .putExtra("message_9",""+cvtv_31.getText().toString()) .putExtra("message_10",""+cvtv_32.getText().toString()) .putExtra("message_11",""+cvtv_33.getText().toString()) .putExtra("message_12",""+cvtv_34.getText().toString()) .putExtra("message_13",""+cvtv_35.getText().toString()));
            }
        });


        desti_3=findViewById(R.id.tv_place1);
        desti_4=findViewById(R.id.tv_place2);
        date_display_1=findViewById(R.id.tv_3);
        cvtv_41=findViewById(R.id.cv_4_tv_1);
        cvtv_42=findViewById(R.id.cv_4_tv_2);
        cvtv_43=findViewById(R.id.cv_4_tv_3);
        cvtv_44=findViewById(R.id.cv_4_tv_4);
        cvtv_45=findViewById(R.id.cv_4_tv_5);
        c_4=findViewById(R.id.cv_4);
        c_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BusSelectionPageActivity.this,BookingPageActivity.class).putExtra("message_4",""+desti_3.getText().toString()).putExtra("message_5",""+desti_4.getText().toString()).putExtra("message_6",""+date_display_1.getText().toString())

                .putExtra("message_9",""+cvtv_41.getText().toString()) .putExtra("message_10",""+cvtv_42.getText().toString()) .putExtra("message_11",""+cvtv_43.getText().toString()) .putExtra("message_12",""+cvtv_44.getText().toString()) .putExtra("message_13",""+cvtv_45.getText().toString()));
            }
        });


        desti_3=findViewById(R.id.tv_place1);
        desti_4=findViewById(R.id.tv_place2);
        date_display_1=findViewById(R.id.tv_3);
        cvtv_51=findViewById(R.id.cv_5_tv_1);
        cvtv_52=findViewById(R.id.cv_5_tv_2);
        cvtv_53=findViewById(R.id.cv_5_tv_3);
        cvtv_54=findViewById(R.id.cv_5_tv_4);
        cvtv_55=findViewById(R.id.cv_5_tv_5);
        c_5=findViewById(R.id.cv_5);
        c_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BusSelectionPageActivity.this,BookingPageActivity.class).putExtra("message_4",""+desti_3.getText().toString()).putExtra("message_5",""+desti_4.getText().toString()).putExtra("message_6",""+date_display_1.getText().toString())

                .putExtra("message_9",""+cvtv_51.getText().toString()) .putExtra("message_10",""+cvtv_52.getText().toString()) .putExtra("message_11",""+cvtv_53.getText().toString()) .putExtra("message_12",""+cvtv_54.getText().toString()) .putExtra("message_13",""+cvtv_55.getText().toString()));
            }
        });

        //bus selection passthrough connection
    }
}
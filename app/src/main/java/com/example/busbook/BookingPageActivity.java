package com.example.busbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class BookingPageActivity extends AppCompatActivity {

    TextView location_3, location_4, display_date_1_1, display_t1, display_t2, display_t3, display_t4, display_t5, desti_5, desti_6, date_display_2, dc1, dc2, dc3, dc4, dc5;
    String desti_3, desti_4, date_display_1, cvtv_11, cvtv_12, cvtv_13, cvtv_14, cvtv_15, cvtv_21, cvtv_22, cvtv_23, cvtv_24, cvtv_25, cvtv_31, cvtv_32, cvtv_33, cvtv_34, cvtv_35, cvtv_41, cvtv_42, cvtv_43, cvtv_44, cvtv_45, cvtv_51, cvtv_52, cvtv_53, cvtv_54, cvtv_55;
    ImageView m2, seat1, seat2, seat3, seat4, seat5, seat6, seat7, seat8, seat9, seat10, seat11, seat12, seat13, seat14, seat15, seat16, seat17, seat18, seat19, seat20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.booking_page);

// text view display for the detination and from

        location_3=findViewById(R.id.tv_place3);
        desti_3=getIntent().getStringExtra("message_4");
        location_3.setText(desti_3);


        location_4=findViewById(R.id.tv_place4);
        desti_4=getIntent().getStringExtra("message_5");
        location_4.setText(desti_4);

        display_date_1_1=findViewById(R.id.tv_7);
        date_display_1=getIntent().getStringExtra("message_6");
        display_date_1_1.setText(date_display_1);


// text view display for the detination and from

//cardview display booking page

//cardview1
        display_t1=findViewById(R.id.display_cvtv_1);
        cvtv_11=getIntent().getStringExtra("message_9");
        display_t1.setText(cvtv_11);

        display_t2=findViewById(R.id.display_cvtv_2);
        cvtv_12=getIntent().getStringExtra("message_10");
        display_t2.setText(cvtv_12);

        display_t3=findViewById(R.id.display_cvtv_3);
        cvtv_13=getIntent().getStringExtra("message_11");
        display_t3.setText(cvtv_13);

        display_t4=findViewById(R.id.display_cvtv_4);
        cvtv_14=getIntent().getStringExtra("message_12");
        display_t4.setText(cvtv_14);

        display_t5=findViewById(R.id.display_cvtv_5);
        cvtv_15=getIntent().getStringExtra("message_13");
        display_t5.setText(cvtv_15);
//cardview1

//cardview2
        display_t1=findViewById(R.id.display_cvtv_1);
        cvtv_21=getIntent().getStringExtra("message_9");
        display_t1.setText(cvtv_21);

        display_t2=findViewById(R.id.display_cvtv_2);
        cvtv_22=getIntent().getStringExtra("message_10");
        display_t2.setText(cvtv_22);

        display_t3=findViewById(R.id.display_cvtv_3);
        cvtv_23=getIntent().getStringExtra("message_11");
        display_t3.setText(cvtv_23);

        display_t4=findViewById(R.id.display_cvtv_4);
        cvtv_24=getIntent().getStringExtra("message_12");
        display_t4.setText(cvtv_24);

        display_t5=findViewById(R.id.display_cvtv_5);
        cvtv_25=getIntent().getStringExtra("message_13");
        display_t5.setText(cvtv_25);
//cardview2

//cardview3
        display_t1=findViewById(R.id.display_cvtv_1);
        cvtv_31=getIntent().getStringExtra("message_9");
        display_t1.setText(cvtv_31);

        display_t2=findViewById(R.id.display_cvtv_2);
        cvtv_32=getIntent().getStringExtra("message_10");
        display_t2.setText(cvtv_32);

        display_t3=findViewById(R.id.display_cvtv_3);
        cvtv_33=getIntent().getStringExtra("message_11");
        display_t3.setText(cvtv_33);

        display_t4=findViewById(R.id.display_cvtv_4);
        cvtv_34=getIntent().getStringExtra("message_12");
        display_t4.setText(cvtv_34);

        display_t5=findViewById(R.id.display_cvtv_5);
        cvtv_35=getIntent().getStringExtra("message_13");
        display_t5.setText(cvtv_35);
//cardview3

//cardview4
        display_t1=findViewById(R.id.display_cvtv_1);
        cvtv_41=getIntent().getStringExtra("message_9");
        display_t1.setText(cvtv_41);

        display_t2=findViewById(R.id.display_cvtv_2);
        cvtv_42=getIntent().getStringExtra("message_10");
        display_t2.setText(cvtv_42);

        display_t3=findViewById(R.id.display_cvtv_3);
        cvtv_43=getIntent().getStringExtra("message_11");
        display_t3.setText(cvtv_43);

        display_t4=findViewById(R.id.display_cvtv_4);
        cvtv_44=getIntent().getStringExtra("message_12");
        display_t4.setText(cvtv_44);

        display_t5=findViewById(R.id.display_cvtv_5);
        cvtv_45=getIntent().getStringExtra("message_13");
        display_t5.setText(cvtv_45);
//cardview4

//cardview5
        display_t1=findViewById(R.id.display_cvtv_1);
        cvtv_51=getIntent().getStringExtra("message_9");
        display_t1.setText(cvtv_51);

        display_t2=findViewById(R.id.display_cvtv_2);
        cvtv_52=getIntent().getStringExtra("message_10");
        display_t2.setText(cvtv_52);

        display_t3=findViewById(R.id.display_cvtv_3);
        cvtv_53=getIntent().getStringExtra("message_11");
        display_t3.setText(cvtv_53);

        display_t4=findViewById(R.id.display_cvtv_4);
        cvtv_54=getIntent().getStringExtra("message_12");
        display_t4.setText(cvtv_54);

        display_t5=findViewById(R.id.display_cvtv_5);
        cvtv_55=getIntent().getStringExtra("message_13");
        display_t5.setText(cvtv_55);
//cardview5

//cardview display booking page


//card view seletecd ticket pass memory

        //seat1

        desti_5=findViewById(R.id.tv_place3);
        desti_6=findViewById(R.id.tv_place4);
        date_display_2=findViewById(R.id.tv_7);
        dc1=findViewById(R.id.display_cvtv_1);
        dc2=findViewById(R.id.display_cvtv_2);
        dc3=findViewById(R.id.display_cvtv_3);
        dc4=findViewById(R.id.display_cvtv_4);
        dc5=findViewById(R.id.display_cvtv_5);
        seat1=findViewById(R.id.s1);
        seat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(BookingPageActivity.this,TicketconfirmationpageActivity.class).putExtra("msgs1",""+desti_5.getText().toString()).putExtra("msgs2",""+desti_6.getText().toString()).putExtra("msgs3",""+date_display_2.getText())
                .putExtra("msgs4",""+dc1.getText().toString()).putExtra("msgs5",""+dc2.getText().toString()).putExtra("msgs6",""+dc3.getText().toString()).putExtra("msgs7",""+dc4.getText().toString()).putExtra("msgs8",""+dc5.getText().toString()));
            }
        });

        //seat1

        //seat2

        desti_5=findViewById(R.id.tv_place3);
        desti_6=findViewById(R.id.tv_place4);
        date_display_2=findViewById(R.id.tv_7);
        dc1=findViewById(R.id.display_cvtv_1);
        dc2=findViewById(R.id.display_cvtv_2);
        dc3=findViewById(R.id.display_cvtv_3);
        dc4=findViewById(R.id.display_cvtv_4);
        dc5=findViewById(R.id.display_cvtv_5);
        seat2=findViewById(R.id.s2);
        seat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(BookingPageActivity.this,TicketconfirmationpageActivity.class).putExtra("msgs1",""+desti_5.getText().toString()).putExtra("msgs2",""+desti_6.getText().toString()).putExtra("msgs3",""+date_display_2.getText())
                        .putExtra("msgs4",""+dc1.getText().toString()).putExtra("msgs5",""+dc2.getText().toString()).putExtra("msgs6",""+dc3.getText().toString()).putExtra("msgs7",""+dc4.getText().toString()).putExtra("msgs8",""+dc5.getText().toString()));
            }
        });

        //seat2

        //seat3

        desti_5=findViewById(R.id.tv_place3);
        desti_6=findViewById(R.id.tv_place4);
        date_display_2=findViewById(R.id.tv_7);
        dc1=findViewById(R.id.display_cvtv_1);
        dc2=findViewById(R.id.display_cvtv_2);
        dc3=findViewById(R.id.display_cvtv_3);
        dc4=findViewById(R.id.display_cvtv_4);
        dc5=findViewById(R.id.display_cvtv_5);
        seat3=findViewById(R.id.s3);
        seat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(BookingPageActivity.this,TicketconfirmationpageActivity.class).putExtra("msgs1",""+desti_5.getText().toString()).putExtra("msgs2",""+desti_6.getText().toString()).putExtra("msgs3",""+date_display_2.getText())
                        .putExtra("msgs4",""+dc1.getText().toString()).putExtra("msgs5",""+dc2.getText().toString()).putExtra("msgs6",""+dc3.getText().toString()).putExtra("msgs7",""+dc4.getText().toString()).putExtra("msgs8",""+dc5.getText().toString()));
            }
        });

        //seat3

        //seat4

        desti_5=findViewById(R.id.tv_place3);
        desti_6=findViewById(R.id.tv_place4);
        date_display_2=findViewById(R.id.tv_7);
        dc1=findViewById(R.id.display_cvtv_1);
        dc2=findViewById(R.id.display_cvtv_2);
        dc3=findViewById(R.id.display_cvtv_3);
        dc4=findViewById(R.id.display_cvtv_4);
        dc5=findViewById(R.id.display_cvtv_5);
        seat4=findViewById(R.id.s4);
        seat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(BookingPageActivity.this,TicketconfirmationpageActivity.class).putExtra("msgs1",""+desti_5.getText().toString()).putExtra("msgs2",""+desti_6.getText().toString()).putExtra("msgs3",""+date_display_2.getText())
                        .putExtra("msgs4",""+dc1.getText().toString()).putExtra("msgs5",""+dc2.getText().toString()).putExtra("msgs6",""+dc3.getText().toString()).putExtra("msgs7",""+dc4.getText().toString()).putExtra("msgs8",""+dc5.getText().toString()));
            }
        });

        //seat4

        //seat5

        desti_5=findViewById(R.id.tv_place3);
        desti_6=findViewById(R.id.tv_place4);
        date_display_2=findViewById(R.id.tv_7);
        dc1=findViewById(R.id.display_cvtv_1);
        dc2=findViewById(R.id.display_cvtv_2);
        dc3=findViewById(R.id.display_cvtv_3);
        dc4=findViewById(R.id.display_cvtv_4);
        dc5=findViewById(R.id.display_cvtv_5);
        seat5=findViewById(R.id.s5);
        seat5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(BookingPageActivity.this,TicketconfirmationpageActivity.class).putExtra("msgs1",""+desti_5.getText().toString()).putExtra("msgs2",""+desti_6.getText().toString()).putExtra("msgs3",""+date_display_2.getText())
                        .putExtra("msgs4",""+dc1.getText().toString()).putExtra("msgs5",""+dc2.getText().toString()).putExtra("msgs6",""+dc3.getText().toString()).putExtra("msgs7",""+dc4.getText().toString()).putExtra("msgs8",""+dc5.getText().toString()));
            }
        });

        //seat5

        //seat6

        desti_5=findViewById(R.id.tv_place3);
        desti_6=findViewById(R.id.tv_place4);
        date_display_2=findViewById(R.id.tv_7);
        dc1=findViewById(R.id.display_cvtv_1);
        dc2=findViewById(R.id.display_cvtv_2);
        dc3=findViewById(R.id.display_cvtv_3);
        dc4=findViewById(R.id.display_cvtv_4);
        dc5=findViewById(R.id.display_cvtv_5);
        seat6=findViewById(R.id.s6);
        seat6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(BookingPageActivity.this,TicketconfirmationpageActivity.class).putExtra("msgs1",""+desti_5.getText().toString()).putExtra("msgs2",""+desti_6.getText().toString()).putExtra("msgs3",""+date_display_2.getText())
                        .putExtra("msgs4",""+dc1.getText().toString()).putExtra("msgs5",""+dc2.getText().toString()).putExtra("msgs6",""+dc3.getText().toString()).putExtra("msgs7",""+dc4.getText().toString()).putExtra("msgs8",""+dc5.getText().toString()));
            }
        });

        //seat6

        //seat7

        desti_5=findViewById(R.id.tv_place3);
        desti_6=findViewById(R.id.tv_place4);
        date_display_2=findViewById(R.id.tv_7);
        dc1=findViewById(R.id.display_cvtv_1);
        dc2=findViewById(R.id.display_cvtv_2);
        dc3=findViewById(R.id.display_cvtv_3);
        dc4=findViewById(R.id.display_cvtv_4);
        dc5=findViewById(R.id.display_cvtv_5);
        seat7=findViewById(R.id.s7);
        seat7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(BookingPageActivity.this,TicketconfirmationpageActivity.class).putExtra("msgs1",""+desti_5.getText().toString()).putExtra("msgs2",""+desti_6.getText().toString()).putExtra("msgs3",""+date_display_2.getText())
                        .putExtra("msgs4",""+dc1.getText().toString()).putExtra("msgs5",""+dc2.getText().toString()).putExtra("msgs6",""+dc3.getText().toString()).putExtra("msgs7",""+dc4.getText().toString()).putExtra("msgs8",""+dc5.getText().toString()));
            }
        });

        //seat7

        //seat8

        desti_5=findViewById(R.id.tv_place3);
        desti_6=findViewById(R.id.tv_place4);
        date_display_2=findViewById(R.id.tv_7);
        dc1=findViewById(R.id.display_cvtv_1);
        dc2=findViewById(R.id.display_cvtv_2);
        dc3=findViewById(R.id.display_cvtv_3);
        dc4=findViewById(R.id.display_cvtv_4);
        dc5=findViewById(R.id.display_cvtv_5);
        seat8=findViewById(R.id.s8);
        seat8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(BookingPageActivity.this,TicketconfirmationpageActivity.class).putExtra("msgs1",""+desti_5.getText().toString()).putExtra("msgs2",""+desti_6.getText().toString()).putExtra("msgs3",""+date_display_2.getText())
                        .putExtra("msgs4",""+dc1.getText().toString()).putExtra("msgs5",""+dc2.getText().toString()).putExtra("msgs6",""+dc3.getText().toString()).putExtra("msgs7",""+dc4.getText().toString()).putExtra("msgs8",""+dc5.getText().toString()));
            }
        });

        //seat8

        //seat9

        desti_5=findViewById(R.id.tv_place3);
        desti_6=findViewById(R.id.tv_place4);
        date_display_2=findViewById(R.id.tv_7);
        dc1=findViewById(R.id.display_cvtv_1);
        dc2=findViewById(R.id.display_cvtv_2);
        dc3=findViewById(R.id.display_cvtv_3);
        dc4=findViewById(R.id.display_cvtv_4);
        dc5=findViewById(R.id.display_cvtv_5);
        seat9=findViewById(R.id.s9);
        seat9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(BookingPageActivity.this,TicketconfirmationpageActivity.class).putExtra("msgs1",""+desti_5.getText().toString()).putExtra("msgs2",""+desti_6.getText().toString()).putExtra("msgs3",""+date_display_2.getText())
                        .putExtra("msgs4",""+dc1.getText().toString()).putExtra("msgs5",""+dc2.getText().toString()).putExtra("msgs6",""+dc3.getText().toString()).putExtra("msgs7",""+dc4.getText().toString()).putExtra("msgs8",""+dc5.getText().toString()));
            }
        });

        //seat9

        //seat10

        desti_5=findViewById(R.id.tv_place3);
        desti_6=findViewById(R.id.tv_place4);
        date_display_2=findViewById(R.id.tv_7);
        dc1=findViewById(R.id.display_cvtv_1);
        dc2=findViewById(R.id.display_cvtv_2);
        dc3=findViewById(R.id.display_cvtv_3);
        dc4=findViewById(R.id.display_cvtv_4);
        dc5=findViewById(R.id.display_cvtv_5);
        seat10=findViewById(R.id.s10);
        seat10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(BookingPageActivity.this,TicketconfirmationpageActivity.class).putExtra("msgs1",""+desti_5.getText().toString()).putExtra("msgs2",""+desti_6.getText().toString()).putExtra("msgs3",""+date_display_2.getText())
                        .putExtra("msgs4",""+dc1.getText().toString()).putExtra("msgs5",""+dc2.getText().toString()).putExtra("msgs6",""+dc3.getText().toString()).putExtra("msgs7",""+dc4.getText().toString()).putExtra("msgs8",""+dc5.getText().toString()));
            }
        });

        //seat10

        //seat11

        desti_5=findViewById(R.id.tv_place3);
        desti_6=findViewById(R.id.tv_place4);
        date_display_2=findViewById(R.id.tv_7);
        dc1=findViewById(R.id.display_cvtv_1);
        dc2=findViewById(R.id.display_cvtv_2);
        dc3=findViewById(R.id.display_cvtv_3);
        dc4=findViewById(R.id.display_cvtv_4);
        dc5=findViewById(R.id.display_cvtv_5);
        seat11=findViewById(R.id.s11);
        seat11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(BookingPageActivity.this,TicketconfirmationpageActivity.class).putExtra("msgs1",""+desti_5.getText().toString()).putExtra("msgs2",""+desti_6.getText().toString()).putExtra("msgs3",""+date_display_2.getText())
                        .putExtra("msgs4",""+dc1.getText().toString()).putExtra("msgs5",""+dc2.getText().toString()).putExtra("msgs6",""+dc3.getText().toString()).putExtra("msgs7",""+dc4.getText().toString()).putExtra("msgs8",""+dc5.getText().toString()));
            }
        });

        //seat11

        //seat12

        desti_5=findViewById(R.id.tv_place3);
        desti_6=findViewById(R.id.tv_place4);
        date_display_2=findViewById(R.id.tv_7);
        dc1=findViewById(R.id.display_cvtv_1);
        dc2=findViewById(R.id.display_cvtv_2);
        dc3=findViewById(R.id.display_cvtv_3);
        dc4=findViewById(R.id.display_cvtv_4);
        dc5=findViewById(R.id.display_cvtv_5);
        seat12=findViewById(R.id.s12);
        seat12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(BookingPageActivity.this,TicketconfirmationpageActivity.class).putExtra("msgs1",""+desti_5.getText().toString()).putExtra("msgs2",""+desti_6.getText().toString()).putExtra("msgs3",""+date_display_2.getText())
                        .putExtra("msgs4",""+dc1.getText().toString()).putExtra("msgs5",""+dc2.getText().toString()).putExtra("msgs6",""+dc3.getText().toString()).putExtra("msgs7",""+dc4.getText().toString()).putExtra("msgs8",""+dc5.getText().toString()));
            }
        });

        //seat12

        //seat13

        desti_5=findViewById(R.id.tv_place3);
        desti_6=findViewById(R.id.tv_place4);
        date_display_2=findViewById(R.id.tv_7);
        dc1=findViewById(R.id.display_cvtv_1);
        dc2=findViewById(R.id.display_cvtv_2);
        dc3=findViewById(R.id.display_cvtv_3);
        dc4=findViewById(R.id.display_cvtv_4);
        dc5=findViewById(R.id.display_cvtv_5);
        seat13=findViewById(R.id.s13);
        seat13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(BookingPageActivity.this,TicketconfirmationpageActivity.class).putExtra("msgs1",""+desti_5.getText().toString()).putExtra("msgs2",""+desti_6.getText().toString()).putExtra("msgs3",""+date_display_2.getText())
                        .putExtra("msgs4",""+dc1.getText().toString()).putExtra("msgs5",""+dc2.getText().toString()).putExtra("msgs6",""+dc3.getText().toString()).putExtra("msgs7",""+dc4.getText().toString()).putExtra("msgs8",""+dc5.getText().toString()));
            }
        });

        //seat13

        //seat14

        desti_5=findViewById(R.id.tv_place3);
        desti_6=findViewById(R.id.tv_place4);
        date_display_2=findViewById(R.id.tv_7);
        dc1=findViewById(R.id.display_cvtv_1);
        dc2=findViewById(R.id.display_cvtv_2);
        dc3=findViewById(R.id.display_cvtv_3);
        dc4=findViewById(R.id.display_cvtv_4);
        dc5=findViewById(R.id.display_cvtv_5);
        seat14=findViewById(R.id.s14);
        seat14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(BookingPageActivity.this,TicketconfirmationpageActivity.class).putExtra("msgs1",""+desti_5.getText().toString()).putExtra("msgs2",""+desti_6.getText().toString()).putExtra("msgs3",""+date_display_2.getText())
                        .putExtra("msgs4",""+dc1.getText().toString()).putExtra("msgs5",""+dc2.getText().toString()).putExtra("msgs6",""+dc3.getText().toString()).putExtra("msgs7",""+dc4.getText().toString()).putExtra("msgs8",""+dc5.getText().toString()));
            }
        });

        //seat14

        //seat15

        desti_5=findViewById(R.id.tv_place3);
        desti_6=findViewById(R.id.tv_place4);
        date_display_2=findViewById(R.id.tv_7);
        dc1=findViewById(R.id.display_cvtv_1);
        dc2=findViewById(R.id.display_cvtv_2);
        dc3=findViewById(R.id.display_cvtv_3);
        dc4=findViewById(R.id.display_cvtv_4);
        dc5=findViewById(R.id.display_cvtv_5);
        seat15=findViewById(R.id.s15);
        seat15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(BookingPageActivity.this,TicketconfirmationpageActivity.class).putExtra("msgs1",""+desti_5.getText().toString()).putExtra("msgs2",""+desti_6.getText().toString()).putExtra("msgs3",""+date_display_2.getText())
                        .putExtra("msgs4",""+dc1.getText().toString()).putExtra("msgs5",""+dc2.getText().toString()).putExtra("msgs6",""+dc3.getText().toString()).putExtra("msgs7",""+dc4.getText().toString()).putExtra("msgs8",""+dc5.getText().toString()));
            }
        });

        //seat15

        //seat16

        desti_5=findViewById(R.id.tv_place3);
        desti_6=findViewById(R.id.tv_place4);
        date_display_2=findViewById(R.id.tv_7);
        dc1=findViewById(R.id.display_cvtv_1);
        dc2=findViewById(R.id.display_cvtv_2);
        dc3=findViewById(R.id.display_cvtv_3);
        dc4=findViewById(R.id.display_cvtv_4);
        dc5=findViewById(R.id.display_cvtv_5);
        seat16=findViewById(R.id.s16);
        seat16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(BookingPageActivity.this,TicketconfirmationpageActivity.class).putExtra("msgs1",""+desti_5.getText().toString()).putExtra("msgs2",""+desti_6.getText().toString()).putExtra("msgs3",""+date_display_2.getText())
                        .putExtra("msgs4",""+dc1.getText().toString()).putExtra("msgs5",""+dc2.getText().toString()).putExtra("msgs6",""+dc3.getText().toString()).putExtra("msgs7",""+dc4.getText().toString()).putExtra("msgs8",""+dc5.getText().toString()));
            }
        });

        //seat16

        //seat17

        desti_5=findViewById(R.id.tv_place3);
        desti_6=findViewById(R.id.tv_place4);
        date_display_2=findViewById(R.id.tv_7);
        dc1=findViewById(R.id.display_cvtv_1);
        dc2=findViewById(R.id.display_cvtv_2);
        dc3=findViewById(R.id.display_cvtv_3);
        dc4=findViewById(R.id.display_cvtv_4);
        dc5=findViewById(R.id.display_cvtv_5);
        seat17=findViewById(R.id.s17);
        seat17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(BookingPageActivity.this,TicketconfirmationpageActivity.class).putExtra("msgs1",""+desti_5.getText().toString()).putExtra("msgs2",""+desti_6.getText().toString()).putExtra("msgs3",""+date_display_2.getText())
                        .putExtra("msgs4",""+dc1.getText().toString()).putExtra("msgs5",""+dc2.getText().toString()).putExtra("msgs6",""+dc3.getText().toString()).putExtra("msgs7",""+dc4.getText().toString()).putExtra("msgs8",""+dc5.getText().toString()));
            }
        });

        //seat17

        //seat18

        desti_5=findViewById(R.id.tv_place3);
        desti_6=findViewById(R.id.tv_place4);
        date_display_2=findViewById(R.id.tv_7);
        dc1=findViewById(R.id.display_cvtv_1);
        dc2=findViewById(R.id.display_cvtv_2);
        dc3=findViewById(R.id.display_cvtv_3);
        dc4=findViewById(R.id.display_cvtv_4);
        dc5=findViewById(R.id.display_cvtv_5);
        seat18=findViewById(R.id.s18);
        seat18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(BookingPageActivity.this,TicketconfirmationpageActivity.class).putExtra("msgs1",""+desti_5.getText().toString()).putExtra("msgs2",""+desti_6.getText().toString()).putExtra("msgs3",""+date_display_2.getText())
                        .putExtra("msgs4",""+dc1.getText().toString()).putExtra("msgs5",""+dc2.getText().toString()).putExtra("msgs6",""+dc3.getText().toString()).putExtra("msgs7",""+dc4.getText().toString()).putExtra("msgs8",""+dc5.getText().toString()));
            }
        });

        //seat18

        //seat19

        desti_5=findViewById(R.id.tv_place3);
        desti_6=findViewById(R.id.tv_place4);
        date_display_2=findViewById(R.id.tv_7);
        dc1=findViewById(R.id.display_cvtv_1);
        dc2=findViewById(R.id.display_cvtv_2);
        dc3=findViewById(R.id.display_cvtv_3);
        dc4=findViewById(R.id.display_cvtv_4);
        dc5=findViewById(R.id.display_cvtv_5);
        seat19=findViewById(R.id.s19);
        seat19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(BookingPageActivity.this,TicketconfirmationpageActivity.class).putExtra("msgs1",""+desti_5.getText().toString()).putExtra("msgs2",""+desti_6.getText().toString()).putExtra("msgs3",""+date_display_2.getText())
                        .putExtra("msgs4",""+dc1.getText().toString()).putExtra("msgs5",""+dc2.getText().toString()).putExtra("msgs6",""+dc3.getText().toString()).putExtra("msgs7",""+dc4.getText().toString()).putExtra("msgs8",""+dc5.getText().toString()));
            }
        });

        //seat19

        //seat20

        desti_5=findViewById(R.id.tv_place3);
        desti_6=findViewById(R.id.tv_place4);
        date_display_2=findViewById(R.id.tv_7);
        dc1=findViewById(R.id.display_cvtv_1);
        dc2=findViewById(R.id.display_cvtv_2);
        dc3=findViewById(R.id.display_cvtv_3);
        dc4=findViewById(R.id.display_cvtv_4);
        dc5=findViewById(R.id.display_cvtv_5);
        seat20=findViewById(R.id.s20);
        seat20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(BookingPageActivity.this,TicketconfirmationpageActivity.class).putExtra("msgs1",""+desti_5.getText().toString()).putExtra("msgs2",""+desti_6.getText().toString()).putExtra("msgs3",""+date_display_2.getText())
                        .putExtra("msgs4",""+dc1.getText().toString()).putExtra("msgs5",""+dc2.getText().toString()).putExtra("msgs6",""+dc3.getText().toString()).putExtra("msgs7",""+dc4.getText().toString()).putExtra("msgs8",""+dc5.getText().toString()));
            }
        });

        //seat20


//card view seletecd ticket pass memory


        //arrow to backup
        m2=findViewById(R.id.arrow_2);
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BookingPageActivity.this,BusSelectionPageActivity.class);
                startActivity(intent);
            }
        });
        //arrow to backup


    }
}
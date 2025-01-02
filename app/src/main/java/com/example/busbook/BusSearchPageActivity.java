package com.example.busbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class BusSearchPageActivity extends AppCompatActivity {

    TextView welcome;
    String name;

    ImageView m2;

    Button btn_s;
    EditText desti, desti_1, date;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bus_search_page);

        welcome=findViewById(R.id.tv_name);
        name=(getIntent().getStringExtra("message"));
        welcome.setText(name);


        //profile link
        m2=findViewById(R.id.pro_link);
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BusSearchPageActivity.this,ProfilePageActivity.class));
            }
        });
        //profile link

        //button pass from bus search to- bus selection
        /*btn_s=findViewById(R.id.search_buses);
        desti=findViewById(R.id.dest_1);

            btn_s.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    startActivity(new Intent(BusSearchPageActivity.this,BusSelectionPageActivity.class).putExtra("message_1",""+desti.getText().toString()));
                }
            });
*/        //button pass from bus search to- bus selection and edit text to view text on the next page that is

        btn_s=findViewById(R.id.search_buses);
        desti=findViewById(R.id.dest_1);
        desti_1=findViewById(R.id.fr_desti);
        date=findViewById(R.id.date_select_1);

            btn_s.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    startActivity(new Intent(BusSearchPageActivity.this,BusSelectionPageActivity.class).putExtra("message_1",""+desti.getText().toString())  .putExtra("message_2",""+desti_1.getText().toString())  .putExtra("message_3",""+date.getText().toString()));
                }
            });


        



    }
}
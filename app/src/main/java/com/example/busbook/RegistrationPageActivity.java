package com.example.busbook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegistrationPageActivity extends AppCompatActivity
{

    TextView t2;

    EditText s,s1,s2,mpass;

    Button btn_reg1;

    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_page);

        t2= findViewById(R.id.txt_link_login);
            t2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(RegistrationPageActivity.this,MainActivity.class);
                    startActivity(intent);
                }
            });


        s=findViewById(R.id.us_1);
        s1=findViewById(R.id.us_2);
        s2=findViewById(R.id.us_3);
        mpass=findViewById(R.id.mpss);
        fAuth= FirebaseAuth.getInstance();
        btn_reg1= findViewById(R.id.button_create);

        if (fAuth.getCurrentUser() != null){
            startActivity(new Intent(getApplicationContext(),ProfilePageActivity.class));
            finish();
        }

            btn_reg1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {

                    String email = s1.getText().toString().trim();
                    String password = mpass.getText().toString().trim();
                    //startActivity(new Intent(RegistrationPageActivity.this,ProfilePageActivity.class).putExtra("msg_1",""+s.getText().toString()).putExtra("msg_2",""+s1.getText().toString()).putExtra("msg_3",""+s2.getText().toString()));

                    if (TextUtils.isEmpty(email)){
                        s1.setError("Email is Required");
                        return;
                    }

                    if (TextUtils.isEmpty(password)){
                        mpass.setError("Password is Required");
                        return;
                    }

                    if (password.length() < 7){
                        mpass.setError("Password must be upto 7 characters");
                        return;
                    }

                    //register the user

                    fAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){

                                Toast.makeText(RegistrationPageActivity.this, "User Created", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(getApplicationContext(),ProfilePageActivity.class).putExtra("msg_1",""+s.getText().toString()).putExtra("msg_2",""+s1.getText().toString()).putExtra("msg_3",""+s2.getText().toString()));

                            }else{
                                Toast.makeText(RegistrationPageActivity.this, "Error !" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            });
    }
}
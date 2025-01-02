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

public class MainActivity extends AppCompatActivity {
    TextView t1;
    Button lo_button;
    EditText name, mEmail,mpasss;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1= findViewById(R.id.txt_link_reg);
                t1.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent=new Intent(MainActivity.this,RegistrationPageActivity.class);
                        startActivity(intent);
                    }
                });

        lo_button=findViewById(R.id.button_login);
        name=findViewById(R.id.username_login);
        mEmail=findViewById(R.id.email);
        fAuth= FirebaseAuth.getInstance();
        mpasss= findViewById(R.id.password);


            lo_button.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    //startActivity(new Intent(MainActivity.this,BusSearchPageActivity.class).putExtra("message","Hey "+name.getText().toString()));

                    String email = mEmail.getText().toString().trim();
                    String password = mpasss.getText().toString().trim();

                    if (TextUtils.isEmpty(email)){
                        mEmail.setError("Email is Required");
                        return;
                    }

                    if (TextUtils.isEmpty(password)){
                        mpasss.setError("Password is Required");
                        return;
                    }

                    if (password.length() < 7){
                        mpasss.setError("Password must be upto 7 characters");
                        return;
                    }

                    //authenticate user

                    fAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                          if (task.isSuccessful()){
                              Toast.makeText(MainActivity.this, "Logged In Successfully", Toast.LENGTH_SHORT).show();
                              startActivity(new Intent(getApplicationContext(),BusSearchPageActivity.class).putExtra("message","Hey "+name.getText().toString()));

                          }else {
                              Toast.makeText(MainActivity.this, "Error !" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                          }
                        }
                    });
                }
            });
    }
}
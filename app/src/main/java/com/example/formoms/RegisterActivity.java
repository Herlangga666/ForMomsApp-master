package com.example.formoms;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {
    Button btn_regis;
    EditText email_regis,password_regis;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btn_regis = (Button) findViewById(R.id.btn_regis);
        email_regis= (EditText) findViewById(R.id.email_regis);
        password_regis= (EditText) findViewById(R.id.password_regis);
        mAuth = FirebaseAuth.getInstance();

        btn_regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = email_regis.getText().toString();
                String password = password_regis.getText().toString();

                if (email.isEmpty()){
                    email_regis.setError("email kosong");
                    email_regis.requestFocus();
                    return;
                }
                if (password.isEmpty()){
                    password_regis.setError("password kosong");
                    password_regis.requestFocus();
                    return;
                }else if(password.length()<6){
                    password_regis.setError("Minimal 6 digit password");
                    password_regis.requestFocus();
                    return;
                }

                mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(RegisterActivity.this, "Berhasil", Toast.LENGTH_SHORT).show();
                            //startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
                        }
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(RegisterActivity.this, "Register gagal", Toast.LENGTH_SHORT).show();
                    }
                });


            }
        });
    }

}

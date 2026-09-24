package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnEntrar = findViewById(R.id.btnEntrar);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.widget.EditText edtUsuario = findViewById(R.id.editEmail);
                android.widget.EditText edtSenha = findViewById(R.id.editSenha);
                String usuario = edtUsuario.getText().toString();
                String senha = edtSenha.getText().toString();

                Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
                intent.putExtra("usuario", usuario);
                startActivity(intent);
            }
        });
    }
}
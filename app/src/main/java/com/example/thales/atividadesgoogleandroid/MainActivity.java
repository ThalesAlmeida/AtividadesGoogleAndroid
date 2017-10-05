package com.example.thales.atividadesgoogleandroid;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(onClickLogin());
    }
    private View.OnClickListener onClickLogin(){
        return new View.OnClickListener(){
            public void onClick(View view){

                EditText tLogin = (EditText) findViewById(R.id.tLogin);
                EditText tSenha = (EditText) findViewById(R.id.tSenha);
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();
                if("thales".equals(login) && "123".equals(senha)){
                    //Navega para a próxima tela
                    Intent intent = new Intent(getContext(), BemVindoActivity.class);
                    Bundle params = new Bundle();
                    params.putString("nome", "Thales Alves");
                    intent.putExtras(params);
                    startActivity(intent);
                    alert("Login Realizado");
                }else{
                    alert("login ou senha incorretos.");
                }
            }
        };
    }
    private Context getContext(){
        return this;
    }

    private void alert(String s){
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}

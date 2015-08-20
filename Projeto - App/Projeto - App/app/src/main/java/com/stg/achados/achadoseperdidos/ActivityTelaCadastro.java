package com.stg.achados.achadoseperdidos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.widget.EditText;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Diego on 17/08/2015.
 */
public class ActivityTelaCadastro extends Activity {

    EditText nome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
        nome = (EditText)FindViewById(R.id.edtNome);


    }


    public void Cadastrar(View view) {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
        String conexao = 
        Connection conexao = DriverManager.getConnection()

    }

    public void VoltarCad(View view){

        Intent intent = new Intent(this,ActivityLogin.class);
        startActivity(intent);
    }
}

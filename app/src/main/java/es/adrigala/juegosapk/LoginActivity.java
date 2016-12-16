package es.adrigala.juegosapk;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText etId;
    private EditText etPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etId = (EditText) findViewById(R.id.eTextId);
        etPass = (EditText) findViewById(R.id.eTextPass);
    }

    public void validar(View view) {
        SharedPreferences sp = getSharedPreferences("credenciales", MODE_PRIVATE);
        if(etId.getText().toString().equals(sp.getString("id", null)) && etPass.getText().toString().equals(sp.getString("password", null))){
          Intent i =  new Intent(this, CategoriasActivity.class);
            i.putExtra("nombre", sp.getString("nombre", null));
            startActivity(i);
        }
    }
}

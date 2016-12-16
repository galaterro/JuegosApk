package es.adrigala.juegosapk;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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

        }
    }
}

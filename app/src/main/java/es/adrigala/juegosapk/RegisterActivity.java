package es.adrigala.juegosapk;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private EditText etId;
    private EditText etPass;
    private EditText etNombre;
    private Toast t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etId = (EditText) findViewById(R.id.textId);
        etPass = (EditText) findViewById(R.id.textPass);
        etNombre = (EditText) findViewById(R.id.textName);

    }

    public void onClickRegister(View view) {
        User usr;
        String id = etId.getText().toString();
        String pass = etPass.getText().toString();
        String nombre = etNombre.getText().toString();
        try {
            usr = new User(id, pass, nombre);
            SharedPreferences sp = getSharedPreferences("credenciales",MODE_PRIVATE);
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("id", id);
            editor.putString("password", pass);
            editor.putString("nombre", nombre);
            editor.commit();
            t = Toast.makeText(this, "Usuario creado con éxito", Toast.LENGTH_LONG);
            t.show();
            startActivity(new Intent(this, MainActivity.class));
        } catch (Exception e) {
            t = Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG);
            t.show();
        }
    }
}

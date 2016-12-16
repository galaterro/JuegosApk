package es.adrigala.juegosapk;

import android.content.Intent;
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
        etNombre = (EditText) findViewById(R.id.textNombre);

    }

    public void onClickRegister(View view) {
        try {
            User usr = new User(etId.getText().toString(), etPass.getText().toString(), etNombre.getText().toString());
            startActivity(new Intent(this, MainActivity.class));
        } catch (Exception e) {
            t = Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG);
        }
    }
}

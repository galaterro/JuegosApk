package es.adrigala.juegosapk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private EditText etNombre;
    private EditText etPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etNombre = (EditText) findViewById(R.id.textNombre);
        etPass = (EditText) findViewById(R.id.textPass);

    }

    public void entrarLogin(View view) {

    }
}

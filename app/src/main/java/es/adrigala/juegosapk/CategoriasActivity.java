package es.adrigala.juegosapk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class CategoriasActivity extends AppCompatActivity {
    private TextView etSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);
        etSaludo = (TextView) findViewById(R.id.textName);
        Intent i = getIntent();
        etSaludo.setText("¡Bienvenido " + i.getStringExtra("nombre"));

    }
}

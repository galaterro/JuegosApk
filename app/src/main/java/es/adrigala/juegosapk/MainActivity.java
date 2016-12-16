package es.adrigala.juegosapk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cambiarPantalla(View view) {
        Toast t = Toast.makeText(this, "pedos", Toast.LENGTH_LONG);
        t.show();
        startActivity(new Intent(MainActivity.this, RegisterActivity.class));
    }
}

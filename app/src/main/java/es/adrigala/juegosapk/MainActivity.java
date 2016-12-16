package es.adrigala.juegosapk;

import android.content.Intent;
import android.content.SharedPreferences;
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
        SharedPreferences sp = getSharedPreferences("credenciales", MODE_PRIVATE);
        if(sp.contains("id")){
            startActivity(new Intent(this, LoginActivity.class));
        }else{
            startActivity(new Intent(this, RegisterActivity.class));
        }

    }
}

package pe.com.bitall.appmockup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    private Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        enlazarElementos();
        obtenerParametros();
    }

    private void obtenerParametros() {
        Bundle datosRecibidos = getIntent().getExtras();
        if (datosRecibidos!= null){
            String datoRecuperado = datosRecibidos.getString("pantalla");
            if (datoRecuperado!= null){
                Log.i("LoginActivity","Pantalla: "+datoRecuperado);
            }
        }
    }

    private void enlazarElementos(){
        btnRegresar = findViewById(R.id.btnRegresar);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPantallaMenu = new Intent(LoginActivity.this, MenuActivity.class);
                startActivity(iPantallaMenu);
                //Para cerrar la actividad actual
                finish();
            }
        });
    }
}

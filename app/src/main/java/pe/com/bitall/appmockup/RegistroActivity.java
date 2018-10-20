package pe.com.bitall.appmockup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegistroActivity extends AppCompatActivity {

    @BindView(R.id.btnRegresar) Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        ButterKnife.bind(this);
        obtenerParametros();
    }

    private void obtenerParametros() {
        Bundle datosRecibidos = getIntent().getExtras();
        if (datosRecibidos!= null){
            String datoRecuperado = datosRecibidos.getString("pantalla");
            if (datoRecuperado!= null){
                Log.i("RegistroActivity","Pantalla: "+datoRecuperado);
            }
        }
    }

    @OnClick(R.id.btnRegresar)
    void regresarPantallaMenu(){
        Intent iPantallaMenu = new Intent(RegistroActivity.this, MenuActivity.class);
        startActivity(iPantallaMenu);
        //Para cerrar la actividad actual
        finish();
    }
}

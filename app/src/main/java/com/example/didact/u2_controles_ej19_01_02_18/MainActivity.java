package com.example.didact.u2_controles_ej19_01_02_18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.IllegalFormatCodePointException;

public class MainActivity extends AppCompatActivity {

    Button btn_aceptar;
    CheckBox cb_musica, cb_deporte, cb_cine;
    RadioGroup rg_sexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Identificacion de vistas
        btn_aceptar=(Button)findViewById(R.id.btn_aceptar);
        cb_musica= (CheckBox)findViewById(R.id.cb_musica);
        cb_cine= (CheckBox)findViewById(R.id.cb_cine);
        cb_deporte= (CheckBox)findViewById(R.id.cb_deporte);
        rg_sexo= (RadioGroup) findViewById(R.id.rg_sexo);



        //Evento click del boton aceptar
        btn_aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Has clicado aceptar",
                        Toast.LENGTH_LONG).show();
            }
        });
    } //FIN onCreate

    //Metodo OnClick del botn cancelar
    public void pulsarCancelar(View view){

        //Comprobar elementos checkeados
        String preferencias="";
        if (cb_musica.isChecked()){
            preferencias+= "Música";
        }
        if (cb_cine.isChecked()){
            preferencias+= "Cine";
        }
        if (cb_deporte.isChecked()){
            preferencias+= "Deporte";
        }

        Toast.makeText(getApplicationContext(),"Esta chekeado: "+preferencias,
                Toast.LENGTH_LONG).show();


        //Comprobar elementos RadioButons
        int id=rg_sexo.getCheckedRadioButtonId();

        RadioButton rbSeleccionado = (RadioButton)findViewById(id);
        String textoRbSeleccionado = rbSeleccionado.getText().toString();

        Toast.makeText(getApplicationContext(),"SEXO: "+textoRbSeleccionado,
                Toast.LENGTH_LONG).show();


    }
} //FIN MainActivity

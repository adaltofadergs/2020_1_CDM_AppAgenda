package br.pro.appagenda_2020_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private EditText etNome, etTelefone;
    private Spinner spCidade, spEstado;
    private RadioButton rbFeminino, rbMasculino;
    private CheckBox cbEmail;
    private Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNome = (EditText) findViewById(R.id.etNome);
        etTelefone = findViewById(R.id.etTelefone);
        spCidade = findViewById(R.id.spCidade);
        spEstado = findViewById(R.id.spEstado);
        rbFeminino = findViewById(R.id.rbFeminino);
        rbMasculino = findViewById(R.id.rbMasculino);
        cbEmail = findViewById(R.id.cbAceitaEmail);
        btnSalvar = findViewById(R.id.btnSalvar);

    }


    private void salvar(){
        String texto = "";
        texto += "Nome: " + etNome.getText().toString() + "\n" ;



    }


    @Override
    protected void onRestart() {
        super.onRestart();
    }
}



























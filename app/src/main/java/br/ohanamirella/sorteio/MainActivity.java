package br.ohanamirella.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText edfinal,edinicial;
    TextView tvSorteio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edfinal = findViewById(R.id.editTextFinal);
        edinicial = findViewById(R.id.editTextInicial);
        tvSorteio = findViewById(R.id.textViewSorteado);

    }

    public void sortear(View view) {
        int vfinal = Integer.parseInt( edfinal.getText().toString());
        int vinicial = Integer.parseInt( edinicial.getText().toString());
        Random x= new Random();
        int a = x.nextInt(vfinal - vinicial);
        a = a+vinicial;


        tvSorteio .setText(Integer.toString(a));


    }
}

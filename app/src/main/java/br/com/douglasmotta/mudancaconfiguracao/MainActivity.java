package br.com.douglasmotta.mudancaconfiguracao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int pontosTimeA = 0;
    private int pontosTimeB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textPontosTimeA = findViewById(R.id.textPontosTimeA);
        final TextView textPontosTimeB = findViewById(R.id.textPontosTimeB);

        final Button buttonAddPontoTimeA = findViewById(R.id.buttonAddPontoTimeA);
        final Button buttonAddPontoTimeB = findViewById(R.id.buttonAddPontoTimeB);

        buttonAddPontoTimeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pontosTimeA++;
                textPontosTimeA.setText(String.valueOf(pontosTimeA));
            }
        });

        buttonAddPontoTimeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pontosTimeB++;
                textPontosTimeB.setText(String.valueOf(pontosTimeB));
            }
        });
    }
}

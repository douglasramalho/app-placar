package br.com.douglasmotta.mudancaconfiguracao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textPontosTimeA;
    private TextView textPontosTimeB;

    private Button buttonAddPontoTimeA;
    private Button buttonAddPontoTimeB;

    private int pontosTimeA = 0;
    private int pontosTimeB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();

        setUpClickListeners();

        if (savedInstanceState != null) {
            pontosTimeA = savedInstanceState.getInt("pontosTimeA");
            pontosTimeB = savedInstanceState.getInt("pontosTimeB");

            textPontosTimeA.setText(getStringOf(pontosTimeA));
            textPontosTimeB.setText(getStringOf(pontosTimeB));
        }
    }

    private void bindViews() {
        textPontosTimeA = findViewById(R.id.textPontosTimeA);
        textPontosTimeB = findViewById(R.id.textPontosTimeB);

        buttonAddPontoTimeA = findViewById(R.id.buttonAddPontoTimeA);
        buttonAddPontoTimeB = findViewById(R.id.buttonAddPontoTimeB);
    }

    private void setUpClickListeners() {
        buttonAddPontoTimeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pontosTimeA++;
                textPontosTimeA.setText(getStringOf(pontosTimeA));
            }
        });

        buttonAddPontoTimeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pontosTimeB++;
                textPontosTimeB.setText(getStringOf(pontosTimeB));
            }
        });
    }

    private String getStringOf(int value) {
        return String.valueOf(value);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("pontosTimeA", pontosTimeA);
        outState.putInt("pontosTimeB", pontosTimeB);
    }
}

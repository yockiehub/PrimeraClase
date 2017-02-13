package com.example.palmecro8alumnes.primeraclase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button firstButton;
    private TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Si no declarara las variables a nivel de clase,
         * pr ejemplo TextView, tendría que declararse como
         * final, ya que si no, si el valor se modificara
         * después de la creación, podría dar problemas.
         *
         * Seria asi:
         * final TextView myTextview  (TextView)findViewById(R.id.textView);
         */


        firstButton = (Button)findViewById(R.id.button);
        myTextView = (TextView)findViewById(R.id.textView);

        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setText(R.string.newText);
            }
        });
    }


}

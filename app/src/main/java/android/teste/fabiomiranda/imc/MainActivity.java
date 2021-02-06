package android.teste.fabiomiranda.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i("Ciclo", getLocalClassName() + ".onCreate() chamado.");

        setContentView(R.layout.activity_main);


        final Button bt = (Button) findViewById(R.id.button);
        EditText edt1 = (EditText) findViewById(R.id.editext);
        EditText edt2 = (EditText) findViewById(R.id.editext2);
        EditText edt3 = (EditText) findViewById(R.id.editext3);
        EditText edt4 = (EditText) findViewById(R.id.editext4);

        bt.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                String str1 = edt1.getText().toString();
                String str2 = edt2.getText().toString();
                String str3 = edt3.getText().toString();
                String str4 = edt4.getText().toString();

                double peso = Double.parseDouble(str3);
                double altura = Double.parseDouble(str4);
                double imc = Math.floor((peso / (altura*altura)) * 100) / 100;
                Log.i("Clique", "Valor do imc " + imc);
                String classificacao = null;


                if(imc < 18.5)
                    classificacao = "Abaixo do peso";
                else if(imc >= 18.5 && imc < 24.9)
                    classificacao = "Saudável";
                else if(imc >= 25 && imc < 29.9)
                    classificacao = "Sobrepeso";
                else if(imc >= 30 && imc < 34.9)
                    classificacao = "Obesidade Grau I";
                else if(imc >= 35 && imc < 39.9)
                    classificacao = "Obesidade Grau II (severa)";
                else if(imc >= 40)
                    classificacao = "Obesidade Grau III (mórbida)";

                Intent it = new Intent(getBaseContext(), MainActivity2.class);

                it.putExtra("nome",str1);
                it.putExtra("idade",str2);
                it.putExtra("peso",str3);
                it.putExtra("altura",str4);
                it.putExtra("imc", imc);
                it.putExtra("classificação",classificacao);

                startActivity(it);
            }
        });
    }

    protected void onStart(){
        super.onStart();
        Log.i("Ciclo", getLocalClassName() + ".onStart() chamado.");
    }

    protected void onResume(){
        super.onResume();
        Log.i("Ciclo", getLocalClassName() + ".onResume() chamado.");
    }

    protected void onRestart(){
        super.onRestart();
        Log.i("Ciclo", getLocalClassName() + ".onRestart() chamado.");
    }

    protected void onPause(){
        super.onPause();
        Log.i("Ciclo", getLocalClassName() + ".onPause() chamado.");
    }

    protected void onStop(){
        super.onStop();
        Log.i("Ciclo", getLocalClassName() + ".onStop() chamado.");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.i("Ciclo", getLocalClassName() + ".onDestroy() chamado.");
    }
}
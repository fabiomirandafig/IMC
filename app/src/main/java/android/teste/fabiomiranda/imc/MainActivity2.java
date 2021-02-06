package android.teste.fabiomiranda.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i("Ciclo", getLocalClassName() + ".onCreate() chamado.");

        setContentView(R.layout.activity_main2);

        Intent it = getIntent();

        final Button bt = (Button) findViewById(R.id.button);
        TextView txt1 = (TextView) findViewById(R.id.textview3);
        TextView txt2 = (TextView) findViewById(R.id.textview5);
        TextView txt3 = (TextView) findViewById(R.id.textview7);
        TextView txt4 = (TextView) findViewById(R.id.textview9);
        TextView txt5 = (TextView) findViewById(R.id.textview11);
        TextView txt6 = (TextView) findViewById(R.id.textview13);

        txt1.setText(it.getStringExtra("nome"));
        txt2.setText(it.getStringExtra("idade") + " anos");
        txt3.setText(it.getStringExtra("peso") + " Kg");
        txt4.setText(it.getStringExtra("altura") + " m");
        txt5.setText(it.getDoubleExtra("imc",0) + " Kg/m²");
        txt6.setText(it.getStringExtra("classificação"));

        bt.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(), MainActivity.class);
                it.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(it);
                //finish();
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
        Log.i("Ciclo de Vida", getLocalClassName() + ".onRestart() chamado.");
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
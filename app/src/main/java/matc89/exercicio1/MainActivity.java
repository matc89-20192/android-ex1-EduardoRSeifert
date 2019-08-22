package matc89.exercicio1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static matc89.exercicio1.R.layout;

public class MainActivity extends AppCompatActivity {
    private EditText editNome;
    private TextView labelMensagem;
    private Button btnCumprimentar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        btnCumprimentar = (Button) findViewById(R.id.btnCumprimentar);
        labelMensagem = (TextView) findViewById(R.id.labelMensagem);
        editNome = (EditText) findViewById(R.id.editNome);
        btnCumprimentar.setText("Cumprimentar");
        labelMensagem.setText("Alô, Mundo!");
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("meutexto", labelMensagem.getText().toString());

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        String meutexto = savedInstanceState.getString("meutexto");
        labelMensagem.setText(meutexto);
    }

    public void btnCumprimentarPress(View v){
        String typedText = "Alô, ";
        typedText+= editNome.getText().toString();
        typedText+="!";
        labelMensagem.setText(typedText);
    }
}
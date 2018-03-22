package br.usjt.deswebmob.servicedeskcco;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import br.usjt.deswebmob.servicedeskcco.model.Chamado;

public class DetalheChamadoActivity extends Activity {
    TextView txtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_chamado);
        txtNome = (TextView)findViewById(R.id.chamado_nome);
        Intent intent = getIntent();
        Chamado chamado = intent.getSerializableExtra(ListarChamadosActivity.CHAMADO);
        txtNome.setText(chamado.getDescricao());
    }
}

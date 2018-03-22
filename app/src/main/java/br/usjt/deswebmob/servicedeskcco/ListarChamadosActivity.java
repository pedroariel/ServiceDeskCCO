package br.usjt.deswebmob.servicedeskcco;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import br.usjt.deswebmob.servicedeskcco.model.ChamadoAdapter;
import br.usjt.deswebmob.servicedeskcco.model.Data;

public class ListarChamadosActivity extends Activity {
    public static String CHAMADO;
    ArrayList<String> chamados;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_chamados);
        chamados = Data.geraListaChamados(nomeFila);
        listView = (ListView) findViewById(R.id.lista_chamados);
        ChamadoAdapter adapter = new ChamadoAdapter(this, android.R.layout.simple_list_item_1,chamados);
        listView.setAdapter(adapter);
    }


    }


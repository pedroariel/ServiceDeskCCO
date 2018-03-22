package br.usjt.deswebmob.servicedeskcco.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import br.usjt.deswebmob.servicedeskcco.R;

/**
 * Created by arqdsis on 21/03/2018.
 */

public class ChamadoAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Chamado> chamado;

    public ChamadoAdapter(Context context, ArrayList<Chamado> chamado) {
        this.context = context;
        this.chamado = chamado;
    }

    @Override
    public int getCount() {
        return chamado.size();
    }

    @Override
    public Object getItem(int position) {
        return chamado.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view = converView;

        if(view == null) {
            LayoutInflater inflater = (LayoutInflater)
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.linha_chamado, parent, attachToRoot:false);
        }
        ImageView imagem = (ImageView)view.findViewById(R.id.imagem_fila);
        TextView numero = (TextView)view.findViewById(R.id.numero_status_chamado);
        TextView datas = (TextView)view.findViewById(R.id.abertura_fechamento_chamado);
        TextView descricao = (TextView)view.findViewById(R.id.descricao_chamado);
        ViewHolder viewHolder = new ViewHolder();
        viewHolder.setNumero(numero);
        viewHolder.setDatas(datas);
        viewHolder.setDescricao(descricao);
        viewHolder.setImagem(imagem);
        view.setTag(viewHolder);

        Chamado chamado = chamado.get(positon);

        viewHolder viewHolder1 = (ViewHolder)view.getTag();

        imagem.setImageDrawable(Util.getDrawableDinamic(context, chamado.getFila().getFigura()))
        numero.setText(String.format("numero: %d - status:%s", chamado.getNumero(),chamado.getStatus()));
        datas.setText(String.format("abertura:%tD - fechamento %td",
                chamado.getDataAbertura(), chamado.getDataFechamento()));
        descricao.setText(chamado.getDescricao());
        return view;
    }
}

package br.usjt.deswebmob.servicedeskcco.model;

import android.app.Activity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by arqdsis on 21/03/2018.
 */

public class Data {


    public static ArrayList<Chamado> busvarChamados(String chave){
        ArrayList<Chamado> lista = geraListaChamados();
        if(chave == null || chave)
    }


    public static ArrayList<Chamado> geraListaChamados(){
        ArrayList<Chamado> lista = new ArrayList<>();

        Chamado chamado = new Chamado();
        chamado.setNumero(1);
        chamado.setDataAbertura(new Date());;
        chamado.setDataFechamento(null);;
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("Computador da secretária quebrado.");
        Fila fila = new Fila();
        fila.setId(FilaId.DESKTOPS.id());
        fila.setNome(FilaId.DESKTOPS.nome());
        fila.setFigura(FilaId.DESKTOPS.figura());
        chamado.setFila(fila);
        lista.add(chamado);


        chamado = new Chamado();
        chamado.setNumero(2);
        chamado.setDataAbertura(new Date());;
        chamado.setDataFechamento(null);;
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("Telefone não funciona.");
        fila.setId(FilaId.TELEFONIA.id());
        fila.setNome(FilaId.TELEFONIA.nome());
        fila.setFigura(FilaId.TELEFONIA.figura());
        chamado.setFila(fila);
        lista.add(chamado);


        chamado = new Chamado();
        chamado.setNumero(3);
        chamado.setDataAbertura(new Date());;
        chamado.setDataFechamento(null);;
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("Telefone não funciona.");
        fila.setId(FilaId.DESKTOPS.id());
        fila.setNome(FilaId.DESKTOPS.nome());
        fila.setFigura(FilaId.DESKTOPS.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        chamado = new Chamado();
        chamado.setNumero(4);
        chamado.setDataAbertura(new Date());;
        chamado.setDataFechamento(null);;
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("Telefone não funciona.");
        fila.setId(FilaId.DESKTOPS.id());
        fila.setNome(FilaId.DESKTOPS.nome());
        fila.setFigura(FilaId.DESKTOPS.figura());
        chamado.setFila(fila);
        lista.add(chamado);


        chamado = new Chamado();
        chamado.setNumero(6);
        chamado.setDataAbertura(new Date());;
        chamado.setDataFechamento(null);;
        chamado.setStatus(Chamado.ABERTO);
        chamado.setDescricao("Gestão do Orçamento.");
        fila.setId(FilaId.PROJETO.id());
        fila.setNome(FilaId.PROJETO.nome());
        fila.setFigura(FilaId.PROJETO.figura());
        chamado.setFila(fila);
        lista.add(chamado);

        /*lista.add("Desktops: Computador da secretária quebrado.");
        lista.add("Telefonia: Telefone não funciona.");
        lista.add("Redes: Manutenção no proxy.");
        lista.add("Servidores: Lentidão generalizada.");
        lista.add("Novos Projetos: CRM");
        lista.add("Manutenção Sistema ERP: atualizar versão.");
        lista.add("Novos Projetos: Rede MPLS");
        lista.add("Manutenção Sistema de Vendas: incluir pipeline.");
        lista.add("Manutenção Sistema ERP: erro contábil");
        lista.add("Novos Projetos: Gestão de Orçamento");
        lista.add("Novos Projetos: Big Data");
        lista.add("Manoel de Barros");
        lista.add("Redes: Internet com lentidão");
        lista.add("Novos Projetos: Chatbot");
        lista.add("Desktops: troca de senha");
        lista.add("Desktops: falha no Windows");
        lista.add("Novos Projetos: ITIL V3");
        lista.add("Telefonia: liberar celular");
        lista.add("Telefonia: mover ramal");
        lista.add("Redes: ponto com defeito");
        lista.add("Novos Projetos: ferramenta EMM");*/
        return lista;
    }

}

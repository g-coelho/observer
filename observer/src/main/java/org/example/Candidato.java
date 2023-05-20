package org.example;

import java.util.Observable;
import java.util.Observer;

public class Candidato implements Observer {
    private String nome;
    private String ultimaNotificacao;

    public Candidato(String nome){
        this.nome = nome;
    }

    public String getUltimaNotificacao(){
        return this.ultimaNotificacao;
    }

    public void candidatar(Vaga vaga){
        vaga.addObserver(this);
    }

    @Override
    public void update(Observable vaga, Object arg1) {
        this.ultimaNotificacao = this.nome + ", cadidatura atualizada para: " + vaga.toString();
    }
}
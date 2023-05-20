package org.example;

import java.util.Observable;

public class Vaga extends Observable {
    private String cargo;
    private Float salario;
    private Integer vagas;


    public Vaga(String cargo, Float salario, Integer vagas) {
        this.cargo = cargo;
        this.salario = salario;
        this.vagas = vagas;
    }

    public void lancarResultado(){
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Vaga{" +
                "cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", vagas=" + vagas +
                '}';
    }
}

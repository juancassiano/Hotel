package model;

import enumeration.Diaria;
import enumeration.Itens;

public class Hospede {
    private String cpf;
    private String nome;
    private Long periodo;

    public Hospede() {
        this.cpf = cpf;
        this.nome = nome;
        this.periodo = periodo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Long periodo) {
        this.periodo = periodo;
    }
}

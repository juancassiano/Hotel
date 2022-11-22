package model;

import enumeration.Diaria;
import enumeration.Itens;

public class Hospede {
    private String cpf;
    private String nome;
    private Quarto quarto;
    private Long periodo;

    private Double valorTotal = 0.0;

    private Itens itens;
    private Diaria valorDia;

    public Hospede() {
        this.cpf = cpf;
        this.nome = nome;
        this.quarto = quarto;
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

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Long getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Long periodo) {
        this.periodo = periodo;
    }

    public Itens getItens() {
        return itens;
    }

    public void setItens(Itens itens) {
        this.itens = itens;
    }

    public Diaria getValorDia() {
        return valorDia;
    }

    public void setValorDia(Diaria valorDia) {
        this.valorDia = valorDia;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
}

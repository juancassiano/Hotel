package model;

import enumeration.Diaria;
import enumeration.Itens;

import java.util.ArrayList;
import java.util.List;

public class Quarto {

    private Integer QUANTIDADE_DISPONIVEL = 3;

    private Long id;
    private Boolean disponivel;
    private Itens itens;
    private Diaria valorDia;
    private Integer periodo;

    private Hospede hospede;
    private Double valorConsumo;
    private Double valorEstadia;

    private Double valorTotal;

    public void checkIn(Hospede hospede, Boolean disponivel, Integer QUANTIDADE_DISPONIVEL){
        this.disponivel = QUANTIDADE_DISPONIVEL > 0;
        QUANTIDADE_DISPONIVEL --;
    }

    public Double consumir(Itens itens){
        return this.valorConsumo = getValorConsumo() * getItens().valorItem;
    }

    public Double calcularEstadia(Double valorConsumo, Integer periodo){
        return this.valorEstadia = getValorEstadia() * periodo;
    }

    public Double checkOut(Double valorConsumo, Double valorEstadia){
        return this.valorTotal = valorConsumo + valorEstadia;
    }


    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Quarto(){

    }
    public Quarto(Long id, Integer periodo, Hospede hospede) {
        this.id = id;
        this.hospede = hospede;
        this.periodo = periodo;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getValorConsumo() {
        return valorConsumo;
    }

    public void setValorConsumo(Double valorConsumo) {
        this.valorConsumo = valorConsumo;
    }

    public Double getValorEstadia() {
        return valorEstadia;
    }

    public void setValorEstadia(Double valorEstadia) {
        this.valorEstadia = valorEstadia;
    }

    public Itens getItens() {
        return itens;
    }

    public void setItens(Itens itens) {
        this.itens = itens;
    }

    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public Diaria getValorDia() {
        return valorDia;
    }

    public void setValorDia(Diaria valorDia) {
        this.valorDia = valorDia;
    }

    public int getQuantidadeDisponivel() {
        return QUANTIDADE_DISPONIVEL;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        QUANTIDADE_DISPONIVEL = quantidadeDisponivel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }
}

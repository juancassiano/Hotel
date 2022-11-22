package model;

import enumeration.Diaria;
import enumeration.Itens;

import java.util.ArrayList;
import java.util.List;

public class Quarto {

    private Integer QUANTIDADE_DISPONIVEL = 3;

    private Integer id = 0;
    private Boolean disponivel;
    private Itens itens;
    private Diaria valorDia;
    private Integer periodo;

    private Hospede hospede;
    private Double valorConsumo;
    private Double valorEstadia;

    private Double valorTotal;

    public void checkIn(Hospede nomeHospede, Hospede cpfHospede, Boolean disponivel, Integer QUANTIDADE_DISPONIVEL, Integer id){
        this.disponivel = QUANTIDADE_DISPONIVEL > 0;
        if(!this.disponivel){
            throw new RuntimeException("Sinto muito! Estamos lotados");
        }
        this.setHospede(nomeHospede, cpfHospede);
        QUANTIDADE_DISPONIVEL --;
        this.id++;
    }

    public Double consumir(Itens itens){
        return this.valorConsumo = getValorConsumo() * getItens().valorItem;
    }

    public Double calcularEstadia(Double valorConsumo, Integer periodo){
        return this.valorEstadia = getValorEstadia() * periodo;
    }

    public Double checkOut(Double valorConsumo, Double valorEstadia, Integer QUANTIDADE_DISPONIVEL){
        this.QUANTIDADE_DISPONIVEL++;
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
    public Quarto(Integer id, Integer periodo, Hospede hospede) {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }
}

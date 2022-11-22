package model;

import enumeration.Diaria;
import enumeration.Itens;

import java.util.ArrayList;
import java.util.List;

public class Quarto {

    private static int QUANTIDADE_DISPONIVEL = 10;

    private Long id;
    private Boolean disponivel = QUANTIDADE_DISPONIVEL > 0 ? true : false;


    public Quarto(Long id, Boolean disponivel) {
        this.id = id;
        this.disponivel = disponivel;
    }

    public static int getQuantidadeDisponivel() {
        return QUANTIDADE_DISPONIVEL;
    }

    public static void setQuantidadeDisponivel(int quantidadeDisponivel) {
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

package com.fiap.demo.entity;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

/**
 * Mapeamento do "Desejo" usado na API passado os parâmetros que são utilizados no SQL de consulta.
 */
public class Desejo {

    private List <Produto> produto;

    public Desejo() {
        this.produto = new ArrayList<>();
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }
}

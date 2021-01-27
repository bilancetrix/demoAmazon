package com.fiap.demo.entity;



import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Mapeamento do "Produto" usado na API passado os parâmetros que são utilizados no SQL de consulta.
 */
@Entity
@Table(name = "tbl_produto")
public class Produto {

    @Id
    @JsonProperty("id")
    private Long id;

    @JsonProperty("Nome")
    private String nome;

    @JsonProperty("genero")
    private String genre;

    @JsonProperty("category")
    private String category;

    @JsonProperty("detalhes")
    private String details;

    @JsonProperty("visualizacoes")
    private int views;

    public Produto() {

    }

    public Produto(Long id, String nome, String genre, String details, int views) {
        super();
        this.id = id;
        this.nome = nome;
        this.genre = genre;
        this.details = details;
        this.views = views;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDetails(){
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }

    public int getViews(){
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}

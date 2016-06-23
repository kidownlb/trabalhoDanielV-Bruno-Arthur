/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.catolicasc.lanchonete;

import java.sql.Timestamp;

/**
 *
 * @author d.vieira
 */
public class Lanche implements Produto{
    private long id;
    private double preco;
    private String descricao;
    private Timestamp tempoPreparo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Timestamp getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(Timestamp tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }    

    @Override
    public long getId(long id) {
        return id;
    }

    @Override
    public double getPreco(double preco) {
        return preco;
    }
    
}

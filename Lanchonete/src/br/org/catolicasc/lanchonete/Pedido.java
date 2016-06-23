/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.catolicasc.lanchonete;

import java.util.Date;
import java.util.List;

/**
 *
 * @author d.vieira
 */
public class Pedido {
    private long id;
    private Date data;
    private List<ItemPedido> itens;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
    
    public double getPrecoTotal(){
        double precoTotal = 0;
        return precoTotal;
    }
}

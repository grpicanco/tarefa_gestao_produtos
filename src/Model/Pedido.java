/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author gabrielp
 */
public class Pedido {
    private int pedido;
    private Calendar dataPedido;
    private ArrayList<Item_pedido> itens;

    public Pedido(int pedido, Calendar dataPedido, ArrayList<Item_pedido> itens) {
        this.pedido = pedido;
        this.dataPedido = dataPedido;
        this.itens = itens;
    }

    public Pedido() {
    }

    public int getPedido() {
        return pedido;
    }

    public void setPedido(int pedido) {
        this.pedido = pedido;
    }

    public Calendar getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Calendar dataPedido) {
        this.dataPedido = dataPedido;
    }

    public ArrayList<Item_pedido> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item_pedido> itens) {
        this.itens = itens;
    }
    
    
    
}

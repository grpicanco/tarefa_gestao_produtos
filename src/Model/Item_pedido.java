/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author gabrielp
 */
public class Item_pedido {
    
    private int idPedido;
    private int idProduto;
    private int quantidade;
    private double valorProdutoDiaDaCompra;

    public Item_pedido(int idPedido, int idProduto, int quantidade, double valorProdutoDiaDaCompra) {
        this.idPedido = idPedido;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.valorProdutoDiaDaCompra = valorProdutoDiaDaCompra;
    }

    public Item_pedido() {
    }
    
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorProdutoDiaDaCompra() {
        return valorProdutoDiaDaCompra;
    }

    public void setValorProdutoDiaDaCompra(double valorProdutoDiaDaCompra) {
        this.valorProdutoDiaDaCompra = valorProdutoDiaDaCompra;
    }
    
    public double Calcularvalor(int quantidade, double valorProdutoDiaDaCompra){
       return this.quantidade * this.valorProdutoDiaDaCompra;
    }
}

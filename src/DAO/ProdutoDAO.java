/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author gabrielp
 */
public class ProdutoDAO {
    private Connection connection;

public ProdutoDAO(){
    this.connection = FabricaConexao.getConnection();
}

public boolean CadastrarProd(Produto produto){
    String sql = "call addd_produto(?,?,?,?)";    
    try {
        PreparedStatement ps;
        ps = connection.prepareCall(sql);
        ps.setString(1, produto.getDescricao());
        ps.setInt(2, produto.getQuantidade());
        ps.setDouble(3, produto.getValor());
        ps.setBoolean(4, true);
        ps.execute();
        connection.close();
        return true;
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}

public Vector<Produto> ListaDeProduto(){
    String sql = "call Lista_produtos()";
    try {
        PreparedStatement ps;
        ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        Vector<Produto> listaProdutos = new Vector();
        while(rs.next()){
            int id = rs.getInt("id");
            String descricao = rs.getString("Nome");
            int quantidade = rs.getInt("quantidade");
            double valor = rs.getDouble("valor");
            Produto p = new Produto(id, descricao,quantidade, valor);
            listaProdutos.add(p);
            
        }
        ps.close();
        connection.close();
        return listaProdutos;
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}

public boolean ExcluirProd(Produto produto){
    String sql = "call delt_produto(?)";
    try {
        PreparedStatement ps;
        ps = connection.prepareCall(sql);
        ps.setInt(1,produto.getIdProduto());
        ps.execute();
        connection.close();
        return true;
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
    
}

public boolean AtualizarProd(Produto produto){
    String sql = "call atualizar_produto(?,?,?,?)";
    try {
        PreparedStatement ps;
        ps = connection.prepareCall(sql);
        ps.setInt(1, produto.getIdProduto());
        ps.setString(2, produto.getDescricao());
        ps.setInt(3, produto.getQuantidade());
        ps.setDouble(4, produto.getValor());
        ps.execute();
        connection.close();
        return true;
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}

}
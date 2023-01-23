
package com.sandoval.model.dao;

import com.sandoval.connection.ConnectionFactory;
import com.sandoval.model.beans.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ProdutoDao {
    
    public void create(Produto produto) {
        
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
        try {
            stmt = con.prepareStatement("INSERT INTO produto (generico, comercial, fabricante, valor, consumo, tarja)VALUES(?,?,?,?,?,?)");
            stmt.setString(1, produto.getGenerico());
            stmt.setString(2, produto.getComercial());
            stmt.setString(3, produto.getFabricante());
            stmt.setString(4, produto.getValor());
            stmt.setString(5, produto.getConsumo());
            stmt.setString(6, produto.getTarja());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
    }
    
}

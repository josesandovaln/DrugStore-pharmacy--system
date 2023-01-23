
package com.sandoval.model.dao;

import com.sandoval.connection.ConnectionFactory;
import com.sandoval.model.beans.Cadastro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class CadastroDao {
    
    public void create(Cadastro cadastro) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
    
            try {
                stmt = con.prepareStatement("INSERT INTO cadastro (nome, usuario, senha, telefone, endereco, numero, bairro, cidade, cep)VALUES(?,?,?,?,?,?,?,?,?)");
                stmt.setString(1, cadastro.getNome());
                stmt.setString(2, cadastro.getUsuario());
                stmt.setString(3, cadastro.getSenha());
                stmt.setString(4, cadastro.getTelefone());
                stmt.setString(5, cadastro.getEndereco());
                stmt.setString(6, cadastro.getNumero());
                stmt.setString(7, cadastro.getBairro());
                stmt.setString(8, cadastro.getCidade());
                stmt.setString(9, cadastro.getCep());
            
                stmt.executeUpdate();
            
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar " + ex);
            }finally{
                ConnectionFactory.closeConnection(con, stmt);
            }
        
    }
    
    
    
}

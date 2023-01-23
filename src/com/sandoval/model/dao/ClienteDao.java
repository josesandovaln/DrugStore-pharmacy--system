
package com.sandoval.model.dao;

import java.sql.PreparedStatement;
import com.sandoval.connection.ConnectionFactory;
import com.sandoval.model.beans.Cliente;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteDao {
    
    public void create(Cliente cliente){
        
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
        try {
            stmt = con.prepareStatement("INSERT INTO cliente (nome, cpf, nascimento, sexo, telefone, email)VALUES(?,?,?,?,?,?)");
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getNascimento());
            stmt.setString(4, cliente.getSexo());
            stmt.setString(5, cliente.getTelefone());
            stmt.setString(6, cliente.getEmail());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
}

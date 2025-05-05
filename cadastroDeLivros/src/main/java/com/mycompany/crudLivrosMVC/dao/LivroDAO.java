
package com.mycompany.crudLivrosMVC.dao;


import com.mycompany.crudLivrosMVC.model.Livro;
import com.mycompany.crudLivrosMVC.database.ConexaoSql;
import com.mycompany.crudLivrosMVC.database.ConexaoSql;



import java.sql.Connection;
import com.mycompany.crudLivrosMVC.database.ConnectSQLites;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class LivroDAO {
    private Connection connection
            
     public void Conectar() throws SQLException{
         String url = "jdbc:mysql://localhost:3306/biblioteca";
         String user = "root";
         String password = "root";
        connection = DriverManager.getConnection();
        }
           

  
     
  
   
    public void inserirLivro(Livro livro) throws SQLException {
         ConnectSQLite connectSQLite = new ConnectSQLite();
        Connection connection = connectSQLite.connect();
        String sql = "INSERT INTO livro (titulo, autor) VALUES (?, ?)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(2, livro.getTitulo());
        stmt.setString(3, livro.getAutor());
        stmt.executeUpdate();
        stmt.close();
           
    }
    
    
     public ArrayList<Livro> listar() throws SQLException {
        ArrayList<Livro> livros = new ArrayList<>();
        ConnectSQLite connectSQLite = new ConnectSQLite();
        Connection connection = connectSQLite.connect();
        String sql = "SELECT * FROM livros";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            Livro livro = new Livro(rs.getString("titulo"), rs.getString
        ("autor"));
            livro.setId(rs.getInt("id"));
            livros.add(livro);
        }
        rs.close();
        stmt.close();
        return livros;
     }
    
    
    public void atualizarLivro(Livro livro)  throws SQLException{
        ConnectSQLite connectSQLite = new ConnectSQLite();
        Connection connection = connectSQLite.connect();

        String sql = "UPDATE livros SET titulo = ?, autor = ?, ano = ?"
                + " WHERE id = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(2, livro.getTitulo());
        stmt.setString(3, livro.getAutor());
        stmt.setInt(1, livro.getId());
        stmt.executeUpdate();
        stmt.close();
        
        
    }
    
   
    public void apagarLivro(int id) throws SQLException{
        ConnectSQLite connectSQLite = new ConnectSQLite();
        Connection connection = connectSQLite.connect();
        String sql = "DELETE FROM livros WHERE id = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.executeUpdate();
        stmt.close();
        
        
    }
    
    public void fechar() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }


   
}

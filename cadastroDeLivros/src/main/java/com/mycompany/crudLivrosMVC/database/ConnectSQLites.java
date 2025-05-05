
package com.mycompany.crudLivrosMVC.database;

    


import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectSQLites()   {
  public Connection conectar(){
    Connection connection = null;
    String url = "jdbc:mysql://localhost:3306/projetomvc";
    
    String sql = "CREATE TABLE IF NOT EXISTS biblioteca ("
                + "id INT AUTO_INCREMENT PRIMARY KEY, "
                + "titulo VARCHAR(255) NOT NULL UNIQUE, "
                + "autor VARCHAR(255) NOT NULL UNIQUE)";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException error) {
            throw new RuntimeException("Erro ao criar a tabela", error);
        }
    
    
        try{
        connection = DriverManager.getConnection(url);
            System.out.println("Succesfully connected to database.");
        }
        catch(SQLException error){
            System.out.println("Error: " + error.getMessage());
        }
        return connection;
  }
}

  public void disconnect(Connection connection){
       if(connection != null){
           try{
       connection.close();
               System.out.println("Connection closed.");
           }
           catch(SQLException error){
               System.out.println("Error: " + error.getMessage());
           }
       }else{
           System.out.println("Connection not found.");
       }
       
  
  
  
   
    public class Connection conectar() {
        try {
            
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, 
            DB_USER, DB_PASSWORD);
                criarTabela();
                System.out.println("Conectado ao banco.");
            }
        } catch (SQLException error) {
            throw new RuntimeException("Erro na conexão com o banco de dados", error);
        }

        return connection;
    }

    
    public  void criarTabela()  {
        String sql = "CREATE TABLE IF NOT EXISTS biblioteca ("
                + "id INT AUTO_INCREMENT PRIMARY KEY, "
                + "titulo VARCHAR(255) NOT NULL UNIQUE, "
                + "autor VARCHAR(255) NOT NULL UNIQUE)";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException error) {
            throw new RuntimeException("Erro ao criar a tabela", error);
        }
    }
}

   

  

  





package com.mycompany.crudLivrosMVC.controller;


import com.mycompany.crudLivrosMVC.database.ConexaoSql;
import com.mycompany.crudLivrosMVC.dao.LivroDAO;


import java.sql.Connection;

   

    
   
        public class LivroController{
           LivroDAO dao = new LivroDAO();
            ConexaoSql connectSQLite  =  new ConexaoSql();
           Connection connection = connectSQLite.conectar();
            

           //CreateTables.createTables(connection);
          
       
        //LivroDAO.inserirLivro(1,"O Senhor dos Anéis", "J.R.R. Tolkien");
        
        //dao.listarLivros();
        
       // LivroDAO.inserirLivro(2,"A Cabana", " William P. Young");
           //dao.apagarLivro(1);
        //LivroDAO.atualizarLivro(2,"A Cabana","W.P.Y.")

   
 
        
        
    }
    



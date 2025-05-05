
package com.mycompany.crudLivrosMVC;

import com.mycompany.crudLivrosMVC.dao.LivroDAO;
import com.mycompany.crudLivrosMVC.database.ConnectSQLites;
import com.mycompany.crudLivrosMVC.view.LivroView;
import java.sql.Connection;


public class App {
    public static void main(String[] args) {
       LivroDAO dao = new LivroDAO();
       ConnectSQLites connectSQLite  =  new ConnectSQLites();
      Connection connection = connectSQLite.conectar();


Connection conn = ConnectSQLites.conectar();
       new LivroView(connection, "1", "Harry Potter", "J.K.Rowling")
               .setVisible(true);
    }
}

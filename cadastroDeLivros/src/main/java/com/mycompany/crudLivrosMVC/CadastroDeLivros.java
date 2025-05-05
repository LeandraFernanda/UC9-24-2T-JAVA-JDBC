

package com.mycompany.crudLivrosMVC;

import com.mycompany.crudLivrosMVC.dao.LivroDAO;
import com.mycompany.crudLivrosMVC.model.Livro;
import java.sql.SQLException;


public class CadastroDeLivros {

    public static void main(String[] args) throws SQLException {
       
LivroDAO dao = new LivroDAO();

// Inserir
//Livro novoLivro = new Livro("Dom Casmurro", 
//"Machado de Assis", 1899);
//dao.inserirLivro(novoLivro);

// Listar
//List<Livro> todosLivros = dao.listarLivros();

// Atualizar
Livro novoLivro = new Livro("Memórias Póstumas",
        "Machado de Assis");
dao.inserirLivro(novoLivro);
//dao.atualizarLivro(livroAtualizado);

//Apagar
//dao.apagarLivro();


   
        
    }

    
}

/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package modelosDAO;

import DatabaseConnection.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelosBean.marcaEPI;

/**
 *
 * @author guidi
 */
public class marcaEPIDAO {
    
public static boolean criaMarcaEPI(marcaEPI m) throws SQLException, ClassNotFoundException{
    
  Connection con = conexao.getConnection(); // Busca uma conexão com o banco de dados

PreparedStatement stmt;

 // Inserindo o comando SQL a ser usado

stmt = con.prepareStatement("INSERT INTO marcaEPI (nome, codEPI) VALUES (? ,?) ");

 // O método setString, define que o valor passado será do tipo inteiro
 stmt.setString(1, m.getNome());
 stmt.setInt(2, m.getCodEPI());

    // Método responsável por fazer a alteração no banco de dados
 if(! stmt.execute()){
     stmt.close();
        con.close();
       return true;
 }
con.close();
return false ;
}
    
}

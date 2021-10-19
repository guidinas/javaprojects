/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package modelosDAO;

import DatabaseConnection.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author guidi
 */
public class responsavelDAO {
public static ResultSet listaResponsavel() throws SQLException, ClassNotFoundException{
Connection con = conexao.getConnection(); // Busca uma conexão com o banco de dados
PreparedStatement stmt;
try{
 // Inserindo o comando SQL a ser usado
stmt = con.prepareStatement("SELECT  * FROM responsavel  ");
 // O método setString, define que o valor passado será do tipo inteiro
    // Método responsável por fazer a alteração no banco de dados
    boolean executeok = stmt.execute();
   ResultSet resul = stmt.getResultSet();
    System.out.println(resul);
    return resul;
}catch(SQLException ex){  // Tratamento  das exceções
System.out.println(ex);
} finally{ // Encerramento da conexão
conexao.closeConnection();
    
}
return null;
}
    
}

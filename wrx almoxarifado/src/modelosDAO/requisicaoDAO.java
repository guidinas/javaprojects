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
import modelosBean.requisicao;

/**
 *
 * @author guidi
 */
public class requisicaoDAO {
    public static boolean criaRequisicao(requisicao m) throws SQLException, ClassNotFoundException{
    
  Connection con = conexao.getConnection(); // Busca uma conexão com o banco de dados

PreparedStatement stmt;

try{

 // Inserindo o comando SQL a ser usado

stmt = con.prepareStatement("INSERT INTO requisicaoSaida (codResponsavel,codFuncionario) VALUES (?,?) ");

 // O método setString, define que o valor passado será do tipo inteiro
 stmt.setInt(1, m.getCodResponsavel());
 stmt.setInt(2, m.getCodFuncionario());


    // Método responsável por fazer a alteração no banco de dados
    boolean executeok = stmt.execute();
    stmt.close();
       return true;

}catch(SQLException ex){  // Tratamento das exceções

System.out.println(ex);

} finally{ // Encerramento da conexão
}
return false ;
}
}

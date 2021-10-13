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
import modelosBean.login;

/**
 *
 * @author guidi
 */
public class loginDAO {
    // O retorno é vazio, e recebe um objeto do tipo Membros

public static boolean checaLogin(login m) throws SQLException, ClassNotFoundException{

Connection con = conexao.getConnection(); // Busca uma conexão com o banco de dados

PreparedStatement stmt = null;

try{

 // Inserindo o comando SQL a ser usado

stmt = con.prepareStatement("SELECT * FROM login WHERE login = ? AND senha = ? ");

 // O método setString, define que o valor passado será do tipo inteiro
 stmt.setString(1, m.getLogin());
 stmt.setString(2, m.getSenha());

    // Método responsável por fazer a alteração no banco de dados
    boolean executeok = stmt.execute();
   ResultSet A = stmt.getResultSet();
    while (A.next())
      {
        int id = A.getInt("cod");
        String firstName = A.getString("login");
        // print the results
        if(id>0){
            return true;
        }
      }
}catch(SQLException ex){  // Tratamento das exceções

System.out.println(ex);

} finally{ // Encerramento da conexão

conexao.closeConnection();

}
return false;
}
    
public static boolean criaLogin (login m) throws SQLException, ClassNotFoundException{
    
  Connection con = conexao.getConnection(); // Busca uma conexão com o banco de dados

PreparedStatement stmt = null;

try{

 // Inserindo o comando SQL a ser usado

stmt = con.prepareStatement("INSERT INTO login (login, senha, funcao) VALUES ( ?, ?, ?) ");

 // O método setString, define que o valor passado será do tipo inteiro
 stmt.setString(1, m.getLogin());
 stmt.setString(2, m.getSenha());
 stmt.setInt(3,m.getFuncao());

    // Método responsável por fazer a alteração no banco de dados
    boolean executeok = stmt.execute();
   if(executeok)
   {
       return true;
   }
}catch(SQLException ex){  // Tratamento das exceções

System.out.println(ex);

} finally{ // Encerramento da conexão

conexao.closeConnection();

}
return false ;
}
}

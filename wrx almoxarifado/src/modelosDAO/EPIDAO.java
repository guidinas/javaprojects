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
import modelosBean.EPI;

/**
 *
 * @author guidi
 */
public class EPIDAO {
    
    public static boolean criaEPI(EPI m) throws SQLException, ClassNotFoundException{
    
  Connection con = conexao.getConnection(); // Busca uma conexão com o banco de dados

PreparedStatement stmt;

try{

 // Inserindo o comando SQL a ser usado

stmt = con.prepareStatement("INSERT INTO EPI (nome, minimo ,maximo) VALUES ( ?, ?, ?) ");

 // O método setString, define que o valor passado será do tipo inteiro
 stmt.setString(1, m.getNome());
 stmt.setInt(2, m.getMinimo());
 stmt.setInt(3,m.getMaximo());

    // Método responsável por fazer a alteração no banco de dados
    boolean executeok = stmt.execute();
       return true;

}catch(SQLException ex){  // Tratamento das exceções

System.out.println(ex);

} finally{ // Encerramento da conexão

conexao.closeConnection();

}
return false ;
}
    
    /**
     *
     * @return a ResultSet with all the EPIs on database
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static ResultSet listaEPI() throws SQLException, ClassNotFoundException{
Connection con = conexao.getConnection(); // Busca uma conexão com o banco de dados
PreparedStatement stmt;
try{
 // Inserindo o comando SQL a ser usado
stmt = con.prepareStatement("SELECT  cod, nome  FROM epi  ");
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
    
   public static int buscaEPINome(String m) throws SQLException, ClassNotFoundException{
Connection con = conexao.getConnection(); // Busca uma conexão com o banco de dados
PreparedStatement stmt;
try{
 // Inserindo o comando SQL a ser usado
stmt = con.prepareStatement("SELECT  cod, nome  FROM epi WHERE nome = ? ");
 // O método setString, define que o valor passado será do tipo inteiro
    // Método responsável por fazer a alteração no banco de dados
    stmt.setString(1, m);
    boolean executeok;
    executeok = stmt.execute();
   ResultSet resul = stmt.getResultSet();
    System.out.println(resul);
    int cod;
    cod = resul.getInt("cod");
    return cod;
}catch(SQLException ex){  // Tratamento  das exceções
System.out.println(ex);
} finally{ // Encerramento da conexão
conexao.closeConnection();
    
}
return 0;
} 
}

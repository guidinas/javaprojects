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
    con.close();
       return true;

}catch(SQLException ex){  // Tratamento das exceções

System.out.println(ex);

} finally{ // Encerramento da conexão
}
con.close();
return false ;
}
    public static int criaRequisicaoCod(requisicao m) throws SQLException, ClassNotFoundException{
    
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
      

}catch(SQLException ex){  // Tratamento das exceções
    System.out.println(ex);
} finally{ // Encerramento da conexão
    }
    try{
        PreparedStatement stmt1;

       stmt1 = con.prepareStatement("SELECT cod , codResponsavel, codFuncionario  FROM  requisicaoSaida ORDER BY cod DESC LIMIT 1 ");
       if(stmt1.execute()){
           ResultSet req;
           req = stmt1.getResultSet();
           while(req.next()){
           if(req.getInt("codFuncionario") == m.getCodFuncionario() && req.getInt("codResponsavel") == m.getCodResponsavel() )  {
               int i = req.getInt("cod");
               con.close();
               return i;
           }  
               
           }
       }
 
}catch(SQLException ex){
    
}
return 0;
}
    
    /**
     *
     * @return A ResultSet with all the Requisicao on database or null if there was a problem with the Database
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static ResultSet listaRequisicao() throws SQLException, ClassNotFoundException{
        Connection con = conexao.getConnection(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt;
        try{
         // Inserindo o comando SQL a ser usado
        stmt = con.prepareStatement("SELECT *  FROM requisicaosaida  ORDER BY dataRequisicao DESC");
         // O método setString, define que o valor passado será do tipo inteiro
            // Método responsável por fazer a alteração no banco de dados
          if(stmt.execute()){
              ResultSet resul = stmt.getResultSet();
            return resul;
          } 
        }catch(SQLException ex){  // Tratamento  das exceções
        System.out.println(ex);
        } finally{ // Encerramento da conexão
        conexao.closeConnection();

        }
        con.close();
        return null;
    }
     public static ResultSet  listaRequisicaoPendente() throws SQLException, ClassNotFoundException{
        Connection con = conexao.getConnection(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt;
        try{
         // Inserindo o comando SQL a ser usado
        stmt = con.prepareStatement("SELECT *  FROM requisicaosaida WHERE stat = 0 ORDER BY dataRequisicao DESC");
         // O método setString, define que o valor passado será do tipo inteiro
            // Método responsável por fazer a alteração no banco de dados
           if(stmt.execute()){
              ResultSet resul = stmt.getResultSet();
            return resul;
          } 
        }catch(SQLException ex){  // Tratamento  das exceções
        System.out.println(ex);
        } finally{ // Encerramento da conexão
        conexao.closeConnection();

        }
        con.close();
        return null;
    }
    
    /**
     *
     * @param cod
     * @return 
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static requisicao retornaRequisicao(int cod) throws SQLException, ClassNotFoundException{
      Connection con = conexao.getConnection(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt;
        try{
         // Inserindo o comando SQL a ser usado
        stmt = con.prepareStatement("SELECT *  FROM requisicaosaida  WHERE cod = ? ");
        stmt.setInt(1, cod);
         // O método setString, define que o valor passado será do tipo inteiro
            // Método responsável por fazer a alteração no banco de dados
            boolean executeok = stmt.execute();
           ResultSet resul = stmt.getResultSet();
           if(executeok){
            while(resul.next()){
               requisicao req;
               req  =  new requisicao(resul.getInt("codFuncionario"), resul.getInt("cod"), resul.getInt("stat"), resul.getInt("codResponsavel"), resul.getTimestamp("dataRequisicao"));
               con.close();
             return req;   
            }
           }
        }catch(SQLException ex){  // Tratamento  das exceções
        System.out.println(ex);
        } finally{ // Encerramento da conexão
        conexao.closeConnection();

        }
        con.close();
        return null;
        
    }
    
    /**
     *
     * @param cod
     * @return true if update was done or false if there was a problem with the Database
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static boolean autorizaRequisicao(int cod ) throws SQLException, ClassNotFoundException{
        Connection con;
        con =  conexao.getConnection();
        PreparedStatement stmt;
        stmt = con.prepareStatement("UPDATE requisicaosaida set stat=1 WHERE cod  = ?");
        stmt.setInt(1, cod);
        boolean sal;
        sal = ! stmt.execute();
        con.close();
        return  sal;
    }

    /**
     *
     * @param cod
     * @return true if update was done or false if there was a problem with the Database
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static boolean negaRequisicao(int cod ) throws SQLException, ClassNotFoundException{
        Connection con;
        con =  conexao.getConnection();
        PreparedStatement stmt;
        stmt = con.prepareStatement("UPDATE requisicaosaida set stat= 5 WHERE cod  = ?");
        stmt.setInt(1, cod);
        boolean sal = ! stmt.execute();
        con.close();
        
        return sal;
    }
}

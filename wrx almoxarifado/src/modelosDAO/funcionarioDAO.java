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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import modelosBean.funcionario;

/**
 *
 * @author guidi
 */
public class funcionarioDAO {

    /**
     *
     * @param m
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static boolean criaFuncionario(funcionario m) throws SQLException, ClassNotFoundException{
    
  Connection con = conexao.getConnection(); // Busca uma conexão com o banco de dados

PreparedStatement stmt;

try{

 // Inserindo o comando SQL a ser usado

stmt = con.prepareStatement("INSERT INTO funcionario (nome, funcao, admissao,matricula) VALUES (? ,? , DATE ? , ?) ");

 // O método setString, define que o valor passado será do tipo inteiro
    stmt.setString(1, m.getNome());
    stmt.setInt(2, m.getFuncao());
    stmt.setString(3, m.getAdmissao());
    stmt.setString(4, m.getMatricula());
    // Método responsável por fazer a alteração no banco de dados
    if(stmt.execute()){ 
    con.close();
       return true;
    }
}catch(SQLException ex){  // Tratamento das exceções
System.out.println(ex);
} finally{ // Encerramento da conexão
}
con.close();
return false ;
}

    /**
     *
     * @return A ResultSet with all the Funcionarios on the system of null if there was a problem with the connection.
     * @throws SQLException
     * @throws ClassNotFoundException
     * @
     * @deprecated 
     */
    public static ResultSet listaFuncionario() throws SQLException, ClassNotFoundException{
Connection con = conexao.getConnection(); // Busca uma conexão com o banco de dados
PreparedStatement stmt;
try{
 // Inserindo o comando SQL a ser usado
stmt = con.prepareStatement("SELECT  *  FROM funcionario WHERE stat = 1 ORDER BY nome  ");
 // O método setString, define que o valor passado será do tipo inteiro
    // Método responsável por fazer a alteração no banco de dados
    if (stmt.execute()){
    ResultSet resul;
    resul = stmt.getResultSet();
    System.out.println(resul);
    con.close();
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
     * @return A String with the name of the Funcionario with this code or null if there was a problem with the connection.
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static String nomeFuncionarioporCodigo(int cod) throws SQLException, ClassNotFoundException{
        Connection con = conexao.getConnection();
        PreparedStatement stmt;
        stmt = con.prepareStatement("SELECT nome FROM funcionario WHERE cod  = ?");
        stmt.setInt(1, cod);
        if(stmt.execute()){
        ResultSet func;
        func = stmt.getResultSet();
        if(func!=null){
            while(func.next()){
                String i;
                i  =  func.getNString("nome");
                con.close();
                return i;
            }
        }
        }
        
        con.close();
        return null;
    }
   public static  String nomeFuncionarioCod(int cod) throws SQLException, ClassNotFoundException{
        Connection con;
        con = conexao.getConnection();
        PreparedStatement stmt;
        stmt = con.prepareStatement("SELECT nome from funcionario WHERE cod  = ?");
        stmt.setInt(1, cod);
        if(stmt.execute()){
            ResultSet a;
            a = stmt.getResultSet();
            while(a.next()){
                String i = a.getString("nome");
                con.close();
                return i;
            }
        }
        
        
        con.close();
        return null;
      }

    public static ArrayList<funcionario> listaFuncionarioArray(){
        try{
        DateFormat form;
        form = new SimpleDateFormat("dd/mm/yyyy");
        Connection con;
        con = conexao.getConnection();
        PreparedStatement stmt;
        stmt = con.prepareCall("SELECT * FROM funcionario WHERE stat = 1 ORDER BY nome");
        if( stmt.execute()){
            ResultSet a;
            ArrayList <funcionario> func;
            func = new ArrayList<>();
            a = stmt.getResultSet();
            while(a.next()){
                func.add(new funcionario(a.getInt("cod"), a.getString("nome"),a.getInt("funcao") , form.format(a.getDate("admissao")),a.getString("matricula")));
            }
            con.close();
            return func;
        }
        }catch(SQLException| ClassNotFoundException e){
            System.out.println(e);
        }
      return null;
        
    }
    public static boolean desativaFunc(funcionario m){
        try{
            Connection con;
            con = conexao.getConnection();
            PreparedStatement stmt;
            stmt = con.prepareCall("UPDATE funcionario SET stat = 9 WHERE cod = ?");
            stmt.setInt(1, m.getCod());
            stmt.execute();
            con.close();
            return true;
        }catch(SQLException| ClassNotFoundException e){
            System.out.println(e);
        }
        return false;
    }

     
}

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
import modelosBean.funcionario;

/**
 *
 * @author guidi
 */
public class funcionarioDAO {
    public static boolean criaFuncionario(funcionario m) throws SQLException, ClassNotFoundException{
    
  Connection con = conexao.getConnection(); // Busca uma conexão com o banco de dados

PreparedStatement stmt;

try{

 // Inserindo o comando SQL a ser usado

stmt = con.prepareStatement("INSERT INTO funcionario (nome, funcao, admissao) VALUES (? ,? , DATE ? ) ");

 // O método setString, define que o valor passado será do tipo inteiro
    stmt.setString(1, m.getNome());
    stmt.setInt(2, m.getFuncao());
    stmt.setString(3, m.getAdmissao());
    // Método responsável por fazer a alteração no banco de dados
    if(stmt.execute()){ 
    stmt.close();
       return true;
    }
}catch(SQLException ex){  // Tratamento das exceções
System.out.println(ex);
} finally{ // Encerramento da conexão
}
return false ;
}

    /**
     *
     * @return A ResultSet with all the Funcionarios on the system of null if there was a problem with the connection.
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static ResultSet listaFuncionario() throws SQLException, ClassNotFoundException{
Connection con = conexao.getConnection(); // Busca uma conexão com o banco de dados
PreparedStatement stmt;
try{
 // Inserindo o comando SQL a ser usado
stmt = con.prepareStatement("SELECT  *  FROM funcionario  ");
 // O método setString, define que o valor passado será do tipo inteiro
    // Método responsável por fazer a alteração no banco de dados
    if (stmt.execute()){
    ResultSet resul;
    resul = stmt.getResultSet();
    System.out.println(resul);
    return resul;
    }
}catch(SQLException ex){  // Tratamento  das exceções
System.out.println(ex);
} finally{ // Encerramento da conexão
conexao.closeConnection();
    
}
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
                return func.getNString("nome");
            }
        }
        }
        
        
        return null;
    }
}

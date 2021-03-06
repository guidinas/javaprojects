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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelosBean.responsavel;

/**
 *
 * @author guidi
 */
public class responsavelDAO {

    /**
     *
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static ResultSet listaResponsavel() throws SQLException, ClassNotFoundException{
        Connection con = conexao.getConnection(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt;
            try{
             // Inserindo o comando SQL a ser usado
                stmt = con.prepareStatement("SELECT  cod , nome FROM responsavel  ");
                 // O método setString, define que o valor passado será do tipo inteiro
                    // Método responsável por fazer a alteração no banco de dados
                    boolean executeok = stmt.execute();
                   ResultSet resul = stmt.getResultSet();
                    return resul;
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
     * @param m
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static boolean criaResponsavel(responsavel m) throws SQLException, ClassNotFoundException{

          Connection con = conexao.getConnection(); // Busca uma conexão com o banco de dados

             PreparedStatement stmt;

            try{

                // Inserindo o comando SQL a ser usado

               stmt = con.prepareStatement("INSERT INTO responsavel (nome,senha) VALUES (?,?) ");

                // O método setString, define que o valor passado será do tipo inteiro
                stmt.setString(1, m.getNome());
                stmt.setString(2,m.getSenha());


                   // Método responsável por fazer a alteração no banco de dados
                   boolean executeok = stmt.execute();
                    con.close();
                      return true;

           }catch(SQLException ex){  // Tratamento das exceções

           System.out.println(ex);

           } finally{ // Encerramento da conexão
                    }
             con.close();
            return false ;
        }

    public static String nomeResponsavelCod(int codResponsavel) throws SQLException, ClassNotFoundException {
        Connection con;
        con = conexao.getConnection();
       PreparedStatement stmt;
       stmt = con.prepareCall("SELECT nome FROM responsavel WHERE cod = ?");
       stmt.setInt(1, codResponsavel);
       if(stmt.execute()){
           ResultSet resul;
           resul = stmt.getResultSet();
           while(resul.next()){
               String i = resul.getString("nome");
                con.close();
               return i;
           }
       }
        con.close();
        return null;
            }

    /**
     *
     * @return
     */
    public static ArrayList<responsavel> listaResponsavelArray() throws SQLException, ClassNotFoundException {
         Connection con = conexao.getConnection(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt;
        ArrayList <responsavel> result;
        result = new ArrayList<>();
            try{
             // Inserindo o comando SQL a ser usado
                stmt = con.prepareStatement("SELECT  cod , nome,senha FROM responsavel  ");
                 // O método setString, define que o valor passado será do tipo inteiro
                    // Método responsável por fazer a alteração no banco de dados
                    boolean executeok = stmt.execute();
                   ResultSet resul = stmt.getResultSet();
                   while(resul.next()){
                       result.add(new responsavel(resul.getString("nome"),resul.getString("senha"), resul.getInt("cod")));
                   }
                   con.close();
                   return result;
                   
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
     * @param digitada
     * @return
     * @deprecated 
     */
    public static boolean checaSenha(String digitada) {
       try{
            Connection con;
        con = conexao.getConnection();
        PreparedStatement stmt;
        stmt = con.prepareCall("SELECT * from responsavel");
        if(stmt.execute()){
            ResultSet res;
            res = stmt.getResultSet();
            while(res.next()){
                if(digitada == res.getString("senha")){
                    con.close();
                    return true;
                }
            }
            
        }
            con.close();
            return false;
       }catch(SQLException | ClassNotFoundException e){
           JOptionPane.showMessageDialog(null, e);
           return false;
       }
        
        
    }

    /**
     *
     * @param senha
     * @return
     */
    public static int checaSenhaInt(String senha) {
         try{
            Connection con;
        con = conexao.getConnection();
        PreparedStatement stmt;
        stmt = con.prepareCall("SELECT * from responsavel");
        if(stmt.execute()){
            ResultSet res;
            res = stmt.getResultSet();
            while(res.next()){
                if(senha.equalsIgnoreCase(res.getString("senha")) ){
                    return res.getInt("cod");
                }
            }
        }
       }catch(SQLException | ClassNotFoundException e){
           System.out.println(e);
           return -1;
       }
        return -1;
    }
}

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
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import modelosBean.EPIMarca;

/**
 *
 * @author guidi
 */
public class EPIMarcaDAO {

    /**
     *
     * @param m
     * @return true if it was possible to add the new EPI and false otherwise
     * 
     */
    public static boolean criaEPIMarca(EPIMarca m) {
        try{
        Connection con;
        con  = conexao.getConnection();
        PreparedStatement stmt;
        stmt = con.prepareCall("INSERT into epicompleto (nome,minimo,maximo, nomemarca, ca, validade, descricao) VALUES (?, ?, ?, ?, ?, ?, ?)");
        stmt.setString(1, m.getNome());
        stmt.setString(4, m.getMarca());
        stmt.setString(5, m.getCA());
        stmt.setInt(2, m.getMinimo());
        stmt.setString(7,m.getDescricao());
        stmt.setInt(3, m.getMaximo());
        stmt.setDate(6, new java.sql.Date(m.getValidade().getTime()));
        stmt.execute();
        con.close();
        }catch(ClassNotFoundException | SQLException  e){
            System.out.println(e);
            return false;
        }
        return true;
    }

    /**
     *
     * @return an Array with all the EPIMarca on the Database
     */
    public static ArrayList<EPIMarca> retornaEPIMarcaArray(){
        try{
            Connection con;
            con = conexao.getConnection();
            PreparedStatement stmt;
           stmt = con.prepareCall("SELECT * FROM epicompleto ORDER BY nome ASC");
           if(stmt.execute()){
               ResultSet res;
               res = stmt.getResultSet();
               ArrayList<EPIMarca> array;
               array = new ArrayList<>();
               while(res.next()){
                   array.add(new EPIMarca(res.getInt("cod"),res.getString("nome"),res.getInt("maximo"), res.getInt("minimo"), res.getString("descricao"), res.getString("CA"), res.getDate("validade"), res.getString("nomeMarca"), res.getInt("quantidade")));
               }
               con.close();
               return array;
           }else{
               return null;
           }
        }catch(SQLException | ClassNotFoundException e){
            System.out.println(e);
            return null;
        }
    }

    /**
     *
     * @param e
     * @return
     */
    public static boolean adicionaQuantidadeEPI(EPIMarca  e){
        try{
            Connection con;
            con = conexao.getConnection();
            PreparedStatement stmt;
            stmt = con.prepareCall("UPDATE epicompleto SET quantidade = (quantidade + ?) WHERE cod = ?");
            stmt.setInt(1, e.getQuantidade());
            stmt.setInt(2, e.getCod());
            stmt.execute();
            con.close();
            return true;
        }catch(SQLException| ClassNotFoundException ex){
            System.out.println(ex);
            return false;
        }
        
    }

    public static boolean deletaFerramenta(EPIMarca selected) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean deletaEPI(EPIMarca selected) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean alteraEPI(EPIMarca selected) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

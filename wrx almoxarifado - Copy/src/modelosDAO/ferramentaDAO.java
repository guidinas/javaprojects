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
import java.util.logging.Level;
import java.util.logging.Logger;
import modelosBean.ferramenta;

/**
 *
 * @author guidi
 */
public class ferramentaDAO {
    public static boolean criaFerramenta(ferramenta m){
        try{
            Connection con;
            con = conexao.getConnection();
            PreparedStatement stmt;
            stmt = con.prepareCall("INSERT INTO ferramenta (nome, marca, registro,tipo) VALUES (?, ?, ?,?) ");
            stmt.setString(1, m.getNome());
            stmt.setString(2, m.getMarca());
            stmt.setString(3, m.getRegistro());
            stmt.setInt(4, m.getTipo());
            stmt.execute();
            con.close();
            return true;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
            return false;
        }

    }
    
    public static ArrayList<ferramenta> retornaFerramentaArray(){
        try{
        Connection con;
        con = conexao.getConnection();
        PreparedStatement stmt;
        stmt = con.prepareCall("SELECT * FROM ferramenta ORDER BY nome ASC ");
        if(stmt.execute()){
            ResultSet set;
            set = stmt.getResultSet();
            ArrayList<ferramenta> res;
            res = new ArrayList<>()
;            while(set.next()){
                res.add(new ferramenta(set.getString("nome"),set.getString("registro"), set.getString("marca"), set.getInt("cod"), set.getInt("stat"),set.getInt("quantidade"),set.getInt("tipo")));
            }
            con.close();
            return res;
        }
        return null;
            
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
            return null;
        }

        
    }

    public static ArrayList<ferramenta> retornaFerramentaQuantArray() {
         try{
        Connection con;
        con = conexao.getConnection();
        PreparedStatement stmt;
        stmt = con.prepareCall("SELECT * FROM ferramenta  ");
        if(stmt.execute()){
            ResultSet set;
            set = stmt.getResultSet();
            ArrayList<ferramenta> res;
            res = new ArrayList<>()
;            while(set.next()){
                res.add(new ferramenta(set.getString("nome"),set.getString("registro"), set.getString("marca"), set.getInt("cod"), set.getInt("stat"),set.getInt("quantidade"),set.getInt("tipo")));
            }
            con.close();
            return res;
        }
        return null;
            
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
            return null;
        }
         
    }

    public static boolean adicionaQuantidadeFeramenta(ferramenta selecionado) {
        try{
       Connection con;
       con = conexao.getConnection();
       PreparedStatement stmt;
       stmt = con.prepareCall("UPDATE ferramenta SET quantidade = (quantidade + ?) WHERE cod = ?");
       stmt.setInt(1, selecionado.getQuantidade());
       stmt.setInt(2 , selecionado.getCod());
       stmt.execute();
       con.close();
       return true;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
            return false;
        }
      
       
    }

    public static boolean deletaFerramenta(ferramenta selected) {
        try {
            Connection con;
            con = conexao.getConnection();
            PreparedStatement stmt;
            stmt = con.prepareCall("DELETE from ferramenta WHERE cod = ?");
            stmt.setInt(1, selected.getCod());
            stmt.execute();
            con.close();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ferramentaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static boolean alteraFerramenta(ferramenta selecionado) {
           try {
            Connection con;
            con = conexao.getConnection();
            PreparedStatement stmt;
            stmt = con.prepareCall("UPDATE ferramenta SET quantidade = ? ,nome = ?, registro = ?, marca = ? WHERE cod = ?");
            stmt.setInt(1, selecionado.getQuantidade());
            stmt.setString(2, selecionado.getNome());
            stmt.setString(3, selecionado.getRegistro());
            stmt.setString(4, selecionado.getMarca());
            stmt.setInt(5 , selecionado.getCod());
            stmt.execute();
            con.close();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ferramentaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
}

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
            stmt = con.prepareCall("INSERT INTO ferramenta (nome, marca, registro) VALUES (?, ?, ?) ");
            stmt.setString(1, m.getNome());
            stmt.setString(2, m.getMarca());
            stmt.setString(3, m.getRegistro());
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
        stmt = con.prepareCall("SELECT * FROM ferramenta ");
        if(stmt.execute()){
            ResultSet set;
            set = stmt.getResultSet();
            ArrayList<ferramenta> res;
            res = new ArrayList<>()
;            while(set.next()){
                res.add(new ferramenta(set.getString("nome"),set.getString("registro"), set.getString("marca"), set.getInt("cod"), set.getInt("stat")));
            }
            return res;
        }
        return null;
            
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
            return null;
        }

        
    }
    
    
}

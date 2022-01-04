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
import java.util.ArrayList;
import modelosBean.saidaConsumiveis;

/**
 *
 * @author guidi
 */
public class saidaConsumiveisDAO {
    public static boolean iniciaSaidaConsumiveisArray(ArrayList<saidaConsumiveis> m){
        try{
            Connection con;
            con = conexao.getConnection();
            PreparedStatement stmt;
           for(saidaConsumiveis e : m){
                 stmt = con.prepareCall("INSERT INTO saidaconsumiveis (codresp, codcons, codfunc, quantidade) VALUES ( ?, ?, ?, ?)");
                 stmt.setInt(1, e.getCodResp());
                 stmt.setInt(2, e.getCodcons());
                 stmt.setInt(3, e.getCodFunc());
                 stmt.setInt(4, e.getQuantidade());
                 stmt.execute();
            }
           return true;
        }catch(SQLException | ClassNotFoundException e){
            System.out.println(e);
            return false;
        }
        
    }
    
     public static boolean iniciaSaidaConsumiveis(saidaConsumiveis m){
        try{
            Connection con;
            con = conexao.getConnection();
            PreparedStatement stmt;
                 stmt = con.prepareCall("INSERT INTO saidaconsumiveis (codresp, codcons, codfunc, quantidade) VALUES ( ?, ?, ?, ?)");
                 stmt.setInt(1,m.getCodResp());
                 stmt.setInt(2, m.getCodcons());
                 stmt.setInt(3, m.getCodFunc());
                 stmt.setInt(4, m.getQuantidade());
                 stmt.execute();
                 con.close();
           return true;
        }catch(SQLException | ClassNotFoundException e){
            System.out.println(e);
            return false;
        }
        
    }
   
}




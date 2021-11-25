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
import modelosBean.consumivel;

/**
 *
 * @author guidi
 */
public class consumivelDAO {

    /**
     *
     * @param m
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static boolean criaConsumivel(consumivel m ) throws SQLException, ClassNotFoundException{
        Connection con;
        con = conexao.getConnection();
        PreparedStatement stmt;
        stmt = con.prepareCall("INSERT INTO consumivel (nome, min, max, marca) VALUES (?, ?, ?, ?)");
        stmt.setString(1, m.getNome());
        stmt.setInt(2, m.getMinimo());
        stmt.setInt(3, m.getMaximo());
        stmt.setString(4, m.getMarca());
        try{
            stmt.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e);
        }
        return false;
    }

    /**
     *
     * @return A ArrayList with all the comsumivel or null if there is a problem with the Database 
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static ArrayList<consumivel> listaConsumivel() throws SQLException, ClassNotFoundException {
        Connection con;
        con = conexao.getConnection();
        ArrayList<consumivel> cons;
        cons =  new ArrayList<>();
        PreparedStatement stmt;
        stmt = con.prepareCall("SELECT * FROM consumivel");
        if(stmt.execute()){
            ResultSet a;
            a  = stmt.getResultSet();
            while(a.next()){
                cons.add(new consumivel(a.getString("nome"), a.getInt("min"), a.getInt("max"),a.getString("marca"),a.getInt("quantidade"),a.getInt("cod")));
            }
            con.close();
            return cons;
        }
        return null;
        
}

    public static boolean adicionaQuantidadeconsumivel(consumivel selecionado) {
        try{
            Connection con;
            con = conexao.getConnection();
            PreparedStatement stmt;
            stmt = con.prepareCall("UPDATE consumivel SET quantidade = (quantidade + ?) WHERE cod = ?");
            stmt.setInt(1, selecionado.getQuantidade());
            stmt.setInt(2, selecionado.getCod());
            stmt.execute();
            return true;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
            return false;
        }
    }
    
}
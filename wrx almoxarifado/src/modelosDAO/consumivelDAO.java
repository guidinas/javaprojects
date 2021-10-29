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
import modelosBean.consumivel;

/**
 *
 * @author guidi
 */
public class consumivelDAO {
    public static boolean criaConsumivel(consumivel m ) throws SQLException, ClassNotFoundException{
        Connection con;
        con = conexao.getConnection();
        PreparedStatement stmt;
        stmt = con.prepareCall("INSERT INTO consumivel (nome, min, max) VALUES (?, ?, ?)");
        stmt.setString(1, m.getNome());
        stmt.setInt(2, m.getMinimo());
        stmt.setInt(3, m.getMaximo());
        try{
            stmt.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e);
        }
        return false;
    }
}

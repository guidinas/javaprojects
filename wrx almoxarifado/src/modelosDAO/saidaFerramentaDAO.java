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
import modelosBean.saidaFerramentas;

/**
 *
 * @author guidi
 */
public class saidaFerramentaDAO {
    public static boolean criaSaidaFerramenta(ArrayList<saidaFerramentas> m){
        try{
            Connection con;
            con = conexao.getConnection();
            PreparedStatement stmt;
            for(saidaFerramentas k: m){
                stmt = con.prepareCall("INSERT INTO saidaFerramenta (codFerramenta , codFuncionario) VALUES(?, ?)");
                stmt.setInt(1, k.getCodFerramenta());
                stmt.setInt(2, k.getCodFuncionario());
                stmt.execute();
                stmt.clearParameters();
                stmt = con.prepareCall("UPDATE ferramenta SET stat = 1 WHERE cod = ?");
                stmt.setInt(1, k.getCodFerramenta());
                stmt.execute();
            }
            return true;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
            return false;
        }
    }
    
}

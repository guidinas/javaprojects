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
import modelosBean.EPIMarca;

/**
 *
 * @author guidi
 */
public class EPIMarcaDAO {
    public boolean criaEPIMarca(EPIMarca m) {
        try{
        Connection con;
        con  = conexao.getConnection();
        PreparedStatement stmt;
        stmt = con.prepareCall("INSERT into epimarca (nome,minimo,maximo, nomemarca, ca, validade, descricao) VALUES (?, ?, ?, ?, ?, ?, ?)");
        stmt.setString(1, m.getNome());
        stmt.setString(4, m.getMarca());
        stmt.setString(5, m.getCA());
        stmt.setInt(2, m.getMinimo());
        stmt.setString(7,m.getDescricao());
        con.close();
        return true;
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            return false;
        }
    }
    
}

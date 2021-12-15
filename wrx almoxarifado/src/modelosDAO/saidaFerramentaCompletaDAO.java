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
import modelosBean.saidaFerramentaCompleta;

/**
 *
 * @author guidi
 */
public class saidaFerramentaCompletaDAO {
    public static ArrayList<saidaFerramentaCompleta> retornaSaidaFerramentaCompletaArray(){
        try{
            Connection con;
            con = conexao.getConnection();
            PreparedStatement stmt;
            stmt = con.prepareCall("SELECT funcionario.nome AS nomeFuncionario,ferramenta.nome AS nomeFerramenta, saidaFerramenta.hora AS dataSaida, saidaFerramenta.codFerramenta, saidaFerramenta.codFuncionario,saidaFerramenta.cod AS codSaida FROM saidaFerramenta JOIN ferramenta ON saidaFerramenta.codFerramenta = ferramenta.cod JOIN funcionario ON saidaFerramenta.codFuncionario = funcionario.cod WHERE saidaFerramenta.stat = 0");
            if(stmt.execute()){
                ArrayList<saidaFerramentaCompleta> re;
                re = new ArrayList<>();
                ResultSet res;
                res = stmt.getResultSet();
                while(res.next()){
                    re.add(new saidaFerramentaCompleta(res.getString("nomeFerramenta"),res.getString("nomeFuncionario"), res.getDate("dataSaida"), res.getInt("codfuncionario"),res.getInt("codFerramenta"), res.getInt("codSaida")));
                }
                con.close();
                return re;
            }
        }catch(SQLException|ClassNotFoundException ex){
            System.out.println(ex);
        }
        return null;
}

    public static boolean devolveFerramentaCompleta(saidaFerramentaCompleta dev) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
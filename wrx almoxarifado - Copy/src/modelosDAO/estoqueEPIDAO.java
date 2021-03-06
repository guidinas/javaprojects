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
import modelosBean.EPI;
import modelosBean.estoqueEPI;

/**
 *
 * @author guidi
 */
public class estoqueEPIDAO {
    public static ArrayList<estoqueEPI> retornaEPIEstoque() throws SQLException, ClassNotFoundException{
        Connection con;
        con = conexao.getConnection();
        PreparedStatement stmt;
        ArrayList<estoqueEPI> res;
        res = new ArrayList<>();
        stmt = con.prepareCall("SELECT epi.nome AS epi, marcaepi.nome AS marca, marcaepi.quantidade, marcaepi.cod AS codMarca , epi.maximo,epi.minimo, epi.cod AS codEPI FROM marcaepi JOIN epi ON marcaepi.codEPI = epi.cod");
        if(stmt.execute()){
            ResultSet a;
            a = stmt.getResultSet();
            while(a.next()){
                res.add(new estoqueEPI(a.getString("epi"), a.getString("marca"), a.getInt("quantidade"), a.getInt("minimo"), a.getInt("maximo"), a.getInt("codEPI"), a.getInt("codMarca")));
            }
            con.close();
            return res;
        }
        con.close();
        return null;
    }
    
    /**
     * returns de list with all the distinct EPIS on the estoqueEPI Array 
     * @param original
     * @return
     */
    public static ArrayList<EPI> devolveArrayEPI(ArrayList<estoqueEPI> original){
        ArrayList<Integer> cods;
        int cod;
        cods = new ArrayList<>();
        ArrayList<EPI> epis;
        epis = new ArrayList<>();
        for(estoqueEPI a : original){

             cod = a.getCodEPI();
            if(!cods.contains(cod)){
                epis.add( new EPI(a.getCodEPI(), a.getNomeEPI(),a.getMinimo(), a.getMaximo()));
                cods.add(cod);
            }      
        }
        return epis;
    }
    
}
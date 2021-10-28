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
import modelosBean.epiSolicitacao;
import modelosBean.itemRequisicao;

/**
 *
 * @author guidi
 */
public class itemRequisicaoDAO {
    
    /**
     *
     * @param m ArrayList of ItemRequisicao to be add to the database 
     * @param cod the code of the Requisicao that it will be added
     * @return true if the the operation was possible and false if there was a problem,Exception will be thrown just if needed
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static boolean insereItemRequisicaoArray(ArrayList<itemRequisicao> m, int cod) throws SQLException, ClassNotFoundException{
   Connection con = conexao.getConnection();
   itemRequisicao it;
        try{
            PreparedStatement stmt;
            int size,i;
            size = m.size();
            for(i = 0;i < size ;i++){
                it = m.get(i);              
                 stmt = con.prepareStatement("Insert into relacionaRequisicaoEPI (codEPI, codRequisicao, quantidade) VALUES (? ,? ,? ) ");
                 stmt.setInt(1, it.getCodEPI());
                 stmt.setInt(2, cod);
                 stmt.setInt(3, it.getQuantidade());
                 stmt.execute();
            }  
        }catch(SQLException ex){
            System.out.println(ex);
        }
        con.close();
        return false;
    }

    /**
     *
     * @param cod "Cod" of the requisicao
     * @return A ResultSet with all the EPI on the requisicao or null if there was a problem with the Database
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static ArrayList<epiSolicitacao> retornaEPIsolicitacao(int cod) throws SQLException, ClassNotFoundException{
        ArrayList<epiSolicitacao> resul;
        resul =  new  ArrayList<>();
        Connection con;
        con = conexao.getConnection();
        PreparedStatement stmt;
        stmt  = con.prepareStatement("SELECT epi.nome, relacionarequisicaoepi.quantidade, epi.cod FROM  relacionarequisicaoepi INNER JOIN  epi ON epi.cod = relacionarequisicaoepi.codEPI WHERE codRequisicao = ?");
        stmt.setInt(1, cod);
        ResultSet res;
        if(stmt.execute()){
            res = stmt.getResultSet();
            while(res.next()){
                resul.add( new epiSolicitacao(res.getString("nome"), res.getInt("cod"), res.getInt("quantidade")));
            }
            con.close();
            return resul;
        }
        con.close();
        return null;
    }
    
}

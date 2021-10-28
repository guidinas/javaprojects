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
import java.util.Date;
import modelosBean.epiSolicitacao;
import modelosBean.itemRequisicao;
import modelosBean.requisicao;
import modelosBean.requisicaoCompleta;
import modelosDAO.itemRequisicaoDAO;
import static modelosDAO.itemRequisicaoDAO.retornaEPIsolicitacao;
import static modelosDAO.requisicaoDAO.criaRequisicaoCod;
import static modelosDAO.requisicaoDAO.retornaRequisicao;

/**
 *
 * @author guidi
 */
public class requisicaoCompletaDAO {
    
    public static boolean insereRequisicaoCompleta(requisicaoCompleta m) throws SQLException, ClassNotFoundException{
        int codRequisicao;
        codRequisicao  = criaRequisicaoCod(m.getRequisicaoCabeca());
        if( itemRequisicaoDAO.insereItemRequisicaoArray(m.getItemCorpo(), codRequisicao)){
            return true;
        }
        return false;
    }
    public static requisicaoCompleta retornaRequisicaoCompleta(int cod) throws SQLException, ClassNotFoundException{
       try{
        requisicao req;
        req  = retornaRequisicao(cod);
        ArrayList<epiSolicitacao> arrayItens;
        arrayItens = retornaEPIsolicitacao(cod);
        requisicaoCompleta a;
        a = new requisicaoCompleta(req, arrayItens, 0);
        return a;
       }catch(SQLException |ClassNotFoundException a){
           System.out.println(a);
       }
        return null;
        
    }

    /**
     *
     * @param funcionario
     * @param EPI
     * @return The last date that the given funcionario has requested the given EPI
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static Date  retornaUltimaDataEPI(int funcionario, int EPI) throws SQLException, ClassNotFoundException{
        Connection con;
        con = conexao.getConnection();
        PreparedStatement stmt;
        stmt = con.prepareStatement("SELECT requisicaosaida.dataRequisicao, requisicaosaida.codFuncionario, epi.nome FROM requisicaosaida JOIN (relacionarequisicaoepi JOIN epi ON epi.cod = relacionarequisicaoepi.codEPI) ON codRequisicao = requisicaosaida.cod WHERE codEPI = ? AND codFuncionario = ? AND stat = 1 ORDER BY requisicaosaida.dataRequisicao DESC LIMIT 1 ");
        stmt.setInt(1, EPI);
        stmt.setInt(2, funcionario);
        if(stmt.execute()){
            ResultSet res;
            res = stmt.getResultSet();
            while(res.next()){
                Date i;
                i = res.getDate("dataRequisicao");
                con.close();
                 return i;
            }
                
        }
        con.close();
        return null;
    }
    public static ResultSet epiSolicitação(int cod) throws SQLException, ClassNotFoundException{
        Connection con;
        con = conexao.getConnection();
        PreparedStatement stmt;
        stmt = con.prepareStatement(" SELECT epi.nome , requisicaosaida.dataRequisicao , relacionarequisicaoepi.quantidade, epi.cod  FROM requisicaosaida JOIN (relacionarequisicaoepi JOIN epi ON epi.cod = relacionarequisicaoepi.codEPI) ON codRequisicao = requisicaosaida.cod WHERE requisicaosaida.cod = ?");
        stmt.setInt(1, cod);
        if(stmt.execute()){
         
            return stmt.getResultSet();
        }
        con.close();
        return null;
    }
}

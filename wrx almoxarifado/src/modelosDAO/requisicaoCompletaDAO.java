/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package modelosDAO;

import java.sql.SQLException;
import java.util.ArrayList;
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

    
}

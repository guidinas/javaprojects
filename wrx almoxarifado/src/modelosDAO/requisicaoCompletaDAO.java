/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package modelosDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import modelosBean.itemRequisicao;
import modelosBean.requisicaoCompleta;
import modelosDAO.itemRequisicaoDAO;
import static modelosDAO.requisicaoDAO.criaRequisicaoCod;

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

    
}

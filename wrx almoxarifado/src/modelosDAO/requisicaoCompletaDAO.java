/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package modelosDAO;

import java.sql.SQLException;
import modelosBean.requisicaoCompleta;
import static modelosDAO.requisicaoDAO.criaRequisicaoCod;

/**
 *
 * @author guidi
 */
public class requisicaoCompletaDAO {
    
    public boolean insereRequisicaoCompleta(requisicaoCompleta m) throws SQLException, ClassNotFoundException{
        int codRequisicao;
        codRequisicao  = criaRequisicaoCod(m.getRequisicaoCabeca());
        return false;
    }
    
}

/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package modelosDAO;

import java.sql.SQLException;
import modelosBean.saidaConsumivel;

/**
 *
 * @author guidi
 */
public class saidaConsumivelDAO {

    public static Boolean insereRequisicaoCompleta(saidaConsumivel ultima) throws SQLException, ClassNotFoundException, Exception {
       int codreq;
       codreq = requisicaoDAO.criaRequisicaoCod(ultima.getCabeca());
       if(codreq == -1){
           return false;
       }
        return itemSaidaConsumivelDAO.insereItemArray(ultima.getCorpo(), codreq);
    }
}

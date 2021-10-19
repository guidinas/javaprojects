/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package modelosBean;

import java.util.ArrayList;

/**
 *
 * @author guidi
 */
public class requisicaoCompleta {
    
    private requisicao requisicaoCabeca;
    private ArrayList<itemRequisicao>  itemCorpo;

    public requisicaoCompleta(requisicao requisicaoCabeca, ArrayList<itemRequisicao> itemCorpo) {
        this.requisicaoCabeca = requisicaoCabeca;
        this.itemCorpo = itemCorpo;
    }
    
    public requisicao getRequisicaoCabeca() {
        return requisicaoCabeca;
    }

    public void setRequisicaoCabeca(requisicao requisicaoCabeca) {
        this.requisicaoCabeca = requisicaoCabeca;
    }

    public ArrayList<itemRequisicao> getItemCorpo() {
        return itemCorpo;
    }

    public void setItemCorpo(ArrayList<itemRequisicao> itemCorpo) {
        this.itemCorpo = itemCorpo;
    }
    
    
    
}

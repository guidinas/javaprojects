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
    private ArrayList<epiSolicitacao> epiCorpo;

    public requisicaoCompleta(requisicao requisicaoCabeca, ArrayList<epiSolicitacao> epiCorpo,int n) {
        this.requisicaoCabeca = requisicaoCabeca;
        this.epiCorpo = epiCorpo;
    }

    
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

    public ArrayList<epiSolicitacao> getEpiCorpo() {
        return epiCorpo;
    }

    public void setEpiCorpo(ArrayList<epiSolicitacao> epiCorpo) {
        this.epiCorpo = epiCorpo;
    }
    
    
    
}

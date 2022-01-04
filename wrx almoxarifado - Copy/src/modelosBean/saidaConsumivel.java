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
public class saidaConsumivel {
    private requisicao cabeca;
    private ArrayList<itemSaidaConsumivel> corpo;

    public saidaConsumivel(requisicao cabeca, ArrayList<itemSaidaConsumivel> corpo) {
        this.cabeca = cabeca;
        this.corpo = corpo;
    }
    
    

    public ArrayList<itemSaidaConsumivel> getCorpo() {
        return corpo;
    }

    public void setCorpo(ArrayList<itemSaidaConsumivel> corpo) {
        this.corpo = corpo;
    }


    

    public requisicao getCabeca() {
        return cabeca;
    }

    public void setCabeca(requisicao cabeca) {
        this.cabeca = cabeca;
    }

 
    
    
}

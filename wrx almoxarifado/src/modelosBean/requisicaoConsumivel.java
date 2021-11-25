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
public class requisicaoConsumivel {

    public static boolean checaItens(requisicaoConsumivel ultima) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private ArrayList<itemSaidaConsumivel> corpo;
    private requisicao cabeca;

    public requisicaoConsumivel(ArrayList<itemSaidaConsumivel> corpo, requisicao cabeca) {
        this.corpo = corpo;
        this.cabeca = cabeca;
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

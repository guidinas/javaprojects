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

    
   private int codResp;
   private ArrayList<saidaConsumiveis> corpo;

    public requisicaoConsumivel(int codResp, ArrayList<saidaConsumiveis> corpo) {
        this.codResp = codResp;
        this.corpo = corpo;
    }
   

    public int getCodResp() {
        return codResp;
    }

    public void setCodResp(int codResp) {
        this.codResp = codResp;
    }

    public ArrayList<saidaConsumiveis> getCorpo() {
        return corpo;
    }

    public void setCorpo(ArrayList<saidaConsumiveis> corpo) {
        this.corpo = corpo;
    }
   
}

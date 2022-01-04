/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package modelosBean;

/**
 *
 * @author guidi
 */
public class itemSaidaConsumivel {
   private int codConsumivel;
   private int codSaida;
   private int quantidade;

    public itemSaidaConsumivel(int codConsumivel, int codSaida, int quantidade) {
        this.codConsumivel = codConsumivel;
        this.codSaida = codSaida;
        this.quantidade = quantidade;
    }

    public itemSaidaConsumivel(int codConsumivel, int quantidade) {
        this.codConsumivel = codConsumivel;
        this.quantidade = quantidade;
    }
    
   
   

    public int getCodConsumivel() {
        return codConsumivel;
    }

    public void setCodConsumivel(int codConsumivel) {
        this.codConsumivel = codConsumivel;
    }

    public int getCodSaida() {
        return codSaida;
    }

    public void setCodSaida(int codSaida) {
        this.codSaida = codSaida;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
   
            
}

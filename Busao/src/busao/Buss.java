/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package busao;

/**
 *
 * @author guidi
 */
public class Buss {

    private int reservados;
    /**
     * Gera um onibus com 0 lugares reservados  
     */
    public Buss(){
        this.reservados = 0;
    }
    public int getReservados() {
        return reservados;
    }
    public void reserva(int i){
        this.reservados += i;
    }
    
}

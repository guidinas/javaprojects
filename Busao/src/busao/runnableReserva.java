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
public class runnableReserva implements Runnable {
 Terminal t;
 int reserva, onibus;
 public runnableReserva(Terminal t , int reserva , int onibus){
     this.t  =t;
     this.reserva = reserva; 
     this.onibus = onibus;
 }
    @Override
    public void run() {
        t.reserva(onibus, reserva);
        }
    
}

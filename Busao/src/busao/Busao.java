/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package busao;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author guidi
 */
public class Busao {

    public static int  capacidade = 30;
    public static int numeroBuss = 10;
    public static int grupoMaximo = 5;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
    Terminal t = new Terminal(numeroBuss);
    ExecutorService e = Executors.newCachedThreadPool();
    for(int i = 0;i<150;i++) {
            //gera aleatoriamente uma transferência de certa quantia entre uma conta e outra
            int reserva = (int) ((grupoMaximo * Math.random()) + 1);
            int onibus = (int) (numeroBuss * Math.random());
            e.execute(new runnableReserva(t , reserva , onibus));
        }
        Thread.sleep(2);
        t.imprimefinal();
    }
    
}

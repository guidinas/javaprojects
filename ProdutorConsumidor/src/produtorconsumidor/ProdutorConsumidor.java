/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package produtorconsumidor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 *
 * @author guidi
 */
public class ProdutorConsumidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BlockingQueue<String> bm = new ArrayBlockingQueue<>(10);
        Thread t1 = new Thread(new Produtor(bm));
        Thread t2 = new Thread(new Consumidor(bm));
        t1.start();
        t2.start(); 
    }
    
}

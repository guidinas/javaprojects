/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package produtorconsumidor;

import java.util.concurrent.BlockingQueue;

/**
 *
 * @author guidi
 */
public class Consumidor implements Runnable{
        BlockingQueue<String> bm;
        public Consumidor(BlockingQueue<String> bm){
        this.bm = bm;
    }

    @Override
    public  void run() {
        for(int i = 0;i<25;i++){
            
            
            try {
                System.out.println("Consumiu mensagem " + bm.take());
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            }
           
       }
    
}

/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package produtorconsumidor;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guidi
 */
public class Produtor implements Runnable{
    BlockingQueue<String> bm;
    
    public Produtor(BlockingQueue<String> bm){
        this.bm = bm;
    }

    @Override
    public  void run() {
        for(int i = 0;i<25;i++){
            String msg = "olá, msg numero " + i;
            System.out.println("Produziu msg  " + msg);
            try {
                bm.put(msg);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            }
        }
       

}
    
    


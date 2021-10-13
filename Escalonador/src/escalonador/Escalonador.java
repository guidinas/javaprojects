/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package escalonador;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author guidi
 */
public class Escalonador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
                int[][] i;
        i = new int [11][2];
        int[] times = new  int[20];
        i[0][0] = 0;
        for(int k =0;k<10;k++){
            i[k+1][0] = -1;
        }
        ExecutorService e = Executors.newCachedThreadPool();
            //gera aleatoriamente uma transferência de certa quantia entre uma conta e outra
            e.execute(new RunnableEscalonador(1 , i));
            Thread.sleep(1);
            e.execute( new Criadora(20 , i,times));
            System.out.println( "No Main" + i [0][0]);
        
            Thread.sleep(8000);
            int aux = 0;
            for(int l  = 0 ; l < 20 ; l++){
                aux += times[l];
            }
            System.out.println("Tempo médio para a execussão  = " + aux/20);
        // cria 
        
    }
    
}

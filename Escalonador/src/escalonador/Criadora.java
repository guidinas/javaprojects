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
public class Criadora implements Runnable {
    private int tabble[][], times[];
    private int quant;
    private int aux;
    Criadora(int quant, int[][] table, int[] times){
        this.quant = quant;
        this.tabble = table;
        this.times = times;
    }
private void criador(){
     this.aux = 0;
    do{
        synchronized(this){
        for(int i = 0; i < 10 ; i++){
            if( tabble[i+1][0] == -1){
                tabble[i+1][0] = aux;
                tabble[i+1][1] = (int)(20 * Math.random() + 1 );
                ExecutorService e = Executors.newCachedThreadPool();
            e.execute(new Processo(tabble[i+1][1] , aux , tabble , times));
                System.out.println("Criado Processo " + this.aux + " Tempo"  + tabble[i+1][1]);
            aux++;
            }
        }
        }
    }while(aux < this.quant);
}
    @Override
    public void run() {
        criador();
    }
    
    
}

/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package escalonador;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guidi
 */
public class RunnableEscalonador implements Runnable {
    private int[][] table;
    private int tipo;
    private int aux;
    RunnableEscalonador(int tipo, int table[][]){
        this.table = table;
        this.tipo = tipo; 
    }
    private  void escalonadora() throws InterruptedException{
        int aux1 ,aux2 ,aux3;
        aux2 = 100;
        aux1 = 0;
        aux3 = 0;
        /*
        Escalonador FIFO
        */
        Thread.sleep(2);
        if (tipo==1){
            aux = 0;
            do{
                synchronized(this){
                for(int i = 1;i<11;i++){
                    // Checa se existe um processo e se o processo tem o menor código possível.
                    //código é a linha 0
                    if(table[i][0]<aux2 && table[i][0] != -1 && table[0][0] == -1){
                        aux3 = table[i][1];
                        aux1 = i;
                        aux2 = table[i][0];    
                    }
                    
                    if(table[0][0] == -1  && aux!=100 && i==10){
                     table[0][0] = aux2;
                     if(aux2==100){
                         System.out.println("Tempo para executar 20 Threads = " + this.table[0][1]);
                         aux = 1000;
                     }
                     else{
                    System.out.println("Escalonador cede 4ms a Thread" + aux2);
                     }
                    aux++;
                    notifyAll();
                    Thread.sleep(4);
                    }
                }
                
                }       
                aux2 = 100;
                 aux1 = 0;
                aux3 = 0;
               Thread.sleep(1);
            }while(aux  < 1000);
        }
        /*
        Escalonador tipo SJF
        */
        if (tipo==2){
            aux = 0;
            do{
                synchronized(this){
                for(int i = 1;i<11;i++){
                    // Checa se existe um processo e se o processo tem o menor código possível.
                    //código é a linha 0
                    if(table[i][1]<aux3 && table[i][0] != -1 && table[0][0] == -1){
                        aux3 = table[i][1];
                        aux1 = i;
                        aux2 = table[i][0];    
                    }
                    
                    if(table[0][0] == -1  && aux!=100 && i==10){
                     table[0][0] = aux2;
                     if(aux2==100){
                         System.out.println("Tempo para executar 20 Threads = " + this.table[0][1]);
                         aux = 1000;
                     }
                     else{
                    System.out.println("Escalonador cede 4ms a Thread" + aux2);
                     }
                    aux++;
                    notifyAll();
                    Thread.sleep(1);
                    }
                }
                
                }       
                aux2 = 100;
                 aux1 = 0;
                aux3 = 200;
               Thread.sleep(1);
            }while(aux  < 1000);
        }
        if (tipo==3){
            aux = 0;
            do{
                synchronized(this){
                for(int i = 1;i<11;i++){
                    // Checa se existe um processo e se o processo tem o menor código possível.
                    //código é a linha 0
                    if( table[i][0] != -1 && table[0][0] == -1){
                        aux3 = table[i][1];
                        aux1 = i;
                        aux2 = table[i][0];    
                    }
                    
                    if(table[0][0] == -1  && aux!=100 ){
                     table[0][0] = aux2;
                     if(aux2==100){
                         System.out.println("Tempo para executar 20 Threads = " + this.table[0][1]);
                         aux = 1000;
                     }
                     else{
                    System.out.println("Escalonador cede 4ms a Thread" + aux2);
                     }
                    aux++;
                    notifyAll();
                    Thread.sleep(1);
                    }
                }
                
                }       
                aux2 = 100;
                 aux1 = 0;
                aux3 = 200;
               Thread.sleep(1);
            }while(aux  < 1000);
        }
        
    }
    @Override
    public void run() {
        try {
            escalonadora();
        } catch (InterruptedException ex) {
            Logger.getLogger(RunnableEscalonador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

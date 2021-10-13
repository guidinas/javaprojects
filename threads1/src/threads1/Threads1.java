/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threads1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author guidi
 */

public class Threads1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
          /*  Impressora ip = new Impressora("S");
            ip.start();
            
            Impressora ip2 = new Impressora("O");
            ip2.start();
            
            //TarefaImpressora tip = new TarefaImpressora("2");
            Thread t = new Thread(new TarefaImpressora('2'));
            t.start();**/
            ExecutorService e =  Executors.newFixedThreadPool(18);
            char a = 'a';
            for(int i = 0;i< 26; i++){
                 e.execute(new TarefaImpressora(a));
                 a++;
            }
           
            e.shutdown();
            try{
                e.awaitTermination(2, TimeUnit.MINUTES);
            } catch(InterruptedException ex){
                System.out.println("Erro ao finalizar serviços");
            }
    }
    
}
class Impressora extends Thread{
    String s;
    
    public Impressora(String s){
        this.s = s;
    }
    
    private void imprime(){
        for(int i = 0 ; i < 100 ; i++){
            System.out.print(s);
            
        }
    }
    @Override
    public void run(){
        imprime();
    }
    
}
class TarefaImpressora implements Runnable{
char s;
    
    public TarefaImpressora(char s){
        this.s = s;
    }
    
    private void imprime(){
        for(int i = 0 ; i < 100 ; i++){
            System.out.print(s);
            
        }
    }
    @Override
    public void run() {
        imprime();
    }
    
}
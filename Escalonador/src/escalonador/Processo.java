/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package escalonador;


import java.util.concurrent.Callable;

/**
 *
 * @author guidi
 */
public  class  Processo implements Runnable{

    private int  time;
    private int codigo;
    private int[][] lista;
    private int[] times;
    
    Processo(int time, int codigo ,int[][] lista ,int[] times){
        this.codigo = codigo;
        this.time = time;
        this.lista = lista;
        this.times = times;
    }
    private  void rodar(){
        do{
           synchronized(this){
            if(this.lista[0][0] == this.codigo ){
                if(this.time <= 4){
                    this.lista[0][1] +=this.time;
                    
                    this.lista[0][0] =-1;
                    for(int k = 0;k<10;k++){
                if(this.lista[k+1][0]== this.codigo){
                    this.lista[k+1][0] = -1;
                    this.lista[0][0]=-1;
                    this.times[codigo] = this.lista[0][1];
                    System.out.println("Proceso " + this.codigo + "Saiu");
                }
            }
                 
                 this.time = 0;   
                }
                else{
                    this.time -=4;
                    this.lista[0][1]+=4;
                    this.lista[0][0]=-1;
                    System.out.println("Processo " + this.codigo + "rodou");
                    Thread.yield();
                    
                    
                }
            }
            }
           Thread.yield();  
                    
        }while (this.time !=0);
       
        
    }
    @Override
    public void run() {
        rodar();
    }
    
}

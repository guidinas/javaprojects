/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package callable;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author guidi
 */
public class CallableTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException {
       int[] v = {1,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
       SomaVetorTarefa s = new SomaVetorTarefa(v);
       ExecutorService e = Executors.newCachedThreadPool();
       Future<Integer> f =e.submit(s);
       while(!f.isDone()){
           Thread.yield();
       }
       
       //---------------------------------
       // Usando maid euma thread com Callable
       ArrayList<Future<Integer>> futures = new ArrayList<>();
       int[] v1 = {1,2,3,4,5,6,7,8,9,5,5,5,5,5,5};
       int[] v2 = {1,4,5,4,5,45,4,5,4,5,4,5,4,5,4,5,45};
       futures.add(e.submit(new SomaVetorTarefa(v2)) );
       futures.add(e.submit(new SomaVetorTarefa(v1)) );
       for(Future<Integer> f1 : futures){
           while(! f1.isDone()){
               Thread.yield();
           }
           int soma = f1.get();
           System.out.println("A soma é de " + soma);
       }
        e.shutdown();
        e.awaitTermination(1, TimeUnit.MINUTES);
    }
    
}

 class SomaVetorTarefa implements Callable{
    int[] v;
    public SomaVetorTarefa(int[] v){
        this.v = v;
    }
    private Integer soma(){
        int soma = 0;
        for(int i =0; i < v.length;i ++){
            soma += v[i];
        }
            return soma;
    }

    @Override
    public Integer call() throws Exception {
        int soma = soma();
        return soma;
        }
}
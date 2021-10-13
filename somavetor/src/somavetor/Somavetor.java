/*
 * Developed by Guilherme Nassi
 * Please do not remove this header
 * You can use this code as long as this header is in it.
 */
package somavetor;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/**
 * @author Guilherme Nassi
 */
public class Somavetor {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //Declaração de variáveis.
        int[] i = {5,5,5,5,5,5,5,5,8,5,5,5,6,5,6,5,6,5,6,56,5,8,8,8,98,85,1,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        int[] aux = {0,0,0};
        int[] aux1 = {0,0,0};
        int j =0;
        int soma = 0;
        ExecutorService e = Executors.newCachedThreadPool();
        ArrayList<Future<Integer>> future = new ArrayList<>();
        //Checando se vai ter resto da divisão de 3 e colocando os sobressalentes em aux
        if(i.length%3 > 0){
            for(int k = 0;k<i.length %3;k++){
                aux[k] = i[k];
                j++;
            }
            future.add(e.submit(new TarefaSoma(aux)));
            //Foi preciso adicionar isso pra garantir que o main não fizesse modificações no aux antes da Thread ser criada.
            //Essa função coloca a thread em sleep por 2 nanosegundos
            
        }
        //Começa onde a função anterior parou e separa o restante de 3 em 3
        for(j =j ; j < i.length-1; j+=3){ 
            
            aux1[0] = i[j];
            aux1[1] = i[j+1];
            aux1[2] = i[j+2];
            future.add(e.submit(new TarefaSoma(aux1)));
            
            //Foi preciso adicionar isso pra garantir que o main não fizesse modificações no aux antes da Thread ser criada.
            //Essa função coloca a thread em sleep por 2 nanosegundos
            // isso também pode ser resolvido passando os valores ao invés do vetor.
        }
        //soma os resultados dados salvos em future e imprime na tela. 
         for(Future<Integer> f1: future)
        {
            while(!f1.isDone()){
                Thread.yield();
            }
        }
        for(Future<Integer> f1: future)
        {
            while(!f1.isDone()){
                Thread.yield();
            }
            soma +=f1.get();
        }
        System.out.println("A soma é de " + soma);
        e.shutdown();
        e.awaitTermination(1, TimeUnit.MINUTES);
    }
}
/*
*Classe que baseará as Threads
*/
 class TarefaSoma implements Callable{
     
     int[] a;
     TarefaSoma(int[] a){
         this.a = a;
     }
     /*
     *
     *Retorna a soma dos itens no vetor
     */
    @Override
    public Integer call() throws Exception {
        return this.somador();
    }
    private  int somador(){
        int soma = 0;
         for(int i : this.a){
             soma += i;
         }
         return soma;
    }
}

/*
* Developed in *2020*
*/
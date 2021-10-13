/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package criadocumentos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author guidi
 */
public class CriaDocumentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int size = 5;
        ExecutorService e  =  Executors.newCachedThreadPool();
        ArrayList<Future<Boolean>> future = new ArrayList<>();
        for(int i =0; i < size ; i++){
            String a = "titulo" + i;
            String b = "conteudo" + i;
            future.add( e.submit(new CriaDocs(a,b)));
        }
        for(Future<Boolean> aux : future){
           while(!aux.isDone()){
            Thread.yield();
        }
        if(aux.get()){
            System.out.println("Arquivo criado");
        }
        else{
            System.out.println("Erro de criaçao");
        }
        } 
    }
        
    }
    

/*
*Classe que baseará as Threads
*/
 class CriaDocs implements Callable{
     private String nome;
     private String Conteudo;
     /*
     * Construtor
     */
     CriaDocs(String nome, String Conteudo){
         this.Conteudo = Conteudo;
         this.nome  = nome;
     }
     /*
     *
     *Cria documento com conteúdo e nome passado por String.
     * Nesse fiz por função.
     */
    @Override
    public Boolean call() throws IOException {
        Boolean a;
        a = this.geraDoc();
        return a;
    }
    private Boolean geraDoc(){
         FileWriter arquivo;
         try{
        arquivo= new FileWriter( new File(this.nome + ".txt"));
        arquivo.write(this.Conteudo);
        arquivo.close();
        return true;
         }
         catch(IOException e){
         }  
        return false;
    }
}
/**
* Developed in *2020*
*/
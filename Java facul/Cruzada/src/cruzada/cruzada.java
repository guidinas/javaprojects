/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cruzada;

/**
 *
 * @author guidi
 */
public class cruzada {
    private String resposta1;
    private String resposta2;
    public cruzada(String resposta1, String resposta2){
        this.resposta1 = resposta1;
        this.resposta2 = resposta2;
    }
    
    public void mostrarrespostas(){
        System.out.println("  Resposta 1 :  " + this.resposta1 );
        System.out.println("  Resposta 2 :  " + this.resposta2 );
    }
    
}

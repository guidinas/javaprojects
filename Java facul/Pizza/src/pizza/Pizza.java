/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza;

/**
 *
 * @author guidi
 */
public class Pizza {
    private String nome;
    private double valor;
    private int ingredientes;
    
   public Pizza(String nome, double valor, int ingredientes){
       this.nome = nome;
       this.valor = valor;
       this.ingredientes = ingredientes;
   }
}

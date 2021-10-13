/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package laura;

import java.util.Scanner;

/**
 *
 * @author guidi
 */
public class Laura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Produto a = new Produto(0,0);
      int auxint;
      float auxfloat;
      int i=0;
      int op = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Bom dia Laura!");
    
      do{
      System.out.println("Por favor digite a quantidade inicial do produto");
        
        auxint = sc.nextInt();
        if(auxint <0){
            System.out.println("Quantidade inválida");
        }
        else{
            a.adicionar(auxint);
            i=1;
        }
        
      }while(i<1);
        
        System.out.println("Por Favor digite o preço inicial do produto");
        auxfloat = sc.nextFloat();
        a.atualizaPreco(auxfloat);
        
        do{
        System.out.println("Digite a operação ");
        System.out.println("1 - Atualizar preço");
        System.out.println("2 - Visualizar informações");
        System.out.println("3 - Adicionar estoque");
        System.out.println("4 - Vender");
        System.out.println("5 - Sair");
         op = sc.nextInt();
        switch(op){
           
           case 1:
               System.out.println("Digite o novo preço:");
               auxfloat = sc.nextFloat();
               a.atualizaPreco(auxfloat);
               break;
           case 2:
               a.visualiza();
               break;
           case 3:
               System.out.println("digite a quantidade:");
               auxint = sc.nextInt();
               a.adicionar(auxint);
               break;
           case 4:
               System.out.println("digite a quantidade a ser vendida:");
               auxint = sc.nextInt();
               a.vender(auxint);
               break;
       }
            
        }while(op != 5);
        
    }
   
       
    
}

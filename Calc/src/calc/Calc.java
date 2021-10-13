/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calc;

import java.util.Scanner;

/**
 *
 * @author guidi
 */
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in);
        int num3; 
       Calculadora a = new Calculadora();
       do{
        System.out.println("Digite o primeir onumero:");
       int num1 = sc.nextInt();
        System.out.println("Digite o Segundo número:");
       int num2 = sc.nextInt();
        System.out.println("Digite a operação ");
        System.out.println("1 - Soma");
        System.out.println("2 - subtração");
        System.out.println("3 - multiplicação");
        System.out.println("4 - divisão");
        System.out.println("5 - Sair");
         num3 = sc.nextInt();
       switch(num3){
           
           case 1:
               System.out.println(num3);
               a.Soma(num1, num2);
               break;
           case 2:
               a.Subtracao(num1,num2);
               break;
           case 3:
               a.Multiplicacao(num1,num2);
               break;
           case 4:
               a.Divisao(num1, num2);
               break;
       }
               
        
       }while(num3!=5);
       
       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calc;

/**
 *
 * @author guidi
 */
public class Calculadora {
    
    public void Soma(int num1, int num2){
        
        int num3 = num1 + num2;
        System.out.println(" a soma é: "+num3);
    }
       public void Subtracao(int num1, int num2){
        
        int num3 = num1 - num2;
        System.out.println(" a subtração é: "+num3);
    }
          public void Multiplicacao(int num1, int num2){
        
        int num3 = num1 * num2;
        System.out.println(" a multiplicação é: "+num3);
    }
             public void Divisao(int num1, int num2){
        if(num2==0){
            System.out.println("Divisão inválida");
            
        }
        else{
              int num3 = num1 / num2;
        System.out.println(" a Divisão é: "+num3);
        }
      
    }
        
}

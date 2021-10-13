/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nucleaar;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author guidi
 */
public class Nucleaar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         reator a = new reator();
        
        
        Scanner sc;
        Random ra;
        ra = new Random();
        sc = new Scanner(System.in);
        int d[];
        int aux;
        int auxint;
        do{
           d = a.getY();
           
              
           
            
            System.out.println("\n A pressão atual é de :" + a.getX() + "\n Deseja aumentar[1] ou diminuir[2]  a pressão ?");
            aux = sc.nextInt();
            System.out.println("\n Digite o valor entre 1 e 10 que deseja aumenter o diminuir: ");
            auxint = sc.nextInt();
            
            if(auxint <= 0 ){
                auxint = 1;
                System.out.println("Valor inválido setado para 1");
            }
            else if(auxint > 10){
                auxint = 10;
                System.out.println("\nvalor inválido setado para 10");
            }
                
            auxint += ra.nextInt(5)+1;
            switch(aux){
    
                case 1:
                    a.setX(auxint + a.getX());
                    d = a.geraenergia();
                break;    
                case 2:
                    a.setX(a.getX() -auxint);
                    d = a.geraenergia();
                break ;
                default:
                    System.out.println("\n Opção Inválida");
                    break;
                
            } 
            System.out.println("\n A energia gerada no ciclo anterior foi de: " + d[a.getT()-1]);
            
            
        }while(a.getT() < 10);
        d = a.getY();
                
        
    int prevx = 0;
    int prevy =0 ;
    int x;
    int y;
    
    
    
    
  
    double offset = 0;
         StdDraw.setXscale(0,14);
        StdDraw.setYscale(20,45);
        StdDraw.clear();
        offset-=1;

        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.line(1,21,13,21); // x-axis
        StdDraw.line(1,20,1,45); // y-axis
        StdDraw.setPenColor(StdDraw.RED);
        
        for (int i= 0 ;i < 10 ; i++) {
            x = i;
            y = d[i]/100;
            StdDraw.line(prevx + 1, prevy + 1, x + 1 , y + 1);
            prevx = x;
            prevy = y;
        }
        StdDraw.show();
}
    
    
    }

    
    
    

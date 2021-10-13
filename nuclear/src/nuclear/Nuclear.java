/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nuclear;

import StdDraw;
import java.util.Random;
import java.util.Scanner;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author guidi
 */
public class Nuclear {

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
        
    int prevx = 0;
    int prevy =0 ;
    int x;
    int y;
    
    
while(true){
    double offset = 0;
         StdDraw.setXscale(0,15);
        StdDraw.setYscale(0,4200);
        StdDraw.show(10);
        StdDraw.clear();
        offset-=1;

        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.line(0,0,15,0); // x-axis
        StdDraw.line(0,0,0,4200); // y-axis
        StdDraw.setPenColor(StdDraw.RED);
        
        for (int i= 0 ;i < 10 ; i++) {
            x = i;
            y = d[i];
            StdDraw.line(prevx, prevy,x, y);
            prevx = x;
            prevy = y;
        }
        StdDraw.show();
}
    





/*
 * TesteGraficos.java
 */



/**
 *
 * @author Andreia
 */


 
   
    
}
        
    }
    


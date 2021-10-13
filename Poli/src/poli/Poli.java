/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poli;

import java.util.Scanner;

/**
 *
 * @author guidi
 */
public class Poli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int aux;
        double aux1;
        Poligono a;
        System.out.println(" digite o tamanho do polígono: ");
        aux = sc.nextInt();
        a= new Poligono(aux);
        for(int i =0 ; i< aux;i++){
            System.out.println("digite o tamanho do lado " + (i+1));
            aux1 = sc.nextDouble();
            a.setLado(i, aux1);
            
        }
        
        a.perimetro();
    }
    
}

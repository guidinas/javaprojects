/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Imobiliaria;

import java.util.Random;

/**
 *
 * @author guidi
 */
public class Imobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random ra = new Random();
        int auxint1, auxint2;
        double auxdouble1,auxdouble2;
        Construcao[] a = new Construcao[6];
               
        for(int i =0;i<6;i++){
            auxint1 = ra.nextInt(3);
            switch(auxint1){
                case(0):
                    auxdouble1 = 30 * ra.nextDouble() + 20;
                    auxdouble2 = 30 * ra.nextDouble() + 20;
                    a[i] = new Loja(auxdouble1,auxdouble2);
                     auxdouble1 = 30 * ra.nextDouble() + 20;
                    ((Loja) a[i]).setVendas(auxdouble1);
                    System.out.println( a[i].getDados());
                    break;
               case(1):
                    auxdouble1 = 30 * ra.nextDouble() + 20;
                    auxdouble2 = 30 * ra.nextDouble() + 20;
                    a[i] = new Apto(auxdouble1,auxdouble2);
                    auxint2 = ra.nextInt(3) + 1;
                    ((Apto) a[i] ).setQuartos(auxint2);
                    System.out.println( a[i].getDados());
                   break;
                case(2):
                    auxdouble1 = 30 * ra.nextDouble() + 20;
                    auxdouble2 = 30 * ra.nextDouble() + 20;
                    a[i] = new Escritorio(auxdouble1,auxdouble2);
                     auxdouble1 = 30 * ra.nextDouble() + 20;
                    ((Escritorio) a[i]).setVendas(auxdouble1);
                    auxint2 = ra.nextInt(3) + 1;
                    ((Escritorio) a[i] ).setQuartos(auxint2);
                    System.out.println( a[i].getDados());
                    break;
            }
            
        }
        
        
    }
    
}

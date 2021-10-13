/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package triangulo;

/**
 *
 * @author guidi
 */
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Triangulos a;
        a =new Triangulos (25,15,20);
        int b;
        b = a.calcularPerimetro();
        System.out.println("o perímetro é "+b);
    }
    
}

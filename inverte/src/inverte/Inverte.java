/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inverte;

import java.util.Scanner;

/**
 *
 * @author guidi
 */
public class Inverte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String palavra;
        int n;
        int size;
        String fina = new String();
        System.out.println("Digite a String:");
        palavra = sc.nextLine();
        size = palavra.length();
        for(int i = 0;i<size;i++){
            fina += palavra.charAt(size - i - 1);
        }
        System.out.println(""+fina);
               
    }
    
}

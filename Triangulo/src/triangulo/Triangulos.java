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
public class Triangulos {
    
    private int lado1;
    private int lado2;
    private int lado3;
    
    public Triangulos(int lado1, int lado2, int lado3){
        this.lado1=lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public int calcularPerimetro(){
            int a;
            a=0;
            a = this.lado1 +a;
            a= this.lado2 +a;
            a+=this.lado3;
            return a;
        }
}

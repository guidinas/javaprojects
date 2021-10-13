/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poli;

/**
 *
 * @author guidi
 */
public class Poligono {
    private  Lado[] lados;
    private  int size;
    private double aux;
    Poligono(int lado){
        this.size = lado;
        this.lados = new Lado[lado];
        for(int i =0;i<lado;i++){
            this.lados[i] = new Lado();
        }
    }
    public void setLado(int i, double tamanhoLado){
        System.out.println("entrou.");
        this.lados[i].setLado(tamanhoLado);
        System.out.println("saiu.");
    }
     public void perimetro(){
         aux =0;
         for(int i = 0;i<this.size;i++){
             aux +=this.lados[i].getLado();
         }
         System.out.println("O perímetro é de: " + aux);
     }
}

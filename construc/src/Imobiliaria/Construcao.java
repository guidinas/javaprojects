/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Imobiliaria;

import static Imobiliaria.Commission.Commission_Rate;

/**
 *
 * @author guidi
 */
public abstract class Construcao {
    private double area;
    private double precoArea;

    public Construcao() {
        this.area = 0;
        this.precoArea = 0;
    }
    
    public Construcao(double area, double precoArea){
        this.area = area;
        this.precoArea = precoArea;
    }
    
    /**
     *
     * Manda os dados em formato de string
     * @return 
     */
    public String getDados(){
        String a= new String();
        a += "A área da construção é de : "+ this.area + " O preco do m² é de : "+ this.precoArea;
    return a;
    }

    /**
     *imprime os daddos 
     * 
     */
    public void printdados(){
    
            System.out.println("A área da construção é de : "+ this.area + " O preco do m² é de : "+ this.precoArea);
}
    /**
     * Será implemantada nas subclasses.
     * @return 
     */
   abstract double getPrecoTotal();

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrecoArea() {
        return precoArea;
    }

    public void setPrecoArea(double precoArea) {
        this.precoArea = precoArea;
    }
    

}

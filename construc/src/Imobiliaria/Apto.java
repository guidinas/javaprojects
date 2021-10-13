/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Imobiliaria;

import java.text.DecimalFormat;


/**
 *
 * @author guidi
 */
public class Apto extends Construcao {

    private int quartos;
    DecimalFormat df = new DecimalFormat("###,##0.00");
    Apto(){
        this.quartos=0;
        this.setArea(quartos);
        this.setPrecoArea(quartos);
    }
    Apto(double a, double p){
        this.setArea(a);
        this.setPrecoArea(p);
    }
    
    @Override
    public String getDados(){
    String a ;
    a = "\n\n===========Apartamento==========\nA área da construção é de : " + df.format(this.getArea())  + "\nO preco do m² é de : " + df.format(this.getPrecoArea()) + "\n A preço total é de: " + df.format(this.getPrecoTotal()) ;
    return a;
}
    
    @Override
    double getPrecoTotal() {
        double a ;
        a= this.getArea() * this.getPrecoArea()*this.quartos;
        return a;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }
    
    
}

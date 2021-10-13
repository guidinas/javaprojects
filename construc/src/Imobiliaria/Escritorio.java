/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Imobiliaria;



/**
 *
 * @author guidi
 */
public class Escritorio extends Apto implements Commission {
    double sales;
    Escritorio(){
        this.sales = 0;
        this.setArea(0);
        this.setPrecoArea(0);
        this.setArea(0);
    }
    Escritorio(double a, double b){
        this.setArea(a);
        this.setPrecoArea(b);
    }
    
    
    /**
     *É o valor das vendas.
     * @param a
     */
    public void setVendas(double a){
        this.sales = a;
    }

    /**
     *Retorna preço total
     * @return
     */
 
    @Override
    double getPrecoTotal() {
        double a ;
        a= this.getArea() * this.getPrecoArea() * this.getQuartos() * (1+Commission_Rate);
        return a;
    }
   
    /**
     * Retona os Dados 
     * @return
     */
    @Override
    public String getDados(){
    String a ;
    a = "\n\n==========Escritorio=============\nA área da construção é de : " + df.format(this.getArea())  + "\nO preco do m² é de : " + df.format(this.getPrecoArea())  + "\nA taxa de vendas é: " + df.format(this.sales) + "\n A preço total é de: " + df.format(this.getPrecoTotal());
   return a;
}

    @Override
    public void setVendas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imobiliaria;
import static Imobiliaria.Commission.Commission_Rate;
import java.text.DecimalFormat;
/**
 *
 * @author guidi
 */
public class Loja extends Construcao {
    double sales;
    DecimalFormat df = new DecimalFormat("###,##0.00");
    Loja(){
        this.setPrecoArea(0);
        this.setArea(0);  
    }
    Loja(double a, double p)
    {
        this.setPrecoArea(p);
        this.setArea(a);
    }
    /**
     *
     * @param a
     */
    public void setVendas(double a){
        this.sales = (a < 0) ? 0.0 : a;
    }
    @Override
    public String getDados(){
    String a;
        a = "\n\n==========Loja=============\nA área da construção é de : " + df.format(this.getArea())  + "\nO preco do m² é de : " + df.format(this.getPrecoArea())  + "\nA taxa de vendas é: " + df.format(this.sales) + "\n A preço total é de: " + df.format(this.getPrecoTotal());
    return a ;
} 
    @Override
    double getPrecoTotal() {
        double a ;
        a= (this.getArea() + this.sales  ) * (this.getPrecoArea() + this.sales )*(1+Commission_Rate);
        return a ;
    }
    public double getSales() {
        return sales;
    }
    public void setSales(double sales) {
        this.sales = sales;
    }   
}
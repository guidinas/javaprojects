/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trian2;

import java.util.Scanner;

/**
 *
 * @author guidi
 */
public class triangulo {
    private ponto a = new ponto();
    private ponto b = new ponto();
    private ponto c = new ponto();
    
    triangulo(){
        Scanner sc = new Scanner(System.in);
        double aux;
        int op = 0;
        do{
           System.out.println("Digite o X do primeiro ponto");
           aux = sc.nextDouble();
           this.a.setX(aux);
           System.out.println("Digite o Y do primeiro ponto");
           aux = sc.nextDouble();
           this.a.setY(aux);
           System.out.println("Digite o X do segundo ponto");
           aux = sc.nextDouble();
           this.b.setX(aux);
           System.out.println("Digite o Y do segundo ponto");
           aux = sc.nextDouble();
           this.b.setY(aux);
           System.out.println("Digite o X do terceiro ponto");
           aux = sc.nextDouble();
           this.c.setX(aux);
           System.out.println("Digite o Y do terceiro ponto");
           aux = sc.nextDouble();
           this.c.setY(aux);
           
           if(this.a.getX() == this.b.getX() && this.a.getY() == this.b.getY()){
               System.out.println("Trinangulo inválido!!");
            }
           else if(this.c.getX()== this.b.getX() && this.c.getY() == this.b.getY()){
               System.out.println("Trinangulo inválido!!");
            }
           else if(this.a.getX()== this.c.getX() && this.a.getY() == this.c.getY()){
               System.out.println("Trinangulo inválido!!");
            }
            else{
               op=1;
            }
        }while(op==0);     
    }
    
    public double perímetro(){
        double xa,xb,xc,ya,yb,yc,ab,bc,ca,per;
        xa = this.a.getX();
        xb = this.b.getX();
        xc = this.c.getX();
        ya = this.a.getY();
        yb = this.b.getY();
        yc = this.c.getY();
        ab = Math.sqrt((Math.pow(xa-xb,2))+ (Math.pow(ya-yb,2)));
        ca = Math.sqrt((Math.pow(xa-xc,2))+ (Math.pow(ya-yc,2)));
        bc = Math.sqrt((Math.pow(xb-xc,2))+ (Math.pow(yb-yc,2)));
        per= ab+bc+ca;
        return per;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nucleaar;

/**
 *
 * @author guidi
 */
public class reator {
    private  int x;
  private  int t;
  private int y[];
    reator(){
        this.x=0;
        this.y = new int[10];
        this.t = 0;
    }
    
   public int[] geraenergia()
   {
       if(this.x>30 || this.x <0  ){
            this.y[this.t]= 0;
            this.t+=1;
            return this.y;
       }
               
       this.y[this.t]= -(2*this.x*this.x)+ (80*this.x)+3600;
       this.t += 1;
       return this.y;
   }
        
    public int getT() {
        return t;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int[] getY() {
        return y;
    }

    public void setY(int[] y) {
        this.y = y;
    }
}

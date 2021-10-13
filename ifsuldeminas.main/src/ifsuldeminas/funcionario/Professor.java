/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifsuldeminas.funcionario;

/**
 *
 * @author guidi
 */
public class Professor {
    private String nome;
    private int suap;
    public Professor(String nome, int suap){
        this.nome = nome;
         if ( suap < 1000 ){
            this.suap = 1000;
        }
        else if( suap > 9999 ){
            this.suap = 9999 ;
        }
        else{
            this.suap = suap ;
        }
    }
    public void exibirProfessor(){
        System.out.println("\n=========== Professor ===========");
        System.out.println("\n Nome : " + this.nome + "\n Suap : " + this.suap);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSuap() {
        return suap;
    }

    public void setSuap(int suap) {
        this.suap = suap;
    }
    
}

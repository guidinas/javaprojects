/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifsuldeminas.alunos;

/**
 *
 * @author guidi
 */
public class Aluno {
    private String nome;
    /**
     * de 1000 - 9999
     */
    private int ra;
    private int periodo;
    private String curso;
    
     public Aluno(String nome, int ra, String curso ){
        this.nome = nome;
        if ( ra < 1000 ){
            this.ra = 1000;
        }
        else if( ra > 9999 ){
            this.ra = 9999 ;
        }
        else{
            this.ra = ra ;
        }
        this.periodo = 1 ;
        this.curso = curso ;
    }
     
    public  Aluno(String nome, int ra , int periodo , String curso ){
        this.nome = nome;
        if ( ra < 1000 ){
            this.ra = 1000;
        }
        else if( ra > 9999 ){
            this.ra = 9999 ;
        }
        else{
            this.ra = ra ;
        }
        this.periodo =  periodo ;
        this.curso = curso ;
    }
     
     public void exibirAluno(){
         System.out.println("\n============ Aluno ===============");
         System.out.println("Nome : " + this.nome + "\n Ra : " + this.ra + "\n Período : " + this.periodo + "\n Curso :" + this.curso);
     }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
     
     
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alu;

import java.util.Scanner;

/**
 *
 * @author guidi
 */
public class Disciplina {
    private Aluno[] a;
    private final boolean[] b ;
    public Disciplina(){
        this.a = new Aluno[40];
        this.b = new boolean[40];
       for(int i = 0; i<40 ;i++){
           this.a[i] = new Aluno();
           this.b[i] = false;
       }
    }
    public void addAluno(){
        String a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<40;i++){
            if(this.b[i] == false){
                System.out.println("digite o nome  do Aluno: ");
                a =sc.nextLine();
                this.a[i].setNome(a);
                System.out.println("digite a idade do aluno: ");
                b =sc.nextInt();
                this.a[i].setIdade(b);
                System.out.println("Digite a Turma: ");
                c =sc.nextInt();
                this.a[i].setTurma(c);
                this.b[i] = true;
                System.out.println("Aluno adicionado com sucesso!");
                return;
            }
            
        }
        System.out.println("Turma completa, impossível adicionar!");
    }
    
    public int getNumAlunos(){
        int num = 0;
    
        for(int i =0;i<40;i++){
            if(this.b[i] == true){
                num += 1;
            }
        }
        return num;
    }
    public void removeAluno(){
        Scanner sc = new Scanner(System.in);
        int aux;
        for(int i =0;i<40;i++){
            if(this.b[i] == true){
                System.out.println("Aluno: "+i);
                this.a[i].informacoes();
            }
        }
        System.out.println("Digite o número do aluno que quer excluir");
        aux = sc.nextInt();
        this.b[aux] = false;
        System.out.println("Aluno excluido com Sucesso !");
        
    }
    
}

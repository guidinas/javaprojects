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
public class Alu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Disciplina a =new Disciplina();
       Scanner sc= new Scanner(System.in);
        int op ;
        int aux;
       do{
        System.out.println("Digite a operação ");
        System.out.println("1 - Adicionar aluno");
        System.out.println("2 - Número de Alunos");
        System.out.println("3 - Remover alunos");
        System.out.println("4 - Sair");
         op = sc.nextInt();
        switch(op){
           
           case 1:
               a.addAluno();
               break;
           case 2:
             
        aux= a.getNumAlunos();
               System.out.println("A quantidade de alunos é: " + aux);
               break;
           case 3:
               a.removeAluno();
               break;
           case 4:
               
                break;
           default:
               System.out.println("Opção inválida");
            break;
       }
        
        }while(op != 4);
    }
    
}

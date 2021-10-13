/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifsuldeminas.main;

import ifsuldeminas.academico.Disciplina;
import ifsuldeminas.alunos.Aluno;
import ifsuldeminas.funcionario.Professor;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author guidi
 */
public class IfsuldeminasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat df = new DecimalFormat("###,##0.00");
        Disciplina a;
        String nome;
        nome = "Programação_orientada_a_Objetos";
        a = new Disciplina(nome ,1 ,4 ,20);
        Professor p;
        p = new Professor("Ricardo" , 1221);
       Aluno aluno1 , aluno2 , aluno3 , aluno4 , aluno5 , aluno6 , aluno7 , aluno8 , aluno9 , aluno10;
       aluno1 = new Aluno("Ana" , 1200 , "Engenharia");
       aluno2 = new Aluno("André" , 1201 , "Engenharia" );
       aluno3 = new Aluno("Bianca" , 1202 , "Engenharia");
       aluno4 = new Aluno("Bruno" , 1205 , "Engenharia");
       aluno5 = new Aluno("Caio" , 1208 , "Biologia");
       aluno6 = new Aluno("Cristina" , 1210 , "Ciencia de computação");
       aluno7 = new Aluno("Daniela" , 1211 , "Engenharia química");
       aluno8 = new Aluno("Diego" , 1212 , "Engenharia Civil");
       aluno9 = new Aluno("Eduarda" , 1217 , "Direito");
       aluno10 = new Aluno("Elmo" , 1218 , "Linguas");
       a.matricularAluno(aluno1);
       a.matricularAluno(aluno2);
       a.matricularAluno(aluno3);
       a.matricularAluno(aluno4);
       a.matricularAluno(aluno5);
       a.matricularAluno(aluno6);
       a.matricularAluno(aluno7);
       a.matricularAluno(aluno8);
       a.matricularAluno(aluno9);
       a.matricularAluno(aluno10);
       a.addFrequancia(0, 70);
       a.addFrequancia(1,75);
       a.addFrequancia(2, 50);
       a.addFrequancia(3, 70);
       a.addFrequancia(4, 72);
       a.addFrequancia(5, 80);
       a.addFrequancia(6, 61);
       a.addFrequancia(7, 35);
       a.addFrequancia(8, 20);
       a.addFrequancia(9, 77);
       a.addNota(0, 7.5);
       a.addNota(1, 8.5);
       a.addNota(2, 10);
       a.addNota(3, 9.5);
       a.addNota(4, 7.5);
       a.addNota(5, 5.5);
       a.addNota(6, 6);
       a.addNota(7, 8.5);
       a.addNota(8, 7.5);
       a.addNota(9, 4.5);
       a.setProfessor(p);
       Scanner sc = new Scanner(System.in);
       int aux,aux1, auxint ,auxint1;
       aux = -1;
       Aluno al;
       String nomeal ,cursoal;
       int raal;
       boolean check;
       double auxdouble;
       do{
           System.out.println("\n\nBem vindo ao sistema Academico!");
           System.out.println("Por favor escolha uma das Opções abaixo");
           System.out.println("1  ---- Imprime info da Disciplina");
           System.out.println("2  ---- Total alunos e taxa aprovados / Reprovados");
           System.out.println("3  ---- Imprime os Aprovados");
           System.out.println("4  ---- Imprime os Reprovados");
           System.out.println("5  ---- Imprime maior e menor nota");
           System.out.println("6  ---- Imprime professor da Matéria");
           System.out.println("7  ---- Imprime média da Turma e alunos acima da média");
           System.out.println("8  ---- Imprime média da Turma e alunos abaixo da média");
           System.out.println("9  ---- Imprime alunos com notas e aproveitamento");
           System.out.println("10 ---- Imprime alunos ordenados por nota");
           System.out.println("11 ---- Matricular aluno");
           System.out.println("0  ---- Sair");
           aux = sc.nextInt();
           switch(aux){
               case 1 : 
                   a.exibirDisciplina();
                   break;
               case 2 :
                   System.out.println("\n A quantidade de alunos matriculados é de :" + a.getNumeroAlunos());
                   System.out.println("Aprovados : " + a.getQuantidadeAprovados());
                   System.out.println("Reprovados : " + a.getQuantidadeReprovados());
                   break;
               case 3 :
                   a.exibirAprovados();
                   break;
               case 4 :
                   a.exibirReprovados();
                   break;
               case 5 : 
                   a.exibirMaiorNota();
                   a.exibeMenorNota();
               break;
               case 6 :
                   a.exibirProfessor();
                   break;
               case 7 :
                   System.out.println("A média da turma foi de : " + df.format(a.calculaMedia()) );
                   a.exibirAlunosAcimaMedia();
                   break;
               case 8 :
                   System.out.println("A média da turma foi de : " + df.format(a.calculaMedia()) );
                   a.exibirAlunosAbaixoMedia();
                   break;
               case 9 :
                   a.exibirAlunosNotaAproveitamento();
                   break;
               case 10: 
                   a.exibirOrdenadosPorNota();
                   break;
               case 11: 
                   System.out.println("\nDigite o nome do Aluno :\n");
                   sc.nextLine();
                   nomeal = sc.nextLine();
                   System.out.println("\nDigite o curso do Aluno :\n");
                   cursoal = sc.nextLine();
                   aux1 = 0;
                   do{
                       System.out.println("\n Digite o RA do Aluno :\n");
                       raal = sc.nextInt();
                       if(raal > 9999 || raal < 1000 ){
                           System.out.println("O valor do RA deve ser maior que 1000 e menor que 9999");
                       }
                       else{
                           aux1 = 1;
                       }
                   }while(aux1 != 1);
                   al = new Aluno(nomeal , raal , cursoal);
                       check = a.matricularAluno(al);
                       if(check){
                           System.out.println("Aluno matriculado com sucesso !");
                           aux1 =0;
                       do{
                       System.out.println("\n Digite a nota do Aluno : \n");
                       auxdouble = sc.nextDouble();
                       if(auxdouble > 10 || auxdouble < 0 ){
                           System.out.println("A nota deve ser maior que 0 e menor que 10");
                       }
                       else{
                           
                           aux1 = 1;
                       }
                   }while(aux1 != 1);
                       auxint = a.getNumeroAlunos();
                       auxint --;
                       a.addNota(auxint, auxdouble);
                       aux1 = 0;
                       do{
                       System.out.println("\n Digite a frequencia do Aluno : \n");
                       auxint1 = sc.nextInt();
                       if(auxint1 > a.getNumTotalAulas() || auxint1 < 0 ){
                           System.out.println("Afrequencia deve ser maior que  0 e menor que O numero total de Aulas");
                       }
                       else{
                           
                           aux1 = 1;
                       }
                   }while(aux1 != 1);
                       a.addFrequancia(auxint, auxint1);
                       }
                       else{
                           System.out.println("RA já cadastrado, digite um novo");
                       }
                       al = null;
                       break;
               case 0:
                   a.desmatricularAlunos();
                   a.removeProfessor();
                   aux = -2;
                   break;
           }
       }while(aux != -2);
    }
}

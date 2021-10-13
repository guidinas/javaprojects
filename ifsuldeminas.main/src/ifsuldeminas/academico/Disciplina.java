/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifsuldeminas.academico;

import ifsuldeminas.alunos.Aluno;
import ifsuldeminas.funcionario.Professor;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author guidi
 */
public class Disciplina {
    private String nome;
    private int periodo;
    private int numAulasSemana;
    private int numTotalAulas;
    private Professor professor;
    private ArrayList<Aluno> alunos;
    private ArrayList<Double> notas;
    private ArrayList<Integer> frequencia;
    DecimalFormat df = new DecimalFormat("###,##0");
    
    public Disciplina(String nome , int periodo , int numAulasSemana , int numSemana ){
        this.nome = nome;
        this.periodo = periodo;
        this.numAulasSemana = numAulasSemana;
        this.numTotalAulas = numAulasSemana * numSemana;
        this.alunos = new ArrayList<>();
        this.notas = new ArrayList<> ();
        this.frequencia = new ArrayList<>();
        this.professor = null;
    }
    public Disciplina (String nome , int periodo , int numAulasSemana , int numSemana , Professor professor){
        this.nome = nome;
        this.periodo = periodo;
        this.numAulasSemana = numAulasSemana;
        this.numTotalAulas = numAulasSemana * numSemana;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.notas = new ArrayList<> ();
        this.frequencia = new ArrayList<>();
    }
   public boolean matricularAluno(Aluno aluno){
       Aluno aux;
       if(this.alunos.size() == 0){
       this.alunos.add(aluno);
       this.frequencia.add(0);
       this.notas.add(0.0);
       return true;      
       }
        for (Aluno aluno1 : this.alunos) {
            aux = aluno1;
            if( aluno.getRa() == aux.getRa()){
                return false;
            }
        }
       this.alunos.add(aluno);
       this.frequencia.add(0);
       this.notas.add(0.0);
       return true;      
    }
   public boolean desmatricularAluno(int posAluno){
       if(posAluno < 0){
           return false;
       }
       if(posAluno < this.alunos.size() ){
           this.alunos.remove(posAluno);
           this.notas.remove(posAluno);
           this.frequencia.remove(posAluno);
           return true;
       }
       return false;
   }
   public void setProfessor(Professor professor){
       this.professor = professor;
   }
   public void removeProfessor(){
       this.professor = null;
   }
   public int getNumeroAlunos(){
       return this.alunos.size();
   }
   public boolean addNota(int posAluno , double nota){
        if(posAluno < 0){
           return false;
       }
       if(posAluno < this.alunos.size() ){
           this.notas.set(posAluno, nota);
           return true;
       }
       return false;
   }
   public boolean addFrequancia(int posAluno , int frequenciaTotal){
       if(posAluno < 0){
           return false;
       }
       if(posAluno < this.alunos.size() ){
           if(frequenciaTotal <= this.numTotalAulas){
               this.frequencia.set(posAluno, frequenciaTotal);
               return true;
           }
           
       }
       return false;
   }
   public boolean estaAprovado(int posAluno){
       if(posAluno < this.alunos.size() && posAluno >= 0 ){
           double aux;
           aux = (double)this.frequencia.get(posAluno) / (double)this.numTotalAulas;
           if( aux >= 0.75 && this.notas.get(posAluno) >= 6.0 ){
               return true;
           }
       }
       return false;
   }
   public void exibirReprovados(){
       int i =0;
       for(Aluno aluno1 : this.alunos){
           if(this.estaAprovado(i) == false){
               aluno1.exibirAluno(); 
           }
           i += 1;
       }
   }
   public void exibirAprovados(){
       int i =0;
       for(Aluno aluno1 : this.alunos){
           if(this.estaAprovado(i) == true){
               aluno1.exibirAluno();
           }
           i += 1;
       }
   }
   public double calculaMedia(){
       double aux = 0.0;
       for(double a : this.notas){
           aux += a;
       }
       return aux / (double) this.alunos.size();
   }
   public void exibirMaiorNota(){
       int auxint, i;
       i=0;
       auxint =0;
       double auxdouble;
       Aluno auxaluno;
       auxdouble = 0;
       for(double a : this.notas){
         if(a > auxdouble)
         {
             auxdouble = a;
             auxint = i;
         }
           i++;
       }
       auxaluno = this.alunos.get(auxint);
       System.out.println("\n\nAluno com maior nota : \n");
       auxaluno.exibirAluno();
   }
   public void exibeMenorNota(){
       int auxint, i;
       i=0;
       auxint =0;
       double auxdouble;
       Aluno auxaluno;
       auxdouble = 100;
       for(double a : this.notas){
         if(a < auxdouble)
         {
             auxdouble = a;
             auxint = i;
         }
           i++;
       }
       auxaluno = this.alunos.get(auxint);
       System.out.println("\n\nAluno com menor nota : \n");
       auxaluno.exibirAluno();
   }
   public int getQuantidadeReprovados(){
       int i =0;
       int auxint = 0;
       for(Aluno aluno1 : this.alunos){
           if(this.estaAprovado(i) == false){
               auxint +=1;
           }
           i += 1;
       }
       return auxint;
   }
   public int getQuantidadeAprovados(){
       int i =0;
       int auxint = 0;
       for(Aluno aluno1 : this.alunos){
           if(this.estaAprovado(i) == true){
               auxint +=1;
           }
           i += 1;
       }
       return auxint;
   }
   public void exibirProfessor(){
       if(this.professor == null){
           System.out.println("\nMatéria não possui Professor");
       }
       else{
           this.professor.exibirProfessor();
       }
   }
   public double getAproveitamentoAluno(int posAluno){
       return ((double)this.frequencia.get(posAluno) /(double) this.numTotalAulas ) * 100;
   }
   public double getNotaAluno(int posAluno){
       return this.notas.get(posAluno);
   }
   public void exibirAlunosAcimaMedia(){
       double media;
       int auxint = 0;
       Aluno auxaluno;
       media = this.calculaMedia();
        if(this.alunos.isEmpty()){
           System.out.println("Disciplina não possui alunos matriculados");
       }
       else{
           for(double a : this.notas){
           if(a > media){
               auxaluno = this.alunos.get(auxint);
               auxaluno.exibirAluno();
           }
           auxint ++;
       }
       }
   }
   public void exibirAlunosAbaixoMedia(){
       double media;
       int auxint = 0;
       Aluno auxaluno;
       media = this.calculaMedia();
       if(this.alunos.isEmpty()){
           System.out.println("Disciplina não possui alunos matriculados");
       }
       else{
           for(double a : this.notas){
           if(a < media){
               auxaluno = this.alunos.get(auxint);
               auxaluno.exibirAluno();
           }
           auxint ++;
       }
       }
   }
   public void exibirAlunosNotaAproveitamento(){
       if(this.alunos.isEmpty()){
           System.out.println("Disciplina não possui alunos matriculados");
       }
       else{
           Aluno auxaluno;
           for(int i = 0; i < this.alunos.size() ;i++){
               auxaluno = this.alunos.get(i);
               System.out.println("\n============= Aluno ==========");
               System.out.println("Nome :  " + auxaluno.getNome() + "\nNota = " + this.notas.get(i) + "\nAproveitamento : " + df.format(this.getAproveitamentoAluno(i)));
           }
       }
   }
   public void desmatricularAlunos(){
       this.alunos.clear();
       this.notas.clear();
       this.frequencia.clear();
   }
   public void exibirOrdenadosPorNota(){
        Aluno al;
       if(this.alunos.isEmpty()){
           System.out.println("\nDisciplina não possui nenhum aluno matriculado.");
       }
       else if(this.alunos.size()==1){
          
           al = this.alunos.get(0);
           System.out.println("============= Aluno =============");
           System.out.println("\nNome : " + al.getNome() + "\nNota : " + this.notas.get(0));
       }
       else{
       ArrayList<Double> a;
       a = this.notas;
       int[] auxint;
       int auxint1;
       auxint = new int[this.alunos.size()];
       for(int i = 0 ; i < this.alunos.size() ; i++){
           auxint[i] = i;
       }
       for(int i = 0 ; i < this.alunos.size() ; i++){
         for(int j = 0 ; j < this.alunos.size() - 1; j++){
            if(this.notas.get(auxint[j]) < this.notas.get(auxint[j+1])){
                auxint1 = auxint[j];
                auxint[j] =auxint[j+1]; 
                auxint[j+1] = auxint1;
            }
         }  
       }
       
       for(int i = 0 ; i < this.alunos.size() ; i++){
           al = this.alunos.get(auxint[i]);
           System.out.println("============= Aluno =============");
           System.out.println("\nNome : " + al.getNome() + "\nNota : " + this.notas.get(auxint[i]));
       }
       } 
   } 
   public void exibirDisciplina(){
       System.out.println("========== Resumo Disciplina==========");
       System.out.println("Nome : " + this.nome);
       System.out.println("Aulas por semana : " + this.numAulasSemana);
       System.out.println("Aulas totais : " + this.numTotalAulas);
       if(this.professor == null){
           System.out.println("Professor não associado a matéria");
       }
       else{
           this.professor.exibirProfessor();
       }
       if(this.alunos.isEmpty()){
           System.out.println("não há alunos matriculados na matéria.");
       }
       else{
           this.exibirAlunosNotaAproveitamento();
       }
   }

    public int getNumTotalAulas() {
        return numTotalAulas;
    }
}
    


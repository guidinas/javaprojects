/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospital;

/**
 *
 * @author guidi
 */
public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;
    private char sexo;
    private int idade;
    
    public Funcionario(String nome, double salario, String cargo, char sexo, int idade){
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
        this.sexo =  sexo;
        this.idade = idade;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author guidi
 */
public class Contato {
    private   String nome;
    private  String email;
    private  String telefone;
    
    public Contato(String nome, String email, String telefone){
        this.nome = nome;
        this.email= email;
        this.telefone = telefone;
        
    }
    
    public void mostrarInformacoes(){
        System.out.println("Nome:" + this.nome);
        System.out.println("Telefone:" + this.telefone);
        System.out.println("Email: " + this.email);
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}

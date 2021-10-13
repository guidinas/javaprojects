/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pessoa;

/**
 *
 * @author guidi
 */
public class pessoamodel {
    private String nome;
    private String cpf;
    private int idade;
    private String sexo;
    
  public  pessoamodel(String nome, String cpf,int idade,String sexo){
      this.nome = nome;
      this.cpf = cpf;
      this.idade = idade;
      this.sexo = sexo;
      
  }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}

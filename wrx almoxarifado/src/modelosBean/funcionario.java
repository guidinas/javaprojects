/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package modelosBean;

/**
 *
 * @author guidi
 */
public class funcionario {
    private int cod;
    private String  nome;
    private int funcao;
    private String admissao;
    private String matricula;

    public funcionario(int cod, String nome, int funcao, String admissao,String matricula) {
        this.cod = cod;
        this.nome = nome;
        this.funcao = funcao;
        this.admissao = admissao;
        this.matricula = matricula;
    }

    
    public funcionario(String nome, int funcao, String admissao,String matricula) {
        this.nome = nome;
        this.funcao = funcao;
        this.admissao = admissao;
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getAdmissao() {
        return admissao;
    }

    public void setAdmissao(String admissao) {
        this.admissao = admissao;
    }
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFuncao() {
        return funcao;
    }

    public void setFuncao(int funcao) {
        this.funcao = funcao;
    }
    
    
}

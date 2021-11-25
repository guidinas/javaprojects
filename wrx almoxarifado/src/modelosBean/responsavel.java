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
public class responsavel {
    private String nome;
    private int cod;
    private String senha;

    /**
     *
     * @param nome
     * @param senha
     */
    public responsavel(String nome , String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public responsavel(String nome,String senha, int cod) {
        this.nome = nome;
        this.cod = cod;
        this.senha =  senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
    
}

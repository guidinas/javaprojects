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
public class epiSolicitacao {
    private String nome;
    private int codEPI;
    private int quantidade;

    public epiSolicitacao(String nome, int codEPI, int quantidade) {
        this.nome = nome;
        this.codEPI = codEPI;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodEPI() {
        return codEPI;
    }

    public void setCodEPI(int codEPI) {
        this.codEPI = codEPI;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}

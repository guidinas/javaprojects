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
public class marcaEPI {
    private int cod;
    private String nome;
    private int quantidade;
    private int codEPI;
    private String descricao;

    public marcaEPI(int cod, String nome, int quantidade, int codEPI) {
        this.cod = cod;
        this.nome = nome;
        this.quantidade = quantidade;
        this.codEPI = codEPI;
    }
    
    public marcaEPI(String nome, int codEPI) {
        this.nome = nome;
        this.codEPI = codEPI;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public int getCodEPI() {
        return codEPI;
    }
    
    public void setCodEPI(int codEPI) {
        this.codEPI = codEPI;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}

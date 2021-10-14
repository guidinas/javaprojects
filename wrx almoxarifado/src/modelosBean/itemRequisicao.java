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
public class itemRequisicao {
    private int codEPI;
    private int codRequisicao;
    private int quantidade;

    public itemRequisicao(int codEPI, int codRequisicao, int quantidade) {
        this.codEPI = codEPI;
        this.codRequisicao = codRequisicao;
        this.quantidade = quantidade;
    }

    public int getCodEPI() {
        return codEPI;
    }

    public void setCodEPI(int codEPI) {
        this.codEPI = codEPI;
    }

    public int getCodRequisicao() {
        return codRequisicao;
    }

    public void setCodRequisicao(int codRequisicao) {
        this.codRequisicao = codRequisicao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}

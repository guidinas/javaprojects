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
    private int codMarca;

    public itemRequisicao(int codEPI, int quantidade, int codMarca) {
        this.codEPI = codEPI;
        this.quantidade = quantidade;
        this.codMarca = codMarca;
    }
    public itemRequisicao(int codEPI, int codRequisicao, int quantidade,int codMArca) {
        this.codEPI = codEPI;
        this.codRequisicao = codRequisicao;
        this.quantidade = quantidade;
        this.codMarca = codMArca;
    }

    public int getCodMarca() {
        return codMarca;
    }

    public void setCodMarca(int codMarca) {
        this.codMarca = codMarca;
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

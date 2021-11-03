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
public class estoqueEPI {
    private String nomeEPI;
    private String nomeMarca;
    private int quantidade;
    private int minimo;
    private int maximo;
    private int codEPI;
    private int codMarca;

    public estoqueEPI(String nomeEPI, String nomeMarca, int quantidade, int minimo, int maximo, int codEPI, int codMArca) {
        this.nomeEPI = nomeEPI;
        this.nomeMarca = nomeMarca;
        this.quantidade = quantidade;
        this.minimo = minimo;
        this.maximo = maximo;
        this.codEPI = codEPI;
        this.codMarca = codMArca;
    }

    public String getNomeEPI() {
        return nomeEPI;
    }

    public void setNomeEPI(String nomeEPI) {
        this.nomeEPI = nomeEPI;
    }

    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int getCodEPI() {
        return codEPI;
    }

    public void setCodEPI(int codEPI) {
        this.codEPI = codEPI;
    }

    public int getCodMArca() {
        return codMarca;
    }

    public void setCodMArca(int codMArca) {
        this.codMarca = codMArca;
    }
    
    
    
}

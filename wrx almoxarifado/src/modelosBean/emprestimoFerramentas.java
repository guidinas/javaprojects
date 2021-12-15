/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package modelosBean;

import java.util.Date;

/**
 *
 * @author guidi
 */
public class emprestimoFerramentas {
    private String nomeFunc;
    private Date dataEmprestimo;
    private String nomeFerramenta;
    private int codSaida;
    private int codFerramenta;
    private int tipoFerramenta;
    private int codFunc;
    
    
    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getNomeFerramenta() {
        return nomeFerramenta;
    }

    public void setNomeFerramenta(String nomeFerramenta) {
        this.nomeFerramenta = nomeFerramenta;
    }

    public int getCodSaida() {
        return codSaida;
    }

    public void setCodSaida(int codSaida) {
        this.codSaida = codSaida;
    }

    public int getCodFerramenta() {
        return codFerramenta;
    }

    public void setCodFerramenta(int codFerramenta) {
        this.codFerramenta = codFerramenta;
    }

    public int getTipoFerramenta() {
        return tipoFerramenta;
    }

    public void setTipoFerramenta(int tipoFerramenta) {
        this.tipoFerramenta = tipoFerramenta;
    }
    
    
}

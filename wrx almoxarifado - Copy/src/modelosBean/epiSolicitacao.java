/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package modelosBean;

import java.sql.Timestamp;

/**
 *
 * @author guidi
 */
public class epiSolicitacao {
    private String nome;
    private int codEPI;
    private int quantidade;
    private Timestamp dataGeral;

    public epiSolicitacao(String nome, int codEPI, int quantidade) {
        this.nome = nome;
        this.codEPI = codEPI;
        this.quantidade = quantidade;
    }

    public epiSolicitacao(String nome, int codEPI, int quantidade, Timestamp dataGeral) {
        this.nome = nome;
        this.codEPI = codEPI;
        this.quantidade = quantidade;
        this.dataGeral = dataGeral;
    }

    public Timestamp getDataGeral() {
        return dataGeral;
    }

    public void setDataGeral(Timestamp dataGeral) {
        this.dataGeral = dataGeral;
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

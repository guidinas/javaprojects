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
public class requisicao {
    private int codFuncionario;
    private int cod;
    private int status;
    private Date dataRequisicao;
    private String responsavel;

    public requisicao(int codFuncionario, String responsavel) {
        this.codFuncionario = codFuncionario;
        this.responsavel = responsavel;
    }
    
    
    
    public requisicao(int cod, int status, Date dataRequisicao) {
        this.cod = cod;
        this.status = status;
        this.dataRequisicao = dataRequisicao;
    }

    public requisicao(int status, Date dataRequisicao) {
        this.status = status;
        this.dataRequisicao = dataRequisicao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getDataRequisicao() {
        return dataRequisicao;
    }

    public void setDataRequisicao(Date dataRequisicao) {
        this.dataRequisicao = dataRequisicao;
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }
    
    
}

/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package modelosBean;

import java.sql.Time;
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
    private int codResponsavel;
    private Time hora;

    public requisicao(int codFuncionario, int cod, int status, Date dataRequisicao, int codResponsavel, Time hora) {
        this.codFuncionario = codFuncionario;
        this.cod = cod;
        this.status = status;
        this.dataRequisicao = dataRequisicao;
        this.codResponsavel = codResponsavel;
        this.hora = hora;
    }

    public requisicao(int codFuncionario, int codResponsavel) {
        this.codFuncionario = codFuncionario;
        this.codResponsavel = codResponsavel;
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
    
    public int getCodResponsavel() {
        return codResponsavel;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public void setCodResponsavel(int codResponsavel) {
        this.codResponsavel = codResponsavel;
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

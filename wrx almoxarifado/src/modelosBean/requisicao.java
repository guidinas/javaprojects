/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package modelosBean;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author guidi
 */
public class requisicao {
    private int codFuncionario;
    private int cod;
    private int status;
    private int codResponsavel;
    private Timestamp hora;


    public requisicao(int codFuncionario, int codResponsavel) {
        this.codFuncionario = codFuncionario;
        this.codResponsavel = codResponsavel;
    }

    public requisicao(int codFuncionario, int cod, int status, int codResponsavel, Timestamp hora) {
        this.codFuncionario = codFuncionario;
        this.cod = cod;
        this.status = status;
        this.codResponsavel = codResponsavel;
        this.hora = hora;
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
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

    public int getCodResponsavel() {
        return codResponsavel;
    }

    public void setCodResponsavel(int codResponsavel) {
        this.codResponsavel = codResponsavel;
    }

    public Timestamp getHora() {
        return hora;
    }

    public void setHora(Timestamp hora) {
        this.hora = hora;
    }
    
    
}

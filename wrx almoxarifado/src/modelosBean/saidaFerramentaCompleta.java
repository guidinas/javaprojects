/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package modelosBean;

import java.sql.Date;

/**
 *
 * @author guidi
 */
public class saidaFerramentaCompleta {
    private String nomeFerramenta;
    private String nomeFuncionario;
    private Date dataSaida;
    private int codFuncionario;
    private int codFerramenta;
    private int codSaida;

    public saidaFerramentaCompleta(String nomeFerramenta, String nomeFuncionario, Date dataSaida, int codFuncionario, int codFerramenta, int codSaida) {
        this.nomeFerramenta = nomeFerramenta;
        this.nomeFuncionario = nomeFuncionario;
        this.dataSaida = dataSaida;
        this.codFuncionario = codFuncionario;
        this.codFerramenta = codFerramenta;
        this.codSaida = codSaida;
    }

    public int getCodSaida() {
        return codSaida;
    }

    public void setCodSaida(int codSaida) {
        this.codSaida = codSaida;
    }
    
    public String getNomeFerramenta() {
        return nomeFerramenta;
    }

    public void setNomeFerramenta(String nomeFerramenta) {
        this.nomeFerramenta = nomeFerramenta;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public int getCodFerramenta() {
        return codFerramenta;
    }

    public void setCodFerramenta(int codFerramenta) {
        this.codFerramenta = codFerramenta;
    }
    
    
}

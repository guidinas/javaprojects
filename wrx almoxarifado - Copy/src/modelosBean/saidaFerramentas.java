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
public class saidaFerramentas {
    private int cod;
    private Timestamp hora;
    private int codFerramenta;
    private int stat;
    private int codFuncionario;
    private String nomeFerr;
    
    public saidaFerramentas(int codFerramenta, int codFuncionario, String nomeFerr) {
        this.codFerramenta = codFerramenta;
        this.codFuncionario = codFuncionario;
        this.nomeFerr = nomeFerr;
    }
    

    public saidaFerramentas(int codFerramenta, int codFuncionario) {
        this.codFerramenta = codFerramenta;
        this.codFuncionario = codFuncionario;
    }

    public saidaFerramentas(int cod, Timestamp hora, int codFerramenta, int stat, int codFuncionario) {
        this.cod = cod;
        this.hora = hora;
        this.codFerramenta = codFerramenta;
        this.stat = stat;
        this.codFuncionario = codFuncionario;
    }

    public String getNomeFerr() {
        return nomeFerr;
    }

    public void setNomeFerr(String nomeFerr) {
        this.nomeFerr = nomeFerr;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Timestamp getHora() {
        return hora;
    }

    public void setHora(Timestamp hora) {
        this.hora = hora;
    }

    public int getCodFerramenta() {
        return codFerramenta;
    }

    public void setCodFerramenta(int codFerramenta) {
        this.codFerramenta = codFerramenta;
    }

    public int getStat() {
        return stat;
    }

    public void setStat(int stat) {
        this.stat = stat;
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }
    
}

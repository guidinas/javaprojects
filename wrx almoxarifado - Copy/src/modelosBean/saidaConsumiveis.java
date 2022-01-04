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
public class saidaConsumiveis {
    private int cod;
    private int codResp;
    private int codcons;
    private int quantidade;
    private int stat;
    private Date dia;
    private int codFunc;

    public saidaConsumiveis(int codcons, int quantidade, int codFunc) {
        this.codcons = codcons;
        this.quantidade = quantidade;
        this.codFunc = codFunc;
    }

    public saidaConsumiveis(int codResp, int codcons, int quantidade, int codFunc) {
        this.codResp = codResp;
        this.codcons = codcons;
        this.quantidade = quantidade;
        this.codFunc = codFunc;
    }

    public saidaConsumiveis(int cod, int codResp, int codcons, int quantidade, int stat, Date dia, int codFunc) {
        this.cod = cod;
        this.codResp = codResp;
        this.codcons = codcons;
        this.quantidade = quantidade;
        this.stat = stat;
        this.dia = dia;
        this.codFunc = codFunc;
    }
    

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCodResp() {
        return codResp;
    }

    public void setCodResp(int codResp) {
        this.codResp = codResp;
    }

    public int getCodcons() {
        return codcons;
    }

    public void setCodcons(int codcons) {
        this.codcons = codcons;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getStat() {
        return stat;
    }

    public void setStat(int stat) {
        this.stat = stat;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public int getCodFunc() {
        return codFunc;
    }

    public void setCodFunc(int codFunc) {
        this.codFunc = codFunc;
    }
    
}

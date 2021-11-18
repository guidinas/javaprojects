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
public class EPIMarca {
    private int cod;
    private String nome;
    private int maximo;
    private int minimo;
    private String descricao;
    private String CA;
    private Date validade;
    private String Marca;

    public EPIMarca(String nome, int maximo, int minimo, String descricao, String CA, Date validade, String Marca) {
        this.nome = nome;
        this.maximo = maximo;
        this.minimo = minimo;
        this.descricao = descricao;
        this.CA = CA;
        this.validade = validade;
        this.Marca = Marca;
    }

    public EPIMarca(int cod, String nome, int maximo, int minimo, String descricao, String CA, Date validade, String Marca) {
        this.cod = cod;
        this.nome = nome;
        this.maximo = maximo;
        this.minimo = minimo;
        this.descricao = descricao;
        this.CA = CA;
        this.validade = validade;
        this.Marca = Marca;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCA() {
        return CA;
    }

    public void setCA(String CA) {
        this.CA = CA;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    
    
    
    
    
    
    
    
    
}

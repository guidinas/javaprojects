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
public class ferramenta {
    private String nome;
    private String registro;
    private String marca;
    private int cod;
    private int stat;
    private int quantidade;
    private int tipo;

    public ferramenta(String nome, String registro, String marca, int stat, int quantidade, int tipo) {
        this.nome = nome;
        this.registro = registro;
        this.marca = marca;
        this.stat = stat;
        this.quantidade = quantidade;
        this.tipo = tipo;
    }

    public ferramenta(String nome, String registro, String marca, int cod, int stat, int quantidade, int tipo) {
        this.nome = nome;
        this.registro = registro;
        this.marca = marca;
        this.cod = cod;
        this.stat = stat;
        this.quantidade =quantidade;
        this.tipo = tipo;
        
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getStat() {
        return stat;
    }

    public void setStat(int stat) {
        this.stat = stat;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    

        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
    
    
}

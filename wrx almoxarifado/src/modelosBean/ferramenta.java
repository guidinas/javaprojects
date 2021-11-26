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

    public ferramenta(String nome, String registro, String marca) {
        this.nome = nome;
        this.registro = registro;
        this.marca = marca;
    }

    public ferramenta(String nome, String registro, String marca, int cod, int stat) {
        this.nome = nome;
        this.registro = registro;
        this.marca = marca;
        this.cod = cod;
        this.stat = stat;
    }

    public int getStat() {
        return stat;
    }

    public void setStat(int stat) {
        this.stat = stat;
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

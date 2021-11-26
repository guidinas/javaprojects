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
public class consumivel {
    private String nome;
    private int minimo;
    private int maximo;
    private String marca;
    private int quantidade;
    private int cod;


    public consumivel(String nome, int minimo, int maximo, String marca) {
        this.nome = nome;
        this.minimo = minimo;
        this.maximo = maximo;
        this.marca = marca;
    }

    public consumivel(String nome, int minimo, int maximo, String marca, int quantidade, int cod) {
        this.nome = nome;
        this.minimo = minimo;
        this.maximo = maximo;
        this.marca = marca;
        this.quantidade = quantidade;
        this.cod = cod;
    }

    

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
    
    
}

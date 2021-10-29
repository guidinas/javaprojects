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
    private int cod;

    public consumivel(String nome, int minimo, int maximo) {
        this.nome = nome;
        this.minimo = minimo;
        this.maximo = maximo;
    }

    public consumivel(String nome, int minimo, int maximo, int cod) {
        this.nome = nome;
        this.minimo = minimo;
        this.maximo = maximo;
        this.cod = cod;
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

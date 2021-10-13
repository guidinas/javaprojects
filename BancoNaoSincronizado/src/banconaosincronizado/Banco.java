package banconaosincronizado;

/**
 * Um banco cujas contas estarão realizando transferências.
 *
 * @author Rafael D'Addio (adaptado de Cay Horstmann - Core Java Vol 1., 9a edição)
 */
public class Banco {

    private double[] contas;

    /**
     * Construtor.
     *
     * @param n número de contas
     * @param balanco saldo inicial das contas
     */
    public Banco(int n, double balanco) {
        contas = new double[n];
        for (int i = 0; i < contas.length; i++) {
            contas[i] = balanco;
        }
    }

    /**
     * Realiza uma transferência entre contas.
     *
     *
     * @param de a conta de saída
     * @param para a conta de entrada
     * @param quantia a quantia transferida
     * @throws java.lang.InterruptedException
     */

    /**
     * Calcula o balanço total
     *
     * @return soma de todas as contas
     */
    public double getBalancoTotal() {
        double total = 0;
        for (int i = 0; i < contas.length; i++) {
            total += contas[i];
        }
        return total;
    }
    public double getTotal(int conta){        
        return this.contas[conta];
    }
    /**
     * Retorna o numero de contas
     *
     * @return numero de contas
     */
    public int tamanho() {
        return contas.length;
    }
    public void recebe(int conta, double aumento){
        this.contas[conta] += aumento;
    }
    public boolean retira(int conta, double retirada){
        if(this.contas[conta] < retirada){
            return false;
        }
        this.contas[conta] -= retirada;
        return true;
    }

}

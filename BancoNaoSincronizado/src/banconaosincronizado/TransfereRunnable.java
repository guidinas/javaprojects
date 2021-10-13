package banconaosincronizado;

/**
 * A tarefa de transferência.
 *
 * Implementa Runnable.
 *
 * @author Rafael D'Addio (adaptado de Cay Horstmann - Core Java Vol 1., 9a edição)
 */
public class TransfereRunnable implements Runnable {

    private final Bancos bancos;
    private final int deConta, paraConta, deBanco, paraBanco ;
    private final double quantia;
    private final int ATRASO = 10;

    /**
     * O Construtor.
     * @param deBanco banco de onde vira o dinheiro
     * @param paraBanco Bonco para onde irá o dinheiro
     * @param bancos bancos onde será feita a transferência
     * @param deConta conta de saída
     * @param paraConta conta de entrada
     * @param quantia quantidade a ser transferida
     */
    public TransfereRunnable(Bancos bancos,int deBanco, int deConta, int paraBanco, int paraConta, double quantia) {
        this.bancos = bancos;
        this.deConta = deConta;
        this.paraConta = paraConta;
        this.quantia = quantia;
        this.deBanco = deBanco;
        this.paraBanco = paraBanco;

    }

    @Override
    public void run() {
        try {
            //realiza a transferência
            bancos.transfere(deConta, deBanco, paraConta, paraBanco, quantia);
            //dorme por um tempo aleatório
            Thread.sleep((int) (ATRASO * Math.random()));
        } catch (InterruptedException ex) {
        }
    }

}

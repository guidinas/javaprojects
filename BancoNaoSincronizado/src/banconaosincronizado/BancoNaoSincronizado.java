package banconaosincronizado;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Rafael D'Addio (adaptado de Cay Horstmann - Core Java Vol 1., 9a edição)
 */
public class BancoNaoSincronizado {

    //constantes
    public static final int NCONTAS = 100;
    public static final double BALANCO_INICIAL = 1000.0;
    public static final int NBANCOS = 10;
    public static void main(String[] args) {

        Bancos b = new Bancos(NBANCOS, NCONTAS, BALANCO_INICIAL);
        ExecutorService es = Executors.newCachedThreadPool();

        //loop eterno
        while(true) {
            //gera aleatoriamente uma transferência de certa quantia entre uma conta e outra
            int banc1 = (int) (b.tamanho() * Math.random());
            int de = (int) (b.tamanhobanc(banc1) * Math.random());
            int banc2 = (int) (b.tamanho() * Math.random());
            int para = (int) (b.tamanhobanc(banc2) * Math.random());
            while (de == para && banc1 ==banc2) {
                para = (int) (b.tamanhobanc(banc2) * Math.random());
            }
            es.execute(new TransfereRunnable( b, banc1 , de, banc2, para,  BALANCO_INICIAL * Math.random()));
        }
    }

}

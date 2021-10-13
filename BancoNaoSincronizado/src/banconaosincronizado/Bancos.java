/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package banconaosincronizado;

/**
 *
 * @author guidi
 */
public class Bancos {
    private Banco[] bancos;
    public Bancos(int nBancos,int ncontas, double entrada){
        bancos = new Banco[nBancos];
        for(int i = 0; i < nBancos;i++){
            bancos[i] = new Banco(ncontas,entrada);
        }
    }
    
    public int tamanho(){
    return this.bancos.length;
    }
    public int tamanhobanc(int banco){
        return this.bancos[banco].tamanho();
    }
   public synchronized void transfere(int deConta,int  deBanco,int  paraConta,int  paraBanco,double quantia) throws InterruptedException{
       synchronized(this){
       while(!this.bancos[deBanco].retira(deConta, quantia)){
           System.out.println("Conta " + deConta + " do Banco " + deBanco + "sem fundos!" + quantia);
           wait();
       }
       this.bancos[paraBanco].recebe(paraConta, quantia);
           System.out.println("Transferencia efetuada");
           System.out.println("Valor = " + quantia);
           System.out.println("De Banco " + deBanco + " Conta " + deConta);
           System.out.println("Para Banco " + paraBanco + " Conta " + paraConta);
           Double soma = 0.0;
           for(int j=0;j < bancos.length ; j++){
            soma += this.bancos[j].getBalancoTotal();
           }
           System.out.println("Balanço global = " + soma);
           notifyAll();
       }
       
   }
}
    


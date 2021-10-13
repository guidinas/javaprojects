/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package busao;

import static busao.Busao.capacidade;
import static busao.Busao.numeroBuss;

/**
 *
 * @author guidi
 */
public class Terminal {
      Buss[] b;
      /*
      * Contrutor inicia o terminal com número de onibus decididos
      * @param tamanho quantos onibus cabem no terminal
      */
      public Terminal(int tamanho){
          this.b = new Buss[tamanho];
          for(int i = 0 ; i< tamanho; i++){
              this.b[i]  = new Buss();
          }
      }
      public synchronized void reserva(int onibus, int reserva){
          if(capacidade >= this.b[onibus].getReservados() + reserva){
              this.b[onibus].reserva(reserva);
              System.out.println("Alocados " + reserva + " passageiros ao onibus " + onibus);
              return;
          }
          System.out.println("Impossível alocar " + reserva + " passageiros ao onibus " + onibus);
      }
      public void imprimefinal(){
          
          for(int i=0; i<numeroBuss;i++){
              System.out.println("O onibus " + (i+1) + " Saiu com " + this.b[i].getReservados() + " passageiros");
          }
          
      }
}

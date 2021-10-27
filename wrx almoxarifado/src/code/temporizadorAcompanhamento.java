/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package code;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guidi
 */
public class temporizadorAcompanhamento implements Runnable{
    private final acompanhamentoRequisicoes alvo;
    public temporizadorAcompanhamento(acompanhamentoRequisicoes alvo){
        this.alvo = alvo;
    }
    public void att(){
        try {
            this.alvo.atualizaTable();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(temporizadorAcompanhamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
@Override 
public synchronized void run(){
      while(true){    
       att();
          System.out.println("le");
      try {
         this.wait(500);
      } catch (InterruptedException ex) {
          Logger.getLogger(temporizadorAcompanhamento.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
     
}
    
    
    
}

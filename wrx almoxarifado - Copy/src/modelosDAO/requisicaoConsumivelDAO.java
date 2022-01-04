/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package modelosDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelosBean.consumivel;
import modelosBean.itemSaidaConsumivel;
import modelosBean.requisicaoConsumivel;
import modelosBean.saidaConsumiveis;
import static modelosDAO.requisicaoDAO.criaRequisicaoCod;

/**
 *
 * @author guidi
 */
public class requisicaoConsumivelDAO {

    /**
     *
     * @param ultima
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     * 
     */
    public static boolean checaItens(requisicaoConsumivel ultima) throws SQLException, ClassNotFoundException {
        /*
      ArrayList<consumivel> list;
        list = consumivelDAO.listaConsumivel();
        ArrayList<itemSaidaConsumivel> sai;
        sai = ultima.getCorpo();
        for(itemSaidaConsumivel A : sai){
            System.out.println("555");
            for(consumivel a : list){
                if(a.getCod() == A.getCodConsumivel()){
                    System.out.println("ou");
                    if(A.getQuantidade() > a.getQuantidade() ){
                        System.out.println("Tentou");
                        JOptionPane.showMessageDialog(null, "A quantidade solicitada do Item excede a quantidade registrada no sistema \n EPI: " + a.getNome()  + "\n Da marca:  " + a.getMarca() + "\n Quantidade Disponível: " + a.getQuantidade());
                        return false;
                    }
                    if((a.getMinimo() - A.getQuantidade()) < a.getMinimo() ){
                        JOptionPane.showMessageDialog(null, "A quantidade solicitada do Item faz com que a quantidade em estoque seja menor do que o mínimo cadastrado  EPI: " + a.getNome()  + "\n Da marca:  " + a.getMarca() + "\n Quantidade Disponível: " + a.getQuantidade());
                    }
                }
            }
        }
       */ 
        return true;
    }
    

    public static Boolean insereRequisicaoCompleta(requisicaoConsumivel m) throws SQLException, ClassNotFoundException {
        ArrayList<saidaConsumiveis> a;
        int resp;
        a = m.getCorpo();
        resp = m.getCodResp();
        for(saidaConsumiveis al: a){
            al.setCodResp(resp);
           if(saidaConsumiveisDAO.iniciaSaidaConsumiveis(al)){
               
           } else{
            JOptionPane.showMessageDialog(null, "Erro de acesso ao Banco de Dados.");
        }
        }
        
    return false;
}
    
}
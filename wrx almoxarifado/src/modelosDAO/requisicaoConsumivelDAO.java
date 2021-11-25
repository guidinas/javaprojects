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
import static modelosDAO.requisicaoDAO.criaRequisicaoCod;

/**
 *
 * @author guidi
 */
public class requisicaoConsumivelDAO {

    public static boolean checaItens(requisicaoConsumivel ultima) throws SQLException, ClassNotFoundException {
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
        return true;
    }
    

    public static Boolean insereRequisicaoCompleta(requisicaoConsumivel m) throws SQLException, ClassNotFoundException {
        
        int codRequisicao;
        codRequisicao  = criaRequisicaoCod(m.getCabeca());
        if( itemSaidaConsumivelDAO.insereItensRequisicaoArray(m.getCorpo(), codRequisicao)){
            return true;
        }
        return false;
    }
    
}

/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package modelosDAO;

import DatabaseConnection.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import modelosBean.EPIMarca;
import modelosBean.epiSolicitacao;
import modelosBean.estoqueEPI;
import modelosBean.itemRequisicao;
import modelosBean.itemRequisicaoCompleta;
import modelosBean.requisicao;
import modelosBean.requisicaoCompleta;
import static modelosDAO.EPIMarcaDAO.retornaEPIMarcaArray;
import modelosDAO.itemRequisicaoDAO;
import static modelosDAO.itemRequisicaoDAO.retornaEPIsolicitacao;
import static modelosDAO.requisicaoDAO.criaRequisicaoCod;
import static modelosDAO.requisicaoDAO.retornaRequisicao;

/**
 *
 * @author guidi
 */
public class requisicaoCompletaDAO {
    
    /**
     *
     * @param m
     * @return true if the addition was possible and false in case there was any problems with this addition.
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static boolean insereRequisicaoCompleta(requisicaoCompleta m) throws SQLException, ClassNotFoundException{
        int codRequisicao;
        codRequisicao  = criaRequisicaoCod(m.getRequisicaoCabeca());
        if( itemRequisicaoDAO.insereItemRequisicaoCompletaArray(m.getCorpoCompleto(), codRequisicao)){
            return true;
        }
        return false;
    }
    public static requisicaoCompleta retornaRequisicaoCompleta(int cod) throws SQLException, ClassNotFoundException{
        requisicao req;
        req = retornaRequisicao(cod);
        ArrayList<epiSolicitacao> arrayItens;
        arrayItens = retornaEPIsolicitacao(cod);
        requisicaoCompleta a;
        a = new requisicaoCompleta(req, arrayItens, 0);
        return a;
    }

    /**
     *
     * @param funcionario
     * @param EPI
     * @return The last date that the given funcionario has requested the given EPI
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static Date  retornaUltimaDataEPI(int funcionario, int EPI) throws SQLException, ClassNotFoundException{
        Connection con;
        con = conexao.getConnection();
        PreparedStatement stmt;
        stmt = con.prepareStatement("SELECT requisicaosaida.dataRequisicao, requisicaosaida.codFuncionario, epi.nome FROM requisicaosaida JOIN (relacionarequisicaoepi JOIN epi ON epi.cod = relacionarequisicaoepi.codEPI) ON codRequisicao = requisicaosaida.cod WHERE codEPI = ? AND codFuncionario = ? AND stat = 1 ORDER BY requisicaosaida.dataRequisicao DESC LIMIT 1 ");
        stmt.setInt(1, EPI);
        stmt.setInt(2, funcionario);
        if(stmt.execute()){
            ResultSet res;
            res = stmt.getResultSet();
            while(res.next()){
                Date i;
                i = res.getDate("dataRequisicao");
                con.close();
                 return i;
            }
                
        }
        con.close();
        return null;
    }

    /**
     *
     * @param cod
     * @return 
     * @throws SQLException
     * @throws ClassNotFoundException
     * @deprecated 
     */
    public static ResultSet epiSolicitação(int cod) throws SQLException, ClassNotFoundException{
        Connection con;
        con = conexao.getConnection();
        PreparedStatement stmt;
        stmt = con.prepareStatement(" SELECT epi.nome , requisicaosaida.dataRequisicao , relacionarequisicaoepi.quantidade, epi.cod  FROM requisicaosaida JOIN (relacionarequisicaoepi JOIN epi ON epi.cod = relacionarequisicaoepi.codEPI) ON codRequisicao = requisicaosaida.cod WHERE requisicaosaida.cod = ?");
        stmt.setInt(1, cod);
        if(stmt.execute()){
            return stmt.getResultSet();
        }
        con.close();
        return null;
    }

    /**
     *
     * @param ultima
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static boolean checaItens(requisicaoCompleta ultima) throws SQLException, ClassNotFoundException {
        // Precisa  saber se tem a quantidade de itens em estoque da marca especificada
        // precisa contar o total das marcas que forem alteradas para saber se está dentro do máximo e mínimo.
        ArrayList<EPIMarca> list;
        list = retornaEPIMarcaArray();
        ArrayList<itemRequisicaoCompleta> sai;
        sai = ultima.getCorpoCompleto();
        for(itemRequisicaoCompleta A : sai){
            System.out.println("555");
            for(EPIMarca a : list){
                if(a.getCod() == A.getCodEPI()){
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
}

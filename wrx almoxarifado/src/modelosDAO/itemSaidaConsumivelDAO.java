/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package modelosDAO;

import DatabaseConnection.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import modelosBean.itemSaidaConsumivel;

/**
 *
 * @author guidi
 */
class itemSaidaConsumivelDAO {
    public static boolean insereItemArray (ArrayList<itemSaidaConsumivel> corpo , int  codd ) throws SQLException, ClassNotFoundException, Exception {
         Connection con = conexao.getConnection();
         itemSaidaConsumivel it;
        final int cod;
        cod = codd;
        PreparedStatement stmt;
       int i = corpo.size();
       int j;
       for( j = 0 ; j<i;j++ ){
           it = corpo.get(j);
           stmt = con.prepareStatement("Insert into relacionaRequisicaoEPI (codConsumivel, codSaida, quantidade, codMarcaConsumivel ) VALUES (? ,? ,? , ?) ");
            stmt.setInt(1, it.getCodConsumivel());
            stmt.setInt(2, cod );
            stmt.setInt(3, it.getQuantidade());
            stmt.setInt(4, cod);
            stmt.execute();   
       }
       if(j == i){
           con.close();
        return true;
       } 
       return false;
    }

    static boolean insereItensRequisicaoArray(ArrayList<itemSaidaConsumivel> corpo, int codRequisicao) {
        try{
            Connection con;
            con = conexao.getConnection();
            PreparedStatement stmt;
            for(itemSaidaConsumivel ar : corpo){
                stmt = con.prepareCall("Insert INTO relacionasaidaconsumivel (codConsumivel, codSaida, quantidade) VALUES ( ? , ? , ? )");
                stmt.setInt(1, ar.getCodConsumivel());
                stmt.setInt(2, codRequisicao);
                stmt.setInt(3, ar.getQuantidade());
                stmt.execute();
                stmt.clearParameters();
                stmt = con.prepareCall("UPDATE consumivel SET quantidade = (quantidade - ?) WHERE cod = ?");
                stmt.setInt(1, ar.getQuantidade());
                stmt.setInt(2, ar.getCodConsumivel());
                stmt.execute();
            }
            
            return true;
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
            return false;
        }
    }
}

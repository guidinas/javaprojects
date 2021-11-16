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
import modelosBean.marcaEPI;

/**
 *
 * @author guidi
 */
public class marcaEPIDAO {
    
public static boolean criaMarcaEPI(marcaEPI m) throws SQLException, ClassNotFoundException{
    
  Connection con = conexao.getConnection(); // Busca uma conexão com o banco de dados

PreparedStatement stmt;

 // Inserindo o comando SQL a ser usado

stmt = con.prepareStatement("INSERT INTO marcaepi (nome, codEPI, descricao) VALUES (? ,?,?) ");

 // O método setString, define que o valor passado será do tipo inteiro
 stmt.setString(1, m.getNome());
 stmt.setInt(2, m.getCodEPI());
 stmt.setString(3, m.getDescricao());

    // Método responsável por fazer a alteração no banco de dados
 if(! stmt.execute()){
     stmt.close();
        con.close();
       return true;
 }
con.close();
return false ;
}
public static boolean adicionaQuantidadeMarcaEPI(int quantidade, int codMarca) {
    try{
    Connection con;
    con = conexao.getConnection();
    PreparedStatement stmt;
    stmt = con.prepareCall("UPDATE marcaepi SET quantidade  = quantidade + ? WHERE cod = ?");
    stmt.setInt(1, quantidade);
    stmt.setInt(2, codMarca);
    stmt.execute();
    con.close();
    }catch(ClassNotFoundException |SQLException e){
        System.out.println(e);
        return false;
    }
    return true;
}

public static int removeQuantidadeMArcaEPI(int quantidade, int codMarca){
    try{
        Connection con;
        con  = conexao.getConnection();
        PreparedStatement stmt;
        stmt = con.prepareCall("SELECT cod, quantidade FROM marcaepi WHERE cod = ?");
        stmt.setInt(1, codMarca);
        if(stmt.execute()){
            ResultSet a;
            a = stmt.getResultSet();
            while(a.next()){
            int quant,quantfinal;
            quant = a.getInt("quantidade");
            quantfinal = quant - quantidade;
            if(quantfinal < 0){
                con.close();
                return -2;
            }else{
             stmt.clearParameters();
             stmt  = con.prepareCall("UPDATE marcaepi SET quantidade = quantidade - ? WHERE cod  = ?");
             stmt.setInt(1, quantidade);
             stmt.setInt(2, codMarca);
             stmt.execute();
             return quantfinal;
            }
            }
        }
    }catch(ClassNotFoundException |SQLException e){
        System.out.println(e);
        return-3;
    }
    return  -1;
}
}

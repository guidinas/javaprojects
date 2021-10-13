/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package DatabaseConnection;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

/**
 *
 * @author guidi
 */
public class conexao {
// Informamos qual o Driver que está sendo utilizado

private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

private static final String URL = "jdbc:mysql://localhost:3306/wrx?useTimezone=true&serverTimezone=UTC";

private static final String USER = "root";

private static final String PASSWORD = "";

public static Connection getConnection() throws SQLException, ClassNotFoundException {

try{

 // O método forName carrega e inicia o driver passado por parâmetro

Class.forName(DRIVER);

 // Estabelecendo a conexão

return DriverManager.getConnection(URL, USER, PASSWORD);

}catch(ClassNotFoundException | SQLException ex){ // Tratamento de Exceções

System.out.println(ex);

return null;

}

}
public static Connection closeConnection(){
    
return null;
}

}

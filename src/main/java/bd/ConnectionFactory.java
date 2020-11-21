/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author natim
 */
public class ConnectionFactory {

    public static String host = "localhost";
    public static String porta = "3306";
    public static String db = "projetoa3_bd_recomendacaomusicas";
    public static String usuario = "root";
    public static String senha = "1234";

    public static Connection obterConexao() throws Exception {
        String url = String.format(
                "jdbc:mysql://%s:%s/%s ?useTimezone=true&serverTimezone=UTC", host, porta, db
        );
        return DriverManager.getConnection(url, usuario, senha);
    }
}

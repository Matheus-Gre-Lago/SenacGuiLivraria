/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 55519
 */
public class Conexao {
    
    //cria constante com endereço do BD e schema
    private static String url = "jdbc:mysql://localhost:3306/livraria";
    //cria uma constante com user do BD
    private static String user = "root";
    //cria uma constante com senha do BD
    private static String pass = "";
    
    
    public static Connection getConexao() throws SQLException{
        //Inicia conexão nula, ainda não estabelecida
        Connection c = null;
        
        //tenta estabelecer a conexão
        try {
            c = DriverManager.getConnection(url, user, pass);
            //caso haja alguma falha entra no catch
        } catch (SQLException e) {
            throw new SQLException("Erro ao conectar banco!\n" 
                + e.getMessage());
        }
        return c;
    }
}

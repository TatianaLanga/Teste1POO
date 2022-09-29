/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ficha01.dal;
import java.sql.*;
/**
 *
 * @author dell
 */
public class ModuloConexao {
    
    //metoso para a conexao
    public static Connection conector (){
        java.sql.Connection conexao = null;
        String driver ="com.mysql.cj.jdbc.Driver";
        String url ="jdbc:mysql://localhost:3306/teste3";
        String user="root";
        String senha ="";
        
        // estabelecendo conexao
        try {
            Class.forName(driver);
            conexao= DriverManager.getConnection(url, user, senha);
            return conexao;
        } catch (Exception e) {
            return null;
        }
                
        
    }
    
}

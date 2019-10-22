/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author gabrielp
 */
public class FabricaConexao {
    public static Connection getConnection(){
        try {
            String host = "jbdc:mysql://localhost/DRA";
            String root = "root";
            String pswd = "root";
            return DriverManager.getConnection(host,root,pswd);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

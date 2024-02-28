/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Layer1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author antra
 */
public class MyDatabaseManager {
    private Connection c;
    private Statement s;
    private PreparedStatement p;
    private String host, port, databaseName, databaseUser, databasePassword;

    public MyDatabaseManager() {
        host = "localhost";
        port = "3306";
        databaseName = "school";
        databaseUser = "root";
        databasePassword = "";
    }
    
    public void connnectDB(){
        String databasePath = "jdbc:mysql://" + host+":" + ":" + "port" + "/" + databaseName + "?useUnicode=yes&characterEncoding=UTF-8";
        try{
            c = (Connection) DriverManager.getConnection(databasePath, databaseUser, databasePassword);
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public ResultSet doReadQuery (String sql){
        ResultSet rs = null;
        try{
            rs = s.executeQuery(sql);
        }catch(SQLException ex){
            Logger.getLogger(MyDatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
//    public void doUpdateQuery() throws SQLExeption{
//        
//    }
    
    public static void main(String[] args) {
        
    }

}

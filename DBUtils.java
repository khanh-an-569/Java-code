/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myLib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LTC
 */
public class DBUtils {
    public static Connection makeConnection() throws Exception{
        Connection cn = null;
        String IP="localhost";
        String instanceName="FATCAT\\SQLEXPRESS";
        String port="1433";
        String uid="sa";
        String pwd="12345";
        String db="MyStock";
        String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url="jdbc:sqlserver://" +IP+"\\"+ instanceName+":"+port
                 +";databasename="+db+";user="+uid+";password="+pwd;
        Class.forName(driver);
        cn=DriverManager.getConnection(url);
        return cn;
        
    }
    
    public static void main(String[] args) {
        try {
            System.out.println(makeConnection());
        } catch (Exception ex) {
            Logger.getLogger(DBUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

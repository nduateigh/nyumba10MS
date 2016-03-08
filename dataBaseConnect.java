
package dataHandler;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class dataBaseConnect {
    // method to confirm connection to database
   
  static  Connection con=null;
    static String url="jdbc:mysql://localhost:3306/AmaniDB";
       static String user="root";
        static String password="toor";
    public static Connection connectMe(){
        
        
        try{
            con=DriverManager.getConnection(url, user, password);
            System.out.println("tuko ndani");
        }
        catch(SQLException e){
            e.printStackTrace();
            System.out.println("iko sidaaa!");
        }
        return con;
       
    }
    public static void closeDB(){
        try {
            con.close();
        } catch (Exception e) {
        }
    }
   
   
    
    public static void insertData(String sirName,String firstName,String lastName){
        
        connectMe();
        
        try{
            Statement stmt;
            
            stmt = (Statement) con.createStatement();
            String insert="INSERT INTO AmaniDB.user (sirName,firstName,lastName) VALUES('"+sirName+"','"+firstName+"','"+lastName+"')";
            stmt.executeUpdate(insert);
        }
        catch(SQLException e){
            System.err.println(e);
            
        }
         finally{
           closeDB();
            }
            
         
    }
    
     public static void main(String[] args){
        connectMe();
        String sirName="myname";
         insertData(sirName, "firstName", "lastName");
         
    }
    
}

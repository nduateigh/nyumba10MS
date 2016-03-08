/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;
import data.*;

import dataHandler.dataBaseConnect;

import java.io.*;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author root
 */
public class nduatiServ extends HttpServlet{
    
    
    public void doPost(HttpServletResponse response, HttpServletRequest request)
            throws ServletException ,IOException{
        String SirName=request.getParameter("sirName");
        String MiddleName=request.getParameter("middleName");
        String LastName=request.getParameter("lastName");
        Person person=new Person(SirName,MiddleName,LastName);
        
        dataBaseConnect.insertData(SirName,MiddleName,LastName);
        
        request.setAttribute("display", person);
        
        String url="/jspDisplay";
        ServletContext sc=this.getServletContext();
        sc.getRequestDispatcher(url).forward(request,response);
        
        
    }
    
    protected void doGet(HttpServletResponse response, HttpServletRequest request)
            throws ServletException ,IOException{
        doPost(request,response);
    }
    
}


package com.WebAtm.servlet;
import com.WebAtm.connection.ConnectionProvider;
import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 @WebServlet("/Register")
public class Register extends HttpServlet { 
    
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
         
             int acnum = Integer.parseInt(request.getParameter("acnum"));
             String name = request.getParameter("name");
             String father_name = request.getParameter("father_name");
             String DOB =  request.getParameter("DOB");
             String phone = request.getParameter("phone");
             String email = request.getParameter("email");
             String gender = request.getParameter("gender");
             String address = request.getParameter("address");
             int amount = Integer.parseInt( request.getParameter("amount"));
             int pin = Integer.parseInt(request.getParameter("pin"));  
      RequestDispatcher rd;    
  try{  
     Connection con = ConnectionProvider.getCon();
     String q5 = "insert into users(acnum,name,father_name,DOB,phone,email,gender,address,amount,pin,created_at,updated_at) values(?,?,?,?,?,?,?,?,?,?,now(),now())";            	 
     PreparedStatement prestm = con.prepareStatement(q5);
     prestm.setInt(1,acnum);
     prestm.setString(2,name);
     prestm.setString(3, father_name);
     prestm.setString(4, DOB);
     prestm.setString(5, phone);
     prestm.setString(6, email);
     prestm.setString(7, gender);
     prestm.setString(8, address);
     prestm.setInt(9, amount);
     prestm.setInt(10, pin);
     prestm.executeUpdate();
 

}   catch (SQLException ex) {  
        Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
    }
  
 rd= request.getRequestDispatcher("index.jsp");
 rd.include(request, response);
  out.close();  

}  
  
}
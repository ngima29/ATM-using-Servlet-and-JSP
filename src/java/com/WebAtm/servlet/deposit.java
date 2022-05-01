 
package com.WebAtm.servlet;

import com.WebAtm.connection.ConnectionProvider;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/deposit")
public class deposit extends HttpServlet {
    public int TotalBalance;
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         HttpSession sesson = req.getSession();
       int acnum=(int) sesson.getAttribute("Lacnum");
       resp.setContentType("text/html");  
        PrintWriter out = resp.getWriter();

            try{  
                        Connection con = ConnectionProvider.getCon();
                        String q2 = "select amount from users where acnum=?";
	            	 PreparedStatement prestm = con.prepareStatement(q2);
	            	 prestm.setInt(1, acnum);	            	
	            	 ResultSet rs = prestm.executeQuery();
	            	 if (rs.next()) {    
                             TotalBalance = rs.getInt("amount");
                            }
                         }catch(Exception e1) {
				e1.printStackTrace();
			} 
             
          
             int DepBalanca = Integer.parseInt( req.getParameter("amount"));
       
	    TotalBalance = (int) (TotalBalance + DepBalanca);
             
           RequestDispatcher rd;
try{  
	Connection con = ConnectionProvider.getCon();
       
      String q = "UPDATE  users set amount = ?, updated_at = now() WHERE  acnum = ?";	            	 
	            	 PreparedStatement prestm = con.prepareStatement(q);
	            	 prestm.setInt(1, TotalBalance);
	            	 prestm.setInt(2, acnum);
	            	 prestm.executeUpdate();				      
	            	
//                         resp.sendRedirect("home.jsp");
                         
			}catch(Exception e) {
				e.printStackTrace();
			}

rd= req.getRequestDispatcher("home.jsp");
 rd.include(req, resp);
}  
}
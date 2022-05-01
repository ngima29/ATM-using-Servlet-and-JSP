
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

@WebServlet("/login")
public class login extends HttpServlet {
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
         
             int acnum = Integer.parseInt(request.getParameter("Lacnum"));
             int pin = Integer.parseInt(request.getParameter("Lpin"));  
           RequestDispatcher rd;
try{  
	Connection con = ConnectionProvider.getCon();
      String q = "Select acnum, pin from users where acnum=? and pin=?";
	            	 PreparedStatement prestm = con.prepareStatement(q);
	            	 prestm.setInt(1, acnum);	            	
                         prestm.setInt(2, pin);
	            	 ResultSet rs = prestm.executeQuery();
	            	 if (rs.next()) {
//	                 rd= request.getRequestDispatcher("home.jsp");
//                         rd.include(request, response);
                          HttpSession session = request.getSession(); 
                          session.setAttribute("Lacnum", acnum); 
                          request.getRequestDispatcher("home.jsp").forward(request, response);
//                           ? response.sendRedirect("home.jsp"); 
//                         request.setAttribute("accnum", acnum);
//		         request.getRequestDispatcher("home.jsp").forward(request, response);

	                    } else {
                             out.println("<h4>Invalid account number and pin</h4>");
	                      rd= request.getRequestDispatcher("login.jsp");
                              rd.include(request, response);
	                    }
			}catch(Exception e) {
				e.printStackTrace();
			}
          
        

}  
    
}


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

/**
 *
 * @author ngima
 */
@WebServlet(name = "balance", urlPatterns = {"/balance"})
public class balance extends HttpServlet {
public int TotalBalanceC;
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         HttpSession sesson = req.getSession();
       int acnum=(int) sesson.getAttribute("Lacnum");
       resp.setContentType("text/html");  
        PrintWriter out = resp.getWriter();
        RequestDispatcher rd;
            try{  
                        Connection con = ConnectionProvider.getCon();
                        String q2 = "select amount from users where acnum=?";
	            	 PreparedStatement prestm = con.prepareStatement(q2);
	            	 prestm.setInt(1, acnum);	            	
	            	 ResultSet rs = prestm.executeQuery();
	            	 if (rs.next()) {    
                             TotalBalanceC = rs.getInt("amount");
                           
                         }
                         }catch(Exception e1) {
				e1.printStackTrace();
			} 
  out.println(TotalBalanceC);
req.setAttribute("blc", TotalBalanceC);
rd=req.getRequestDispatcher("balance.jsp");
rd.forward(req, resp);          
         

}  
    
}

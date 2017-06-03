package eg.reqdis;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class EmailValid extends HttpServlet {

 public void doPost(HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException{
	 resp.setContentType("text/html;charset=UTF-8");
	 PrintWriter pw = resp.getWriter();
	 try{
		 String email = req.getParameter("email");
		 String password = req.getParameter("password");
		 
		 if(password.equals("password"))
		 {
			 //RequestDispatcher is an interface and dispatch the request to another resource(servlet,html, jsp)
			 RequestDispatcher rd = req.getRequestDispatcher("/Welcomepage"); //getRequestDispatcher() method returns the object of ther requestdispatcher
			 rd.forward(req, resp);//forward() method is provided by requestDispatcher interface
			 //to forward the req from servlet to another resource
		 }
		 else 
		 {
			 pw.println("<p> <font color = 'red'><b>Invalid password</b></font></p>");
			 RequestDispatcher rd = req.getRequestDispatcher("index.html");
			 rd.include(req, resp); //include() is provided by RequestDispatcher interface to include the content of the resource in the response.
			 
		 }
		 
	 }finally{
		 pw.close();
	 }
 }




}

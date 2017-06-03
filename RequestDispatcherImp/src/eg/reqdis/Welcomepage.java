package eg.reqdis;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Welcomepage extends HttpServlet {

	public void doPost(HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException{
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = resp.getWriter();
		
		try{
			 pw.println("<h2><font color = 'blue'>Welcome to gmail</font></h2>");
			
		}
		finally{
			pw.close();
		}
	}
}

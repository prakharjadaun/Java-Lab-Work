package Exp12.Q1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Serv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Serv1() {
        super();
        System.out.println("Inside the constructor of Serv1");
        // TODO Auto-generated constructor stub
    }
 @Override
 public void init() throws ServletException {
	 // TODO Auto-generated method stub
	 super.init();
 }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		out.print(getServletConfig().getInitParameter("Sanidhya"));
		out.print("<br>Value of the 'Random' : "+getServletContext().getInitParameter("Random"));
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}


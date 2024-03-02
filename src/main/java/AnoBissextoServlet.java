

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AnoBissextoServlet
 */
public class AnoBissextoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AnoBissextoServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer ano = Integer.parseInt(request.getParameter("ano"));
		Boolean bissexto = false;
		
		if((ano % 4) == 0) {
			bissexto = true;
		}
		
		PrintWriter saida = response.getWriter();
		
		saida.print("<html lang=\"pt-br\"><head><meta charset=\"UTF-8\">"
				+ "</head><body><h1><b>" + ano + (bissexto? " é bissexto" : " não é bissexto") + 
				"</b></h1></body></html>");
		
	}

}

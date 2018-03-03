

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProcessarFormulario
 */
@WebServlet("/processar")
public class ProcessarFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessarFormulario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//Recuperar os parametros
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String nascimento = request.getParameter("nascimento");
		int ano = 2018;
		int data = ano-Integer.parseInt(nascimento);
		
		
		//Concatenar as strings
		String nomeCompleto = nome + " " + sobrenome;
		
		//Preparar a resposta ao usuario
		PrintWriter out = response.getWriter();
		out.println("<html><head><title> Resposta </title></head>");
		out.println("<body><h1>Seu nome completo é: " + nomeCompleto);
		out.println("</h1><h2>Sua idade é: " + data + "</h2></body></html>");
		
	}

}

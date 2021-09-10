package com.curso.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.jms.Session;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.curso.entidades.Empleado;

/**
 * Servlet implementation class SaludoServlet
 */
@WebServlet("/saludo")
public class SaludoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaludoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		PrintWriter output ;
//		
//		output = response.getWriter();
		
		
		String user = request.getParameter("paramNombre");
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/saludo.jsp");
		request.setAttribute("nombre", user);
		
		List <Empleado> lista = new ArrayList<Empleado>();
		lista.add(new Empleado(1,"Luis"));
		lista.add(new Empleado(2,"Ana"));
		lista.add(new Empleado(3,"Maria"));
		
		request.setAttribute("listaEmpleados", lista);
		
		//quiero guardarlo en session para usarlo mas tarde
		HttpSession seUsr = request.getSession();
		seUsr.setAttribute("nombre", user);
		seUsr.setAttribute("empleado1", new Empleado(4,"Marta")); //Si la clase no fuese serializable casca
		rd.forward(request, response);
		//response.getWriter().append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

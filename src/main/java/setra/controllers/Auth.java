package setra.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import setra.model.businesslogic.TipoProveedorLogic;
import setra.model.entities.TipoProveedorEntity;

import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class Auth
 */
@WebServlet("/Auth")
public class Auth extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Auth() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		TipoProveedorLogic obj = new TipoProveedorLogic();
		List<TipoProveedorEntity> lista = obj.List();
		request.setAttribute("TestConnection", obj.TestConnection());
		request.setAttribute("listaTipoProveedor", lista);
		request.setAttribute("nombre", request.getParameter("login-email"));
		request.setAttribute("rol", "Administrador");
		
		RequestDispatcher rsd = request.getRequestDispatcher("main.jsp");
		rsd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doTrace(HttpServletRequest, HttpServletResponse)
	 */
	protected void doTrace(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

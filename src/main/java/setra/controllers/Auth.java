package setra.controllers;

import java.io.IOException;
//import java.util.List;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import setra.model.businesslogic.TipoProveedorLogic;
//import setra.model.entities.TipoProveedorEntity;
//import javax.servlet.RequestDispatcher;
import setra.utils.*;

@WebServlet("/Auth")
public class Auth extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Auth() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String usuario = request.getParameter("usuario").toString();
		String contrasenia = request.getParameter("password").toString();

		response.getWriter().print(General.Encriptar(contrasenia));
	}

	protected void doTrace(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
}

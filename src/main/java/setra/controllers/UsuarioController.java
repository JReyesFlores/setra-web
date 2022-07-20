package setra.controllers;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import setra.model.businesslogic.UsuarioLogic;

@WebServlet("/Usuario")
public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsuarioLogic userLogic = null;

	public UsuarioController() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		userLogic = new UsuarioLogic();
	}

	public void destroy() {
		userLogic = null;
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}

package setra.controllers;

import java.io.IOException;
//import java.util.List;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.google.gson.Gson;  
//import setra.utils.General;
//import javax.servlet.RequestDispatcher;
//import setra.utils.General;
import setra.model.businesslogic.UsuarioLogic;
import setra.utils.General;

@WebServlet("/Auth")
public class Auth extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsuarioLogic userLogic = null;

	public Auth() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		userLogic = new UsuarioLogic();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String usuario = request.getParameter("login-email").toString();
		String contrasenia = request.getParameter("login-password").toString();
	
		if (userLogic.IniciarSesion(usuario, General.Encriptar(contrasenia))) {
			response.sendRedirect("main.jsp");
		} else {
			request.setAttribute("message", "Usuario y/o contraseña incorrecta.");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}

		// prueba
		// response.getWriter().print(SesionValida);

		// Retornar para llamadas jquery
		// response.setContentType("application/json;charset=UTF-8");
		// new Gson().toJson(milista, response.getWriter());
	}

	protected void doTrace(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
}

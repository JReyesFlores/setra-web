package setra.controllers;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import setra.model.businesslogic.UsuarioLogic;
import setra.model.response.LoginResponse;
import setra.model.response.UsuarioExisteResponse;
import setra.utils.General;
import setra.utils.General.AuthActions;

@WebServlet("/Auth")
public class SessionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsuarioLogic userLogic = null;

	public SessionController() {
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
		AuthActions accion = AuthActions.valueOf(request.getParameter("accion"));

		switch (accion) {
		case INICIAR_SESION:
			String correo = General.ConvertToString(request.getParameter("login-email"));
			String contrasenia = General.ConvertToString(request.getParameter("login-password"));
			LoginResponse userLogin = userLogic.IniciarSesion(correo, contrasenia);
			if (userLogin != null) {
				HttpSession misesion = request.getSession();
				misesion.setAttribute("user", userLogin);
				response.sendRedirect("main.jsp");
			} else {
				request.setAttribute("message", "Usuario y/o contraseña incorrecta.");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			break;

		case CERRAR_SESION:
			request.setAttribute("message", "CERRAR_SESION.");
			HttpSession misesion = request.getSession();
			misesion.invalidate();
			response.sendRedirect("login.jsp");
			break;

		case CAMBIAR_PASSWORD:
			request.setAttribute("message", "CAMBIAR_PASSWORD.");
			break;

		case REESTABLECER_PASSWORD:
			String rest_correo = General.ConvertToString(request.getParameter("forgot-email"));

			request.setAttribute("typeMessage", "success");
			request.setAttribute("message", "Se ha reestablecido la contraseña.");
			UsuarioExisteResponse user = userLogic.ObtenerUsuarioxCorreo(rest_correo);
			if (user == null) {
				request.setAttribute("typeMessage", "danger");
				request.setAttribute("message", "Correo no localizado en el banco de datos.");
				request.getRequestDispatcher("reestablecer.jsp").forward(request, response);
				break;
			}

			if (!(userLogic.ReestablecerContrasenia(user) != -1)) {
				request.setAttribute("typeMessage", "danger");
				request.setAttribute("message", "Error inesperado al reestablecer la contraseña.");
				request.getRequestDispatcher("reestablecer.jsp").forward(request, response);
				break;
			}
			request.getRequestDispatcher("reestablecer.jsp").forward(request, response);
			break;

		default:
			request.setAttribute("message", "ACCION_NO_LOCALIZADA.");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			break;
		}

	}
}

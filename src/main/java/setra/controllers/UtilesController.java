package setra.controllers;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import setra.model.businesslogic.OpcionesUsuarioLogic;
import setra.model.response.LoginResponse;
import setra.utils.General.UtilesActions;

@WebServlet("/Utiles")
public class UtilesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private OpcionesUsuarioLogic opcUsu = null;

	public UtilesController() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		opcUsu = new OpcionesUsuarioLogic();
	}

	public void destroy() {
		opcUsu = null;
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UtilesActions accion = UtilesActions.valueOf(request.getParameter("accion"));
		HttpSession misesion = request.getSession();
		LoginResponse usuarioLogeado = (LoginResponse) misesion.getAttribute("user");
		
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
		switch (accion) {
		case OBTENER_MENU_NAV:
			
			response.setContentType("application/json;charset=UTF-8");
			gson.toJson(opcUsu.GetOpcionesxUsuarios(usuarioLogeado.getUsuarioId()) , response.getWriter());
			break;

		default:
			break;
		}
	}

}

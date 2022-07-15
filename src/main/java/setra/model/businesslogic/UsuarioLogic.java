package setra.model.businesslogic;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import setra.model.ConnectionbdSETRA;
import setra.utils.General;

public class UsuarioLogic {
	public boolean IniciarSesion(String usuario, String password) {
		boolean resultado = false;
		Connection cn = null;
		CallableStatement cb = null;
		ResultSet rs = null;
		try {
			cn = ConnectionbdSETRA.GetConnection();
			cb = cn.prepareCall("{call sp_login(?,?)}");
			cb.setString(1, usuario);
			cb.setString(2, General.Encriptar(password));
			rs = cb.executeQuery();
			resultado = rs.next();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (cn != null)
					cn.close();
				if (cb != null)
					cb.close();
				if (rs != null)
					rs.close();

			} catch (Exception ex2) {
			}
		}

		return resultado;
	}
}

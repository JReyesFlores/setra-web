package setra.model.businesslogic;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import setra.model.ConnectionbdSETRA;
import setra.model.response.LoginResponse;
import setra.model.response.UsuarioExisteResponse;
import setra.utils.General;

public class UsuarioLogic {

	public LoginResponse IniciarSesion(String usuario, String password) {
		LoginResponse resultado = null;
		Connection cn = null;
		CallableStatement cb = null;
		ResultSet rs = null;
		try {
			String passwordEncriptado = General.Encriptar(password);
			cn = ConnectionbdSETRA.GetConnection();
			cb = cn.prepareCall("{call sp_Login(?,?)}");
			cb.setString(1, usuario);
			cb.setString(2, passwordEncriptado);
			rs = cb.executeQuery();
			while (rs.next()) {
				resultado = new LoginResponse(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4),
						rs.getString(5));
			}
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
				ex2.printStackTrace();
			}
		}
		return resultado;
	}

	public UsuarioExisteResponse ObtenerUsuarioxCorreo(String correoElectronico) {
		Connection cn = null;
		CallableStatement cb = null;
		ResultSet rs = null;
		UsuarioExisteResponse resultado = null;
		try {
			cn = ConnectionbdSETRA.GetConnection();
			cb = cn.prepareCall("{call sp_GetUsuarioxCorreo(?)}");
			cb.setString(1, correoElectronico);
			rs = cb.executeQuery();
			while (rs.next()) {
				resultado = new UsuarioExisteResponse(rs.getInt(1), rs.getString(2));
			}
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
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return resultado;
	}

	public int ReestablecerContrasenia(UsuarioExisteResponse user) {
		Connection cn = null;
		CallableStatement cb = null;
		int resultado = -1;
		try {
			cn = ConnectionbdSETRA.GetConnection();
			cb = cn.prepareCall("{call sp_ReestableerContrasenia(?,?)}");
			cb.setInt(1, user.getUsuarioId());
			cb.setString(2, General.Encriptar(user.getNumeroDocIdentidad()));
			resultado = cb.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (cn != null)
					cn.close();
				if (cb != null)
					cb.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return resultado;
	}
}

package setra.model.businesslogic;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;

import setra.model.ConnectionbdSETRA;
import setra.model.entities.TipoProveedorEntity;
import setra.utils.General;

public class TipoProveedorLogic {

	public List<TipoProveedorEntity> List() {
		List<TipoProveedorEntity> resultado = new ArrayList<TipoProveedorEntity>();
		Connection cn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			cn = ConnectionbdSETRA.GetConnection();
			st = cn.prepareStatement("select * from tipo_proveedor");
			rs = st.executeQuery();
			while (rs.next()) {
				TipoProveedorEntity obj = new TipoProveedorEntity(rs.getInt(1), rs.getString(2), rs.getBoolean(4));
				resultado.add(obj);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (cn != null)
					cn.close();
				if (st != null)
					st.close();
				if (rs != null)
					rs.close();

			} catch (Exception ex2) {
			}
		}

		return resultado;
	}

	public boolean Login(String usuario, String password) {
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

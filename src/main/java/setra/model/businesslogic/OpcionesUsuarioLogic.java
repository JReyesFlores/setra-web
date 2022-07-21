package setra.model.businesslogic;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import setra.model.ConnectionbdSETRA;
import setra.model.response.OpcionesUsuarioResponse;

public class OpcionesUsuarioLogic {

	public List<OpcionesUsuarioResponse> GetOpcionesxUsuarios(int usuarioId) {
		List<OpcionesUsuarioResponse> resultado = null;
		Connection cn = null;
		CallableStatement cb = null;
		ResultSet rs = null;
		try {
			cn = ConnectionbdSETRA.GetConnection();
			cb = cn.prepareCall("{call sp_GetOpcionesxUsuarioId(?)}");
			cb.setInt(1, usuarioId);
			rs = cb.executeQuery();
			resultado = new ArrayList<OpcionesUsuarioResponse>();
			while (rs.next()) {
				resultado.add(new OpcionesUsuarioResponse(rs.getInt(1), rs.getString(2), rs.getShort(3), rs.getInt(4),
						rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getString(9),
						rs.getBoolean(10), rs.getBoolean(11), rs.getBoolean(12), rs.getBoolean(13)));
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
}

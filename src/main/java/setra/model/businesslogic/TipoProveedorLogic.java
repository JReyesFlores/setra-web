package setra.model.businesslogic;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;

import setra.model.ConnectionbdSETRA;
import setra.model.entities.TipoProveedorEntity;

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
		}

		return resultado;
	}
}

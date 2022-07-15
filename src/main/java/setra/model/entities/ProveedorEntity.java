package setra.model.entities;

public class ProveedorEntity extends EmpresaEntity {
	private int ProveedorId;
	private int TipoProveedorId;
	private int CiudadId;

	public ProveedorEntity(int proveedorId, int tipoProveedorId, String razonComercial, String razonSocial,
			int ciudadId, String direccion, int tipoDocIdentidadId, boolean estadoRegistro) {
		super(razonComercial, razonSocial, direccion, tipoDocIdentidadId, estadoRegistro);
		this.ProveedorId = proveedorId;
		this.TipoProveedorId = tipoProveedorId;
		this.CiudadId = ciudadId;
	}

	public ProveedorEntity(int proveedorId, int tipoProveedorId, String razonComercial, String razonSocial,
			int ciudadId, int tipoDocIdentidadId) {
		this(proveedorId, tipoProveedorId, razonComercial, razonSocial, ciudadId, null, tipoDocIdentidadId, true);
	}

	public int getTipoProveedorId() {
		return TipoProveedorId;
	}

	public void setTipoProveedorId(int tipoProveedorId) {
		TipoProveedorId = tipoProveedorId;
	}

	public int getCiudadId() {
		return CiudadId;
	}

	public void setCiudadId(int ciudadId) {
		CiudadId = ciudadId;
	}

	public int getProveedorId() {
		return ProveedorId;
	}

}

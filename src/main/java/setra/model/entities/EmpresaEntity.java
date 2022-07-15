package setra.model.entities;

public class EmpresaEntity {
	private String RazonComercial;
	private String RazonSocial;
	private String Direccion;
	private int TipoDocIdentidadId;
	private boolean EstadoRegistro;

	public EmpresaEntity(String razonComercial, String razonSocial, String direccion, int tipoDocIdentidadId,
			boolean estadoRegistro) {
		this.RazonComercial = razonComercial;
		this.RazonSocial = razonSocial;
		this.Direccion = direccion;
		this.TipoDocIdentidadId = tipoDocIdentidadId;
		this.EstadoRegistro = estadoRegistro;
	}

	public String getRazonComercial() {
		return RazonComercial;
	}

	public void setRazonComercial(String razonComercial) {
		RazonComercial = razonComercial;
	}

	public String getRazonSocial() {
		return RazonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		RazonSocial = razonSocial;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public int getTipoDocIdentidadId() {
		return TipoDocIdentidadId;
	}

	public void setTipoDocIdentidadId(int tipoDocIdentidadId) {
		TipoDocIdentidadId = tipoDocIdentidadId;
	}

	public boolean isEstadoRegistro() {
		return EstadoRegistro;
	}

	public void setEstadoRegistro(boolean estadoRegistro) {
		EstadoRegistro = estadoRegistro;
	}

}

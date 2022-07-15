package setra.model.entities;

public class CiudadEntity {
	private int CiudadId;
	private int PaisId;
	private String Nombre;
	private String Descripcion;
	private boolean EstadoRegistro;

	public CiudadEntity(int ciudadId, int paisId, String nombre, String descripcion, boolean estadoRegistro) {
		this.CiudadId = ciudadId;
		this.PaisId = paisId;
		this.Nombre = nombre;
		this.Descripcion = descripcion;
		this.EstadoRegistro = estadoRegistro;
	}

	public CiudadEntity(int ciudadId, int paisId, String nombre) {
		this(ciudadId, paisId, nombre, null, true);
	}

	public int getCiudadId() {
		return CiudadId;
	}

	public void setCiudadId(int ciudadId) {
		CiudadId = ciudadId;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public boolean isEstadoRegistro() {
		return EstadoRegistro;
	}

	public void setEstadoRegistro(boolean estadoRegistro) {
		EstadoRegistro = estadoRegistro;
	}

	public int getPaisId() {
		return PaisId;
	}

}

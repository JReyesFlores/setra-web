package setra.model.entities;

public class PaisEntity {
	private int PaisId;
	private String Nombre;
	private String CodigoIATA;
	private String Descripcion;
	private String IconoBandera;
	private boolean EstadoRegistro;

	public PaisEntity(int paisId, String nombre, String codigoIATA, String descripcion, String iconoBandera,
			boolean estadoRegistro) {
		this.PaisId = paisId;
		this.Nombre = nombre;
		this.CodigoIATA = codigoIATA;
		this.Descripcion = descripcion;
		this.IconoBandera = iconoBandera;
		this.EstadoRegistro = estadoRegistro;
	}

	public PaisEntity(int paisId, String nombre, String codigoIATA) {
		this(paisId, nombre, codigoIATA, null, null, true);
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCodigoIATA() {
		return CodigoIATA;
	}

	public void setCodigoIATA(String codigoIATA) {
		CodigoIATA = codigoIATA;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getIconoBandera() {
		return IconoBandera;
	}

	public void setIconoBandera(String iconoBandera) {
		IconoBandera = iconoBandera;
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

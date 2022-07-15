package setra.model.entities;

public class BaseEntity {
	private String Nombre;
	private String Sigla;
	private boolean EstadoRegistro = true;

	public BaseEntity(String nombre, String sigla) {
		this(nombre, sigla, true);
	}

	public BaseEntity(String nombre, String sigla, boolean estadoRegistro) {
		this.Nombre = nombre;
		this.Sigla = sigla;
		this.EstadoRegistro = estadoRegistro;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getSigla() {
		return Sigla;
	}

	public void setSigla(String sigla) {
		Sigla = sigla;
	}

	public boolean isEstadoRegistro() {
		return EstadoRegistro;
	}

	public void setEstadoRegistro(boolean estadoRegistro) {
		EstadoRegistro = estadoRegistro;
	}
}

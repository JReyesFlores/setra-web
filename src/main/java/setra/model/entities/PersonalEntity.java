package setra.model.entities;

public class PersonalEntity {
	private String Nombre;
	private String Apellidos;
	private int CiudadId;
	private String Direccion;
	private char Genero;
	private int TipoDocIdentidadId;
	private String NumeroDocIdentidad;
	private int RolId;
	private boolean EstadoRegistro;

	public PersonalEntity(String nombre, String apellidos, int ciudadId, String direccion, char genero,
			int tipoDocIdentidadId, String numeroDocIdentidad, int rolId, boolean estadoRegistro) {
		Nombre = nombre;
		Apellidos = apellidos;
		CiudadId = ciudadId;
		Direccion = direccion;
		Genero = genero;
		TipoDocIdentidadId = tipoDocIdentidadId;
		NumeroDocIdentidad = numeroDocIdentidad;
		RolId = rolId;
		EstadoRegistro = estadoRegistro;
	}

	public PersonalEntity(String nombre, String apellidos, int ciudadId, String direccion, char genero,
			int tipoDocIdentidadId, String numeroDocIdentidad, int rolId) {
		this(nombre, apellidos, ciudadId, direccion, genero, tipoDocIdentidadId, numeroDocIdentidad, rolId, true);
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public int getCiudadId() {
		return CiudadId;
	}

	public void setCiudadId(int ciudadId) {
		CiudadId = ciudadId;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public char getGenero() {
		return Genero;
	}

	public void setGenero(char genero) {
		Genero = genero;
	}

	public int getTipoDocIdentidadId() {
		return TipoDocIdentidadId;
	}

	public void setTipoDocIdentidadId(int tipoDocIdentidadId) {
		TipoDocIdentidadId = tipoDocIdentidadId;
	}

	public String getNumeroDocIdentidad() {
		return NumeroDocIdentidad;
	}

	public void setNumeroDocIdentidad(String numeroDocIdentidad) {
		NumeroDocIdentidad = numeroDocIdentidad;
	}

	public int getRolId() {
		return RolId;
	}

	public void setRolId(int rolId) {
		RolId = rolId;
	}

	public boolean isEstadoRegistro() {
		return EstadoRegistro;
	}

	public void setEstadoRegistro(boolean estadoRegistro) {
		EstadoRegistro = estadoRegistro;
	}
}

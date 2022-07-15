package setra.model.entities;

public class UsuarioEntity extends PersonalEntity {
	private int UsuarioId;
	private String CorreoElectronico;
	private String Contrasenia;

	public UsuarioEntity(int usuarioId, String nombre, String apellidos, int ciudadId, String direccion, char genero,
			int tipoDocIdentidadId, String numeroDocIdentidad, String correoElectronico, String contrasenia, int rolId,
			boolean estadoRegistro) {
		super(nombre, apellidos, ciudadId, direccion, genero, tipoDocIdentidadId, numeroDocIdentidad, rolId,
				estadoRegistro);
		this.UsuarioId = usuarioId;
		this.CorreoElectronico = correoElectronico;
		this.Contrasenia = contrasenia;
	}

	public UsuarioEntity(int usuarioId, String nombre, String apellidos, int ciudadId, String direccion, char genero,
			int tipoDocIdentidadId, String numeroDocIdentidad, String correoElectronico, String contrasenia,
			int rolId) {
		this(usuarioId, nombre, apellidos, ciudadId, direccion, genero, tipoDocIdentidadId, numeroDocIdentidad,
				correoElectronico, contrasenia, rolId, true);
	}

	public String getCorreoElectronico() {
		return CorreoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		CorreoElectronico = correoElectronico;
	}

	public String getContrasenia() {
		return Contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		Contrasenia = contrasenia;
	}

	public int getUsuarioId() {
		return UsuarioId;
	}
}

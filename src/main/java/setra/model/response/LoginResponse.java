package setra.model.response;

public class LoginResponse {
	private int UsuarioId;
	private String NombreCompleto;
	private int RolId;
	private String Rol;
	private String MensajeLogin;

	public LoginResponse(int usuarioId, String nombreCompleto, int rolId, String rol, String mensajeLogin) {
		this.UsuarioId = usuarioId;
		this.NombreCompleto = nombreCompleto;
		this.RolId = rolId;
		this.Rol = rol;
		this.MensajeLogin = mensajeLogin;
	}

	public String getNombreCompleto() {
		return NombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		NombreCompleto = nombreCompleto;
	}

	public int getRolId() {
		return RolId;
	}

	public void setRolId(int rolId) {
		RolId = rolId;
	}

	public String getRol() {
		return Rol;
	}

	public void setRol(String rol) {
		Rol = rol;
	}

	public String getMensajeLogin() {
		return MensajeLogin;
	}

	public void setMensajeLogin(String mensajeLogin) {
		MensajeLogin = mensajeLogin;
	}

	public int getUsuarioId() {
		return UsuarioId;
	}
}

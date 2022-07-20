package setra.model.response;

public class UsuarioExisteResponse {
	private int UsuarioId;
	private String NumeroDocIdentidad;

	public UsuarioExisteResponse(int usuarioId, String numeroDocIdentidad) {
		this.UsuarioId = usuarioId;
		this.NumeroDocIdentidad = numeroDocIdentidad;
	}

	public String getNumeroDocIdentidad() {
		return NumeroDocIdentidad;
	}

	public void setNumeroDocIdentidad(String numeroDocIdentidad) {
		NumeroDocIdentidad = numeroDocIdentidad;
	}

	public int getUsuarioId() {
		return UsuarioId;
	}
}

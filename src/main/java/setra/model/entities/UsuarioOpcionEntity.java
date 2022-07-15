package setra.model.entities;

public class UsuarioOpcionEntity {
	private int OpcionId;
	private int UsuarioId;
	private boolean NuevoRegistro;
	private boolean EditarRegistro;
	private boolean EliminarRegistro;
	private boolean Imprimir;

	public UsuarioOpcionEntity(int opcionId, int usuarioId, boolean nuevoRegistro, boolean editarRegistro,
			boolean eliminarRegistro, boolean imprimir) {
		this.OpcionId = opcionId;
		this.UsuarioId = usuarioId;
		this.NuevoRegistro = nuevoRegistro;
		this.EditarRegistro = editarRegistro;
		this.EliminarRegistro = eliminarRegistro;
		this.Imprimir = imprimir;
	}

	public boolean isNuevoRegistro() {
		return NuevoRegistro;
	}

	public void setNuevoRegistro(boolean nuevoRegistro) {
		NuevoRegistro = nuevoRegistro;
	}

	public boolean isEditarRegistro() {
		return EditarRegistro;
	}

	public void setEditarRegistro(boolean editarRegistro) {
		EditarRegistro = editarRegistro;
	}

	public boolean isEliminarRegistro() {
		return EliminarRegistro;
	}

	public void setEliminarRegistro(boolean eliminarRegistro) {
		EliminarRegistro = eliminarRegistro;
	}

	public boolean isImprimir() {
		return Imprimir;
	}

	public void setImprimir(boolean imprimir) {
		Imprimir = imprimir;
	}

	public int getOpcionId() {
		return OpcionId;
	}

	public int getUsuarioId() {
		return UsuarioId;
	}

}

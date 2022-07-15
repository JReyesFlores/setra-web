package setra.model.entities;

public class TipoProveedorEntity extends BaseEntity {
	private int TipoProveedorId;

	public TipoProveedorEntity(int tipoProveedorId, String nombre, String sigla, boolean estadoRegistro) {
		super(nombre, sigla, estadoRegistro);
		this.TipoProveedorId = tipoProveedorId;
	}

	public int getTipoProveedorId() {
		return TipoProveedorId;
	}
}

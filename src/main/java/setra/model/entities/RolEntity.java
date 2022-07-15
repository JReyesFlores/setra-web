package setra.model.entities;

public class RolEntity extends BaseEntity {
	private int RolId;

	public RolEntity(int rolId, String nombre, String sigla, boolean estadoRegistro) {
		super(nombre, sigla, estadoRegistro); 
		this.RolId = rolId;
	}

	public int getRolId() {
		return RolId;
	}
}

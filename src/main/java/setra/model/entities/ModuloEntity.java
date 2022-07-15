package setra.model.entities;

public class ModuloEntity extends BaseEntity {
	private int ModuloId;
	
	public ModuloEntity(int moduloId, String nombre, String sigla, boolean estadoRegistro) {
		super(nombre, sigla, estadoRegistro);
		this.ModuloId = moduloId;
	}

	public int getModuloId() {
		return ModuloId;
	}

	public void setModuloId(int moduloId) {
		ModuloId = moduloId;
	}

}

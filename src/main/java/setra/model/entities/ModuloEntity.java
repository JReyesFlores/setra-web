package setra.model.entities;

public class ModuloEntity extends BaseEntity {
	private int ModuloId;
	private short Orden;

	public ModuloEntity(int moduloId, String nombre, String sigla, short orden, boolean estadoRegistro) {
		super(nombre, sigla, estadoRegistro);
		this.ModuloId = moduloId;
		this.Orden = orden;
	}

	public ModuloEntity(int moduloId, String nombre, String sigla, short orden) {
		this(moduloId, nombre, sigla, orden, true);
	}

	public int getModuloId() {
		return ModuloId;
	}

	public void setModuloId(int moduloId) {
		ModuloId = moduloId;
	}

	public short getOrden() {
		return Orden;
	}

	public void setOrden(short orden) {
		Orden = orden;
	}
}

package setra.model.entities;

public class MonedaEntity extends BaseEntity {
	private int MonedaId;

	public MonedaEntity(int monedaId, String nombre, String sigla, boolean estadoRegistro) {
		super(nombre, sigla, estadoRegistro);
		this.MonedaId = monedaId;
	}

	public int getMonedaId() {
		return MonedaId;
	}
}

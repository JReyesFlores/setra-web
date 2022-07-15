package setra.model.entities;

public class TipoServicioEntity extends BaseEntity {

	private int TipoServicioId;

	public TipoServicioEntity(int tipoServicioId,String nombre, String sigla, boolean estadoRegistro) {
		super(nombre, sigla, estadoRegistro);
		this.TipoServicioId = tipoServicioId;
	}

	public int getTipoServicioId() {
		return TipoServicioId;
	}
}

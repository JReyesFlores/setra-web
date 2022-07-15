package setra.model.entities;

public class TipoPoliticaEntity extends BaseEntity {
	private int TipoPoliticaId;

	public TipoPoliticaEntity(int tipoPoliticaId, String nombre, String sigla, boolean estadoRegistro) {
		super(nombre, sigla, estadoRegistro);
		this.TipoPoliticaId = tipoPoliticaId;
	}

	public int getTipoPoliticaId() {
		return TipoPoliticaId;
	}
}

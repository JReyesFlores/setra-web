package setra.model.entities;

public class TipoTicketEntity extends BaseEntity {
	private int TipoTicketId;

	public TipoTicketEntity(int tipoTicketId, String nombre, String sigla, boolean estadoRegistro) {
		super(nombre, sigla, estadoRegistro);
		this.TipoTicketId = tipoTicketId;
	}

	public int getTipoTicketId() {
		return TipoTicketId;
	}
}

package setra.model.entities;

public class IdiomaEntity extends BaseEntity {
	private int IdiomaId;
	private String CultureInfo;

	public IdiomaEntity(int idiomaId, String nombre, String sigla, String cultureInfo, boolean estadoRegistro) {
		super(nombre, sigla, estadoRegistro);
		this.IdiomaId = idiomaId;
		this.CultureInfo = cultureInfo;
	}

	public IdiomaEntity(int idiomaId, String nombre, String sigla, String cultureInfo) {
		this(idiomaId, nombre, sigla, cultureInfo, true);
	}

	public String getCultureInfo() {
		return CultureInfo;
	}

	public void setCultureInfo(String cultureInfo) {
		CultureInfo = cultureInfo;
	}

	public int getIdiomaId() {
		return IdiomaId;
	}

}

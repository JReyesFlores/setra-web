package setra.model.entities;

public class TipoDocumentoIdentidadEntity extends BaseEntity {
	private int TipoDocIdentidadId;
	private String CodigoSunat;

	public TipoDocumentoIdentidadEntity(int tipoDocIdentidadId, String nombre, String sigla, String codigoSunat,
			boolean estadoRegistro) {
		super(nombre, sigla, estadoRegistro);
		this.TipoDocIdentidadId = tipoDocIdentidadId;
		this.CodigoSunat = codigoSunat;
	}

	public int getTipoDocIdentidadId() {
		return TipoDocIdentidadId;
	}

	public String getCodigoSunat() {
		return CodigoSunat;
	}

	public void setCodigoSunat(String codigoSunat) {
		CodigoSunat = codigoSunat;
	}

}

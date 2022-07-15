package setra.model.entities;

public class ClienteEntity extends EmpresaEntity {
	private int ClienteId;
	private String Sigla;
	private int PaisId;
	private String CodigoMercado;
	private String Observacion;

	public ClienteEntity(int clienteId, String razonComercial, String razonSocial, String sigla, String direccion,
			int tipoDocIdentidadId, int paisId, String codigoMercado, String observacion, boolean estadoRegistro) {
		super(razonComercial, razonSocial, direccion, tipoDocIdentidadId, estadoRegistro);
		this.ClienteId = clienteId;
		this.Sigla = sigla;
		this.PaisId = paisId;
		this.CodigoMercado = codigoMercado;
		this.Observacion = observacion;
	}

	public ClienteEntity(int clienteId, String razonComercial, String razonSocial, String sigla, String direccion,
			int tipoDocIdentidadId, int paisId, String codigoMercado) {
		this(clienteId, razonComercial, razonSocial, sigla, direccion, tipoDocIdentidadId, paisId, codigoMercado, null,
				true);
	}

	public String getSigla() {
		return Sigla;
	}

	public void setSigla(String sigla) {
		Sigla = sigla;
	}

	public int getPaisId() {
		return PaisId;
	}

	public void setPaisId(int paisId) {
		PaisId = paisId;
	}

	public String getCodigoMercado() {
		return CodigoMercado;
	}

	public void setCodigoMercado(String codigoMercado) {
		CodigoMercado = codigoMercado;
	}

	public String getObservacion() {
		return Observacion;
	}

	public void setObservacion(String observacion) {
		Observacion = observacion;
	}

	public int getClienteId() {
		return ClienteId;
	}
}

package setra.model.entities;

public class PoliticaProveedorEntity {
	private int PoliticaProveedorId;
	private int ProveedorId;
	private short RangoMinimo;
	private short RangoMaximo;
	private int TipoPoliticaIdRango;
	private short CantidadDescontada;
	private int TipoPoliticaIdDescontada;
	private boolean EstadoRegistro;

	public PoliticaProveedorEntity(int politicaProveedorId, int proveedorId, short rangoMinimo, short rangoMaximo,
			int tipoPoliticaIdRango, short cantidadDescontada, int tipoPoliticaIdDescontada, boolean estadoRegistro) {
		this.PoliticaProveedorId = politicaProveedorId;
		this.ProveedorId = proveedorId;
		this.RangoMinimo = rangoMinimo;
		this.RangoMaximo = rangoMaximo;
		this.TipoPoliticaIdRango = tipoPoliticaIdRango;
		this.CantidadDescontada = cantidadDescontada;
		this.TipoPoliticaIdDescontada = tipoPoliticaIdDescontada;
		this.EstadoRegistro = estadoRegistro;
	}

	public PoliticaProveedorEntity(int politicaProveedorId, int proveedorId, short rangoMinimo, short rangoMaximo,
			int tipoPoliticaIdRango, short cantidadDescontada, int tipoPoliticaIdDescontada) {
		this(politicaProveedorId, proveedorId, rangoMinimo, rangoMaximo, tipoPoliticaIdRango, cantidadDescontada,
				tipoPoliticaIdDescontada, true);
	}

	public int getProveedorId() {
		return ProveedorId;
	}

	public void setProveedorId(int proveedorId) {
		ProveedorId = proveedorId;
	}

	public short getRangoMinimo() {
		return RangoMinimo;
	}

	public void setRangoMinimo(short rangoMinimo) {
		RangoMinimo = rangoMinimo;
	}

	public short getRangoMaximo() {
		return RangoMaximo;
	}

	public void setRangoMaximo(short rangoMaximo) {
		RangoMaximo = rangoMaximo;
	}

	public int getTipoPoliticaIdRango() {
		return TipoPoliticaIdRango;
	}

	public void setTipoPoliticaIdRango(int tipoPoliticaIdRango) {
		TipoPoliticaIdRango = tipoPoliticaIdRango;
	}

	public short getCantidadDescontada() {
		return CantidadDescontada;
	}

	public void setCantidadDescontada(short cantidadDescontada) {
		CantidadDescontada = cantidadDescontada;
	}

	public int getTipoPoliticaIdDescontada() {
		return TipoPoliticaIdDescontada;
	}

	public void setTipoPoliticaIdDescontada(int tipoPoliticaIdDescontada) {
		TipoPoliticaIdDescontada = tipoPoliticaIdDescontada;
	}

	public boolean isEstadoRegistro() {
		return EstadoRegistro;
	}

	public void setEstadoRegistro(boolean estadoRegistro) {
		EstadoRegistro = estadoRegistro;
	}

	public int getPoliticaProveedorId() {
		return PoliticaProveedorId;
	}
}

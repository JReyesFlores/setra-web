package setra.model.entities;

public class RangoCostoEntity {
	private int RangoCostoId;
	private int TarifaServicioId;
	private short CantMinima;
	private short CantMaxima;
	private double Costo;

	public RangoCostoEntity(int rangoCostoId, int tarifaServicioId, short cantMinima, short cantMaxima, double costo) {
		this.RangoCostoId = rangoCostoId;
		this.TarifaServicioId = tarifaServicioId;
		this.CantMinima = cantMinima;
		this.CantMaxima = cantMaxima;
		this.Costo = costo;
	}

	public int getTarifaServicioId() {
		return TarifaServicioId;
	}

	public void setTarifaServicioId(int tarifaServicioId) {
		TarifaServicioId = tarifaServicioId;
	}

	public short getCantMinima() {
		return CantMinima;
	}

	public void setCantMinima(short cantMinima) {
		CantMinima = cantMinima;
	}

	public short getCantMaxima() {
		return CantMaxima;
	}

	public void setCantMaxima(short cantMaxima) {
		CantMaxima = cantMaxima;
	}

	public double getCosto() {
		return Costo;
	}

	public void setCosto(double costo) {
		Costo = costo;
	}

	public int getRangoCostoId() {
		return RangoCostoId;
	}

}

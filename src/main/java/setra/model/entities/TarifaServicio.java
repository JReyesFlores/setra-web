package setra.model.entities;

import java.util.Date;

public class TarifaServicio {
	private int TarifaServicioId;
	private int ServicioId;
	private int MonedaId;
	private Date VigenciaDesde;
	private Date VigenciaHasta;
	private String Nombre;
	private double CostoSimple;
	private double CostoDoble;
	private double CostoTriple;
	private boolean EstadoRegistro;

	public TarifaServicio(int tarifaServicioId, int servicioId, int monedaId, Date vigenciaDesde, Date vigenciaHasta,
			String nombre, double costoSimple, double costoDoble, double costoTriple, boolean estadoRegistro) {
		this.TarifaServicioId = tarifaServicioId;
		this.ServicioId = servicioId;
		this.MonedaId = monedaId;
		this.VigenciaDesde = vigenciaDesde;
		this.VigenciaHasta = vigenciaHasta;
		this.Nombre = nombre;
		this.CostoSimple = costoSimple;
		this.CostoDoble = costoDoble;
		this.CostoTriple = costoTriple;
		this.EstadoRegistro = estadoRegistro;
	}

	public TarifaServicio(int tarifaServicioId, int servicioId, int monedaId, Date vigenciaDesde, Date vigenciaHasta,
			String nombre, double costoSimple, double costoDoble, double costoTriple) {
		this(tarifaServicioId, servicioId, monedaId, vigenciaDesde, vigenciaHasta, nombre, costoSimple, costoDoble,
				costoTriple, true);
	}

	public int getServicioId() {
		return ServicioId;
	}

	public void setServicioId(int servicioId) {
		ServicioId = servicioId;
	}

	public int getMonedaId() {
		return MonedaId;
	}

	public void setMonedaId(int monedaId) {
		MonedaId = monedaId;
	}

	public Date getVigenciaDesde() {
		return VigenciaDesde;
	}

	public void setVigenciaDesde(Date vigenciaDesde) {
		VigenciaDesde = vigenciaDesde;
	}

	public Date getVigenciaHasta() {
		return VigenciaHasta;
	}

	public void setVigenciaHasta(Date vigenciaHasta) {
		VigenciaHasta = vigenciaHasta;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public double getCostoSimple() {
		return CostoSimple;
	}

	public void setCostoSimple(double costoSimple) {
		CostoSimple = costoSimple;
	}

	public double getCostoDoble() {
		return CostoDoble;
	}

	public void setCostoDoble(double costoDoble) {
		CostoDoble = costoDoble;
	}

	public double getCostoTriple() {
		return CostoTriple;
	}

	public void setCostoTriple(double costoTriple) {
		CostoTriple = costoTriple;
	}

	public boolean isEstadoRegistro() {
		return EstadoRegistro;
	}

	public void setEstadoRegistro(boolean estadoRegistro) {
		EstadoRegistro = estadoRegistro;
	}

	public int getTarifaServicioId() {
		return TarifaServicioId;
	}
}

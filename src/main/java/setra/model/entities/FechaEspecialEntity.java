package setra.model.entities;

import java.util.Date;

public class FechaEspecialEntity {
	private int FechaEspecialId;
	private Date Fecha;
	private String DescripcionCorta;
	private String DescripcionCompleta;
	private int PaisId;
	private int ProveedorId;
	private boolean Anual;
	private boolean EstadoRegistro;

	public FechaEspecialEntity(int fechaEspecialId, Date fecha, String descripcionCorta, String descripcionCompleta,
			int paisId, int proveedorId, boolean anual, boolean estadoRegistro) {
		this.FechaEspecialId = fechaEspecialId;
		this.Fecha = fecha;
		this.DescripcionCorta = descripcionCorta;
		this.DescripcionCompleta = descripcionCompleta;
		this.PaisId = paisId;
		this.ProveedorId = proveedorId;
		this.Anual = anual;
		this.EstadoRegistro = estadoRegistro;
	}

	public FechaEspecialEntity(int fechaEspecialId, Date fecha, String descripcionCorta, boolean anual) {
		this(fechaEspecialId, fecha, descripcionCorta, null, 0, 0, anual, true);
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public String getDescripcionCorta() {
		return DescripcionCorta;
	}

	public void setDescripcionCorta(String descripcionCorta) {
		DescripcionCorta = descripcionCorta;
	}

	public String getDescripcionCompleta() {
		return DescripcionCompleta;
	}

	public void setDescripcionCompleta(String descripcionCompleta) {
		DescripcionCompleta = descripcionCompleta;
	}

	public int getPaisId() {
		return PaisId;
	}

	public void setPaisId(int paisId) {
		PaisId = paisId;
	}

	public int getProveedorId() {
		return ProveedorId;
	}

	public void setProveedorId(int proveedorId) {
		ProveedorId = proveedorId;
	}

	public boolean isAnual() {
		return Anual;
	}

	public void setAnual(boolean anual) {
		Anual = anual;
	}

	public boolean isEstadoRegistro() {
		return EstadoRegistro;
	}

	public void setEstadoRegistro(boolean estadoRegistro) {
		EstadoRegistro = estadoRegistro;
	}

	public int getFechaEspecialId() {
		return FechaEspecialId;
	}

}

package setra.model.entities;

import java.util.Date;

public class ServicioEntity {
	private int ServicioId;
	private int ProveedorId;
	private String CodServicio;
	private String Nombre;
	private int CiudadId;
	private short NroDias;
	private short PorcentajeMargen;
	private Date FechaRegistro;
	private boolean EstadoRegistro;

	public ServicioEntity(int servicioId, int proveedorId, String codServicio, String nombre, int ciudadId,
			short nroDias, short porcentajeMargen, Date fechaRegistro, boolean estadoRegistro) {
		this.ServicioId = servicioId;
		this.ProveedorId = proveedorId;
		this.CodServicio = codServicio;
		this.Nombre = nombre;
		this.CiudadId = ciudadId;
		this.NroDias = nroDias;
		this.PorcentajeMargen = porcentajeMargen;
		this.FechaRegistro = fechaRegistro;
		this.EstadoRegistro = estadoRegistro;
	}

	public ServicioEntity(int servicioId, int proveedorId, String codServicio, String nombre, int ciudadId,
			short nroDias, short porcentajeMargen, Date fechaRegistro) {
		this(servicioId, proveedorId, codServicio, nombre, ciudadId, nroDias, porcentajeMargen, fechaRegistro, true);
	}

	public int getProveedorId() {
		return ProveedorId;
	}

	public void setProveedorId(int proveedorId) {
		ProveedorId = proveedorId;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getCiudadId() {
		return CiudadId;
	}

	public void setCiudadId(int ciudadId) {
		CiudadId = ciudadId;
	}

	public short getNroDias() {
		return NroDias;
	}

	public void setNroDias(short nroDias) {
		NroDias = nroDias;
	}

	public short getPorcentajeMargen() {
		return PorcentajeMargen;
	}

	public void setPorcentajeMargen(short porcentajeMargen) {
		PorcentajeMargen = porcentajeMargen;
	}

	public Date getFechaRegistro() {
		return FechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		FechaRegistro = fechaRegistro;
	}

	public boolean isEstadoRegistro() {
		return EstadoRegistro;
	}

	public void setEstadoRegistro(boolean estadoRegistro) {
		EstadoRegistro = estadoRegistro;
	}

	public int getServicioId() {
		return ServicioId;
	}

	public String getCodServicio() {
		return CodServicio;
	}

}

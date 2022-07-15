package setra.model.entities;

import java.util.Date;
//import java.util.Optional;
//import java.time.LocalDateTime;

public class TicketEntity {
	private int TicketId;
	private int TipoTicketId;
	private Date Fecha;
	private int UsuarioIdCreador;
	private int UsuarioIdResponsable;
	private char EstadoTicket;
	private String NumeroCotizacion;
	private String NumeroFile;
	private String Observacion;
	private boolean EstadoRegistro;

	public TicketEntity(int ticketId, int tipoTicketId, Date fecha, int usuarioIdCreador, int usuarioIdResponsable,
			char estadoTicket, String numeroCotizacion, String numeroFile, String observacion, boolean estadoRegistro) {
		this.TicketId = ticketId;
		this.TipoTicketId = tipoTicketId;
		this.Fecha = fecha;
		this.UsuarioIdCreador = usuarioIdCreador;
		this.UsuarioIdResponsable = usuarioIdResponsable;
		this.EstadoTicket = estadoTicket;
		this.NumeroCotizacion = numeroCotizacion;
		this.NumeroFile = numeroFile;
		this.Observacion = observacion;
		this.EstadoRegistro = estadoRegistro;
	}

	public TicketEntity(int ticketId, int tipoTicketId, Date fecha, int usuarioIdCreador, char estadoTicket,
			String numeroCotizacion, String numeroFile, String observacion) {
		this(ticketId, tipoTicketId, fecha, usuarioIdCreador, 0, estadoTicket, numeroCotizacion, numeroFile,
				observacion, true);
	}

	public int getTipoTicketId() {
		return TipoTicketId;
	}

	public void setTipoTicketId(int tipoTicketId) {
		TipoTicketId = tipoTicketId;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public int getUsuarioIdCreador() {
		return UsuarioIdCreador;
	}

	public void setUsuarioIdCreador(int usuarioIdCreador) {
		UsuarioIdCreador = usuarioIdCreador;
	}

	public int getUsuarioIdResponsable() {
		return UsuarioIdResponsable;
	}

	public void setUsuarioIdResponsable(int usuarioIdResponsable) {
		UsuarioIdResponsable = usuarioIdResponsable;
	}

	public char getEstadoTicket() {
		return EstadoTicket;
	}

	public void setEstadoTicket(char estadoTicket) {
		EstadoTicket = estadoTicket;
	}

	public String getNumeroCotizacion() {
		return NumeroCotizacion;
	}

	public void setNumeroCotizacion(String numeroCotizacion) {
		NumeroCotizacion = numeroCotizacion;
	}

	public String getNumeroFile() {
		return NumeroFile;
	}

	public void setNumeroFile(String numeroFile) {
		NumeroFile = numeroFile;
	}

	public String getObservacion() {
		return Observacion;
	}

	public void setObservacion(String observacion) {
		Observacion = observacion;
	}

	public boolean isEstadoRegistro() {
		return EstadoRegistro;
	}

	public void setEstadoRegistro(boolean estadoRegistro) {
		EstadoRegistro = estadoRegistro;
	}

	public int getTicketId() {
		return TicketId;
	}

}

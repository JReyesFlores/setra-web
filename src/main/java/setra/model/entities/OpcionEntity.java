package setra.model.entities;

public class OpcionEntity {
	private int OpcionId;
	private int ModuloId;
	private int SubopcionId;
	private String Nombre;
	private int Orden;
	private String RutaDestino;
	private String IconDataFeather;
	private boolean EstadoRegistro;

	public OpcionEntity(int opcionId, int moduloId, int subopcionId, String nombre, int orden, String rutaDestino,
			String iconDataFeather, boolean estadoRegistro) {
		this.OpcionId = opcionId;
		this.ModuloId = moduloId;
		this.SubopcionId = subopcionId;
		this.Nombre = nombre;
		this.Orden = orden;
		this.RutaDestino = rutaDestino;
		this.IconDataFeather = iconDataFeather;
		this.EstadoRegistro = estadoRegistro;
	}

	public OpcionEntity(int opcionId, int moduloId, String nombre) {
		this(opcionId, moduloId, 0, nombre, 0, null, null, true);
	}

	public int getModuloId() {
		return ModuloId;
	}

	public void setModuloId(int moduloId) {
		ModuloId = moduloId;
	}

	public int getSubopcionId() {
		return SubopcionId;
	}

	public void setSubopcionId(int subopcionId) {
		SubopcionId = subopcionId;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getRutaDestino() {
		return RutaDestino;
	}

	public void setRutaDestino(String rutaDestino) {
		RutaDestino = rutaDestino;
	}

	public boolean isEstadoRegistro() {
		return EstadoRegistro;
	}

	public void setEstadoRegistro(boolean estadoRegistro) {
		EstadoRegistro = estadoRegistro;
	}

	public int getOpcionId() {
		return OpcionId;
	}

	public int getOrden() {
		return Orden;
	}

	public void setOrden(int orden) {
		Orden = orden;
	}

	public String getIconDataFeather() {
		return IconDataFeather;
	}

	public void setIconDataFeather(String iconDataFeather) {
		IconDataFeather = iconDataFeather;
	}
}

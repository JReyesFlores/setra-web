package setra.model.entities;

public class OpcionEntity {
	private int OpcionId;
	private int ModuloId;
	private int SubopcionId;
	private String Nombre;
	private String RutaDestino;
	private boolean EstadoRegistro;

	public OpcionEntity(int opcionId, int moduloId, int subopcionId, String nombre, String rutaDestino,
			boolean estadoRegistro) {
		this.OpcionId = opcionId;
		this.ModuloId = moduloId;
		this.SubopcionId = subopcionId;
		this.Nombre = nombre;
		this.RutaDestino = rutaDestino;
		this.EstadoRegistro = estadoRegistro;
	}

	public OpcionEntity(int opcionId, int moduloId, String nombre) {
		this(opcionId, moduloId, 0, nombre, null, true);
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

}

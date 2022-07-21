package setra.model.response;

public class OpcionesUsuarioResponse {
	private int ModuloId;
	private String NombreModulo;
	private short OrdenModulo;
	private int OpcionId;
	private String NombreOpcion;
	private int OrdenOpcion;
	private int GrupoOpc;
	private String RutaDestino;
	private String IconDataFeather;
	private boolean PermiteNuevo;
	private boolean PermiteEditar;
	private boolean PermiteEliminar;
	private boolean PermiteImprimir;

	public OpcionesUsuarioResponse(int moduloId, String nombreModulo, short ordenModulo, int opcionId,
			String nombreOpcion, int ordenOpcion, int grupoOpc, String rutaDestino, String iconDataFeather,
			boolean permiteNuevo, boolean permiteEditar, boolean permiteEliminar, boolean permiteImprimir) {
		this.ModuloId = moduloId;
		this.NombreModulo = nombreModulo;
		this.OrdenModulo = ordenModulo;
		this.OpcionId = opcionId;
		this.NombreOpcion = nombreOpcion;
		this.OrdenOpcion = ordenOpcion;
		this.GrupoOpc = grupoOpc;
		this.RutaDestino = rutaDestino;
		this.IconDataFeather = iconDataFeather;
		this.PermiteNuevo = permiteNuevo;
		this.PermiteEditar = permiteEditar;
		this.PermiteEliminar = permiteEliminar;
		this.PermiteImprimir = permiteImprimir;
	}

	public int getModuloId() {
		return ModuloId;
	}

	public void setModuloId(int moduloId) {
		ModuloId = moduloId;
	}

	public String getNombreModulo() {
		return NombreModulo;
	}

	public void setNombreModulo(String nombreModulo) {
		NombreModulo = nombreModulo;
	}

	public short getOrdenModulo() {
		return OrdenModulo;
	}

	public void setOrdenModulo(short ordenModulo) {
		OrdenModulo = ordenModulo;
	}

	public int getOpcionId() {
		return OpcionId;
	}

	public void setOpcionId(int opcionId) {
		OpcionId = opcionId;
	}

	public String getNombreOpcion() {
		return NombreOpcion;
	}

	public void setNombreOpcion(String nombreOpcion) {
		NombreOpcion = nombreOpcion;
	}

	public int getOrdenOpcion() {
		return OrdenOpcion;
	}

	public void setOrdenOpcion(int ordenOpcion) {
		OrdenOpcion = ordenOpcion;
	}

	public int getGrupoOpc() {
		return GrupoOpc;
	}

	public void setGrupoOpc(int grupoOpc) {
		GrupoOpc = grupoOpc;
	}

	public String getRutaDestino() {
		return RutaDestino;
	}

	public void setRutaDestino(String rutaDestino) {
		RutaDestino = rutaDestino;
	}

	public String getIconDataFeather() {
		return IconDataFeather;
	}

	public void setIconDataFeather(String iconDataFeather) {
		IconDataFeather = iconDataFeather;
	}

	public boolean isPermiteNuevo() {
		return PermiteNuevo;
	}

	public void setPermiteNuevo(boolean permiteNuevo) {
		PermiteNuevo = permiteNuevo;
	}

	public boolean isPermiteEditar() {
		return PermiteEditar;
	}

	public void setPermiteEditar(boolean permiteEditar) {
		PermiteEditar = permiteEditar;
	}

	public boolean isPermiteEliminar() {
		return PermiteEliminar;
	}

	public void setPermiteEliminar(boolean permiteEliminar) {
		PermiteEliminar = permiteEliminar;
	}

	public boolean isPermiteImprimir() {
		return PermiteImprimir;
	}

	public void setPermiteImprimir(boolean permiteImprimir) {
		PermiteImprimir = permiteImprimir;
	}
}

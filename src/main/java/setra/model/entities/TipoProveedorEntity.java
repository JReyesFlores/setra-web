package setra.model.entities;

public class TipoProveedorEntity {
	private int TipoProveedorId;
	private String Nombre;
	private boolean EstadoRegistro;
	
	public TipoProveedorEntity() {
		this.TipoProveedorId = 0;
		this.Nombre = "";
		this.EstadoRegistro = true;
	}
	
	public TipoProveedorEntity(String _nombreProveedor) {
		super();
		this.Nombre = _nombreProveedor;
	}
	
	public TipoProveedorEntity(String _nombreProveedor, boolean _estadoRegistro) {
		super();
		this.Nombre = _nombreProveedor;
		this.EstadoRegistro = _estadoRegistro;
	}
	
	public TipoProveedorEntity(int _TipoProveedorId, String _nombreProveedor, boolean _estadoRegistro) {
		super();
		this.TipoProveedorId = _TipoProveedorId;
		this.Nombre = _nombreProveedor;
		this.EstadoRegistro = _estadoRegistro;
	}
	
	public int GetTipoProveedorId() {
		return this.TipoProveedorId;
	}
	
	public void SetNombre(String _nombreProveedor) {
		this.Nombre = _nombreProveedor;
	}
	
	public String GetNombre() {
		return this.Nombre;
	}
	
	public void SetEstadoRegistro(boolean _estadoRegistro) {
		this.EstadoRegistro = _estadoRegistro;
	}
	
	public boolean GetEstadoRegistro() {
		return this.EstadoRegistro;
	}
}

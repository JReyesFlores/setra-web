package setra.model.entities;

public class DescripcionServicioEntity {
	private int ServicioId;
	private int IdiomaId;
	private String DescripcionCorta;
	private String DescripcionCompleta;

	public DescripcionServicioEntity(int servicioId, int idiomaId, String descripcionCorta,
			String descripcionCompleta) {
		this.ServicioId = servicioId;
		this.IdiomaId = idiomaId;
		this.DescripcionCorta = descripcionCorta;
		this.DescripcionCompleta = descripcionCompleta;
	}

	public DescripcionServicioEntity(int servicioId, int idiomaId, String descripcionCorta) {
		this(servicioId, idiomaId, descripcionCorta, null);
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

	public int getServicioId() {
		return ServicioId;
	}

	public int getIdiomaId() {
		return IdiomaId;
	}

}

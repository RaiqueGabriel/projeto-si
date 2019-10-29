import java.util.Date;

public class Comentario {
	
	private int id;
	private Usuario usuario;
	private String texto;
	private Date data;
	
	public Comentario(int id, Usuario usuario, String texto, Date data) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.texto = texto;
		this.data = data;
	}

	public Comentario() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
	

}

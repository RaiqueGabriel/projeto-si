import java.util.Date;

public class Publicacao {
	
	private int id;
	private Usuario usuario;
	private String texto;
	private Date data;
	private Comentario[] comentarios;
	
	public Publicacao(int id, Usuario usuario, String texto, Date data, Comentario[] comentarios) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.texto = texto;
		this.data = data;
		this.comentarios = comentarios;
	}

	public Publicacao() {
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

	public Comentario[] getComentarios() {
		return comentarios;
	}

	public void setComentarios(Comentario[] comentarios) {
		this.comentarios = comentarios;
	}
	
	

}

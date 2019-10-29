
public class Grupo {
	
	private int id;
	private String titulo;
	private String descricao;
	private Usuario[] usuarios;
	private Publicacao[] publicacoes;
	
	public Grupo(int id, String titulo, String descricao, Usuario[] usuarios, Publicacao[] publicacoes) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.usuarios = usuarios;
		this.publicacoes = publicacoes;
	}

	public Grupo() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Usuario[] getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuario[] usuarios) {
		this.usuarios = usuarios;
	}

	public Publicacao[] getPublicacoes() {
		return publicacoes;
	}

	public void setPublicacoes(Publicacao[] publicacoes) {
		this.publicacoes = publicacoes;
	}


}


public class Pagina {
	
	private String texto;
	private Publicacao[] publicacoes;
	private Evento[] eventos;
	private Grupo[] grupos;
	
	public Pagina(String texto, Publicacao[] publicacoes, Evento[] eventos, Grupo[] grupos) {
		super();
		this.texto = texto;
		this.publicacoes = publicacoes;
		this.eventos = eventos;
		this.grupos = grupos;
	}

	public Pagina() {
		super();
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Publicacao[] getPublicacoes() {
		return publicacoes;
	}

	public void setPublicacoes(Publicacao[] publicacoes) {
		this.publicacoes = publicacoes;
	}

	public Evento[] getEventos() {
		return eventos;
	}

	public void setEventos(Evento[] eventos) {
		this.eventos = eventos;
	}

	public Grupo[] getGrupos() {
		return grupos;
	}

	public void setGrupos(Grupo[] grupos) {
		this.grupos = grupos;
	}

	
}

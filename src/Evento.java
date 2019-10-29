import java.util.Date;

public class Evento {
	
	private Usuario[] listaDeUsuarios;
	private int id;
	private String nome;
	private Date dataInicio;
	private Date dataFim;
	private String hora;
	
	public Evento(Usuario[] listaDeUsuarios, int id, String nome, Date dataInicio, Date dataFim, String hora) {
		super();
		this.listaDeUsuarios = listaDeUsuarios;
		this.id = id;
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.hora = hora;
	}

	public Usuario[] getListaDeUsuarios() {
		return listaDeUsuarios;
	}

	public void setListaDeUsuarios(Usuario[] listaDeUsuarios) {
		this.listaDeUsuarios = listaDeUsuarios;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
	
	
}

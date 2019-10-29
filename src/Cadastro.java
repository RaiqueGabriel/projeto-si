
public class Cadastro {
	
	private Usuario usuario;
	private String email;
	private String senha;
	
	public Cadastro(Usuario usuario, String email, String senha) {
		super();
		this.usuario = usuario;
		this.email = email;
		this.senha = senha;
	}

	public Cadastro() {
		super();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}

package br.com.mmartini.payload;

public class ContatoPayload {

	private String nome;
	private String sobreNome;
	private String empresa;
	private String cargo;
	private String email;
	private String telefone;
	private String observacao;
	private String foto;

	public ContatoPayload() {
		super();
	}

	public ContatoPayload(String nome, String sobreNome, String empresa, String cargo, String email, String telefone,
			String observacao, String foto) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.empresa = empresa;
		this.cargo = cargo;
		this.email = email;
		this.telefone = telefone;
		this.observacao = observacao;
		this.foto = foto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

}

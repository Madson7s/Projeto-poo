package modelo;

public class Evento {
	
	private long id;
	private String nome;
	private String descricao;
	private String dataDeEvento;
	private String horario;
	private String nomeDoLocal;
	private String endereco;
	private String emailDeContato;
	private String telefone;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDataDeEvento() {
		return dataDeEvento;
	}
	public void setDataDeEvento(String dataDeEvento) {
		this.dataDeEvento = dataDeEvento;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getNomeDoLocal() {
		return nomeDoLocal;
	}
	public void setNomeDoLocal(String nomeDoLocal) {
		this.nomeDoLocal = nomeDoLocal;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmailDeContato() {
		return emailDeContato;
	}
	public void setEmailDeContato(String emailDeContato) {
		this.emailDeContato = emailDeContato;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}

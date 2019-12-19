package modelo;

public class Curso {

	private int id;
	private String nome;
	private String dataInicio;
	private String dataTermino;
	private String descricao;
	private String[] treinadores;

	public Curso(int id,String nome, String dataInicio, String dataTermino, String descricao) {
		this.id = id;
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.descricao = descricao;
		this.treinadores = new String [5];
	}
	public Curso(int id, String dataInicio, String dataTermino, String descricao ) {
		this.id = id;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.descricao = descricao;
		
	}

	public void listarTreinador() {
		for(int i = 0; i < treinadores.length; i++) {
			if(treinadores[i] != null) {
				System.out.println(treinadores[i]);
			}
		}
	}

	public void adicionarTreinador(String nome) {
		for(int i = 0; i < treinadores.length; i++) {// ira percorrer a lista de treinador
			if(treinadores[i] == null) {// se a posicao atual da lista for igual null, 
				treinadores[i] = nome;// a posicao atual da lista vai receber o nome recebido por parametro
				break; // ira parar de percorrer a lista
			}

		}
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
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public String[] getTreinadores() {
		return treinadores;
	}

}

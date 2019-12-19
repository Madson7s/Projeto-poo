package modelo;

public class Instrutor {


	private String nome;
	private String especializacao;
	private String email;
	private String telefone;
	private String cpf;
	private Curso[] cursos;
	private Evento[] eventos;

	public Instrutor(){
		cursos = new Curso[10]; //cada instrutor pode ter dez cursos
		eventos = new Evento[5];// cada instrutor pode ter 5 eventos
	}
	
	public void adicionarEvento(Evento evento) {
		for(int i = 0; i < eventos.length; i ++ ) {
			if(eventos[i] == null) {
				eventos[i] = evento;
				break;
			}
			
		}
		
		
	}
	public boolean atualizarEvento(int id, String dataDeEvento, String horario, String nomeDoLocal, String endereco) {
		for(int i = 0; i < eventos.length; i++) {
			if(eventos[i] != null) {
				if(eventos[i].getId() == id) {
					eventos[i].getNome();
					eventos[i].setDataDeEvento(dataDeEvento);
					eventos[i].setHorario(horario);
					eventos[i].setNomeDoLocal(nomeDoLocal);
					eventos[i].setEndereco(endereco);
					
					 return true;
				}
			}
				
			
			
		}
		return false;
	}
	
	public void listaEventos() {
		for(int i = 0; i < eventos.length; i++) {
			if(eventos[i] != null) {
				System.out.println("Id: " + eventos[i].getId());
				System.out.println("Nome: " + eventos[i].getNome());
				System.out.println("Descrição: " + eventos[i].getDescricao());
				System.out.println("Data do evento: " + eventos[i].getDataDeEvento());
				System.out.println("Horario: " + eventos[i].getHorario());
				System.out.println("Nome do local: " + eventos[i].getNomeDoLocal());
				System.out.println("Endereço: " + eventos[i].getEndereco());
				
			}
		}
	}
	
	public void excluirEventos(int id) {
		for(int i = 0; i < eventos.length; i++ ) {
			if(eventos[i] != null && eventos[i].getId() == id) {
				eventos[i] = null;
			}
			else {
				System.out.println("Evento não encontrado!!");
			}
		}
	}
	
	
	public void buscarEvento(String nome) {
		int posicao = -1;
		for(int i = 0; i < eventos.length; i ++) {
			if(eventos[i] != null) {
				if(eventos[i].getNome().equals(nome)) {
					posicao = i;
					break;
				}
			}
	}
		if(posicao != -1) {
			System.out.println("Evento encontrado");
			System.out.println("Nome: " + eventos[posicao].getNome());
			System.out.println("Descrição: " + eventos[posicao].getDescricao());
			System.out.println("DataDeEvento: " + eventos[posicao].getDataDeEvento());
			System.out.println("horario: " + eventos[posicao].getHorario());

		}else {
			System.out.println("Evento não encontrado ");
		} 
	}
	public boolean verificarIdDeEvento(int id) {
		for(int i = 0; i < eventos.length; i++) {
		if( eventos[i] != null && eventos[i].getId() == id) {
			return true;
		}
		}
		return false;
	}
	

	public void adicionarCurso(Curso curso) { // ira receber um curso por parametro 
		for(int i = 0; i < cursos.length; i++) {// ira percorrer a lista de cursos
			if(cursos[i] == null) {// se a posicao atual da lista for igual null, 
				cursos[i] = curso;// a posicao atual da lista vai receber o curso recebido por parametro
				break; // ira parar de percorrer a lista
			}

		}
	}

	public boolean atualizarCurso(int id, String nome, String dataInicio, String dataTermino, String descricao){
		for(int i = 0; i < cursos.length; i++) {
			if(cursos[i] != null) {
				if(cursos[i].getId() == id) {
					cursos[i].setNome(nome);
					cursos[i].setDataInicio(dataInicio);
					cursos[i].setDataTermino(dataTermino);
					cursos[i].setDescricao(descricao);
					return true;
				}
			}
			

		}
		return false;
	}
	public void listarCurso() {
		for(int i = 0; i < cursos.length; i++) {
			if(cursos[i] != null) {
				System.out.println(cursos[i].getId());
				System.out.println("Nome:" + cursos[i].getNome());
				System.out.println("Data de inicio: " + cursos[i].getDataInicio());
				System.out.println("Data de termino: " + cursos[i].getDataTermino());
				System.out.println("Descrição: " + cursos[i].getDescricao());
			}

		}
	}
	
	public void excluirCurso(int id) {
		for(int i = 0; i < cursos.length; i++ ) {
			if(cursos[i] != null && cursos[i].getId() == id) {
				cursos[i] = null;
				break;
			}
			else {
				System.out.println("Curso não encontrado!!");
			}
		}
	}
	
	public void buscarCurso(String nome) {
		int posicao = -1;
		for(int i = 0; i < cursos.length; i ++) {
			if(cursos[i] != null) {
				if(cursos[i].getNome().equals(nome)) {
					posicao = i;
					break;
				}

			}
		}
		if(posicao != -1) {
			System.out.println("Curso encontrado");
			System.out.println("Data de inicio: " + cursos[posicao].getDataInicio());
			System.out.println("Data de termino: " + cursos[posicao].getDataTermino());
			System.out.println("Descrição: " + cursos[posicao].getDescricao());
			System.out.println("Treinadores:");
			cursos[posicao].listarTreinador();
		}else {
			System.out.println("Curso não encontrado ");
		}
	}
	public boolean verificarIdDeCurso(int id) {
		for(int i = 0; i < cursos.length; i++) {
		if(cursos[i] != null && cursos[i].getId() == id) {
			return true;
		}
		}
		return false;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecificacao() {
		return especializacao;
	}
	public void setEspecificacao(String especificacao) {
		this.especializacao = especificacao;
	}
	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
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


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Curso[] getCursos() {
		return cursos;
	}

	public void setCursos(Curso[] cursos) {
		this.cursos = cursos;
	}	
}

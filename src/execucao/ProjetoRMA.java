package execucao;


import java.util.Scanner;


import modelo.Curso;
import modelo.Evento;
import modelo.Instrutor;

public class ProjetoRMA {
	
	public static void main(String[] args) {
		
		
		Curso curso;
		Instrutor instrutor = new Instrutor();
		int id;
		String nome;
		String dataInicio;
		String dataTermino;
		String descricao;
		Evento evento;
		
		
		Scanner ler = new Scanner(System.in);

		int opcao = 0;
		
		do {
			System.out.println("------------ Bem Vindos(a) ------------" );
			System.out.println("\n");
			System.out.println("-----CURSO-----");
			System.out.println("---Opção 1: CADASTRAR---");
			System.out.println("---Opção 2: ATUALIZAR---");
			System.out.println("---Opção 3: REMOVER-----");
			System.out.println("---Opção 4: BUSCAR------");
			System.out.println("---Opção 5: LISTAR------");
			System.out.println("\n ----------------------- \n");
			System.out.println("-----EVENTOS-----");
			System.out.println("---Opção 6: CADASTRAR---");
			System.out.println("---Opção 7: ATUALIZAR---");
			System.out.println("---Opção 8: REMOVER-----");
			System.out.println("---Opção 9: BUSCAR------");
			System.out.println("---Opção 10: LISTAR------");
			System.out.println("\n ----------------------- \n");
			System.out.println("-----TREINADOR-----");
			System.out.println("---Opção 11: CADASTRAR---");
			System.out.println("---Opção 12: LISTAR------");
			opcao = ler.nextInt();	
			
			
			switch (opcao) {
			
			case 1:
				
				System.out.println("Digite o id do curso: ");
				id = ler.nextInt();
				ler.nextLine();
				System.out.println("Digite o nome do curso: ");
				nome = ler.nextLine();
				System.out.println("Digite sua data de inico do curso: ");
				dataInicio = ler.nextLine();
				System.out.println("Digite sua data do termino do curso: ");
				dataTermino = ler.nextLine();
				System.out.println("Digite sua descrição: ");
				descricao = ler.nextLine();
				curso =  new Curso(id, nome, descricao, dataInicio,dataTermino);
				
				instrutor.adicionarCurso(curso);
				break;
				
			case 2:
				
				System.out.println("Digite seu id: ");
				id = ler.nextInt();
				
				if(instrutor.verificarIdDeCurso(id)) {
					System.out.println("Curso encontrado, atulize as inforações desejada: ");
					
					System.out.println("Atualize o nome do curso: ");
					nome = ler.nextLine();
					
					System.out.println("Atualize data de inicio: ");
					dataInicio = ler.nextLine();
					
					System.out.println("Atualize data de termino: ");
					dataTermino = ler.nextLine();
					
					System.out.println("Atualize descrição: ");
					descricao = ler.nextLine();
					
					
					instrutor.atualizarCurso(id,nome, dataInicio, dataTermino, descricao);
					System.out.println("Curso atualizado!");
					
				}else {
					
					System.out.println("Curso não encontrado: ");
				}
				break;
				
			case 3:
				System.out.println("Digite o id do curso a ser deletado: ");
				id = ler.nextInt();
				instrutor.excluirCurso(id);
				break;
			case 4:
				System.out.println("Digite o nome do curso que deseja buscar: ");
				nome = ler.nextLine();
				instrutor.buscarCurso(nome);
				break;
			case 5: 
				instrutor.listarCurso();
				break;
			case 6:
				
				
				System.out.println("Digite o id do evento: ");
				id = ler.nextInt();
				ler.nextLine();
				System.out.println("Digite o nome do evento: ");
				nome = ler.nextLine();
				System.out.println("Digite sua data de inico do evento: ");
				dataInicio = ler.nextLine();
				System.out.println("Digite sua data do termino do evento: ");
				dataTermino = ler.nextLine();
				System.out.println("Digite sua descrição: ");
				descricao = ler.nextLine();
				//evento = new Evento(evento.getId(), evento.getNome(), evento.getDescricao(), evento.getDataDeEvento(),evento.getHorario(), evento.getNomeDoLocal(), evento.getEndereco());
				
				//instrutor.adicionarEvento(evento);
				break;
			case 7:
								
				System.out.println("Digite seu id");
				id = ler.nextInt();
				
				if(instrutor.verificarIdDeEvento(id)) {
					System.out.println("Evento encontrado");
					
					System.out.println("Atualize data de inicio: ");
					dataInicio = ler.nextLine();
					
					System.out.println("Atualize data de termino: ");
					dataTermino = ler.nextLine();
					
					System.out.println("Atualize descriÃ§Ã£o: ");
					descricao = ler.nextLine();
					
					
					//instrutor.atualizarEvento(evento.getId(), evento.getNome(), evento.getDataDeEvento(), evento.getHorario(),evento.getNomeDoLocal(),evento.getEndereco());
					
				}else {
					
					System.out.println("Evento nÃ£o encontrado ");
				}
				
			
				
				break;
			case 8:
				System.out.println("Digite o id do evento a ser deletado: ");
				id = ler.nextInt();
				instrutor.excluirEventos(id);
				break;
			case 9:
				System.out.println("Digite o nome do evento que deseja buscar: ");
				nome = ler.nextLine();
				instrutor.buscarEvento(nome);
				break;
			case 10: 
				instrutor.listaEventos();
				break;
			default:
				break;
			}
			
			
		}while(opcao < 13);
	}

}

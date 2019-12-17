package execucao;

import java.util.Scanner;

import modelo.Curso;
import modelo.Instrutor;

public class Menu {

	public static void main(String[] args) {
		Instrutor instrutor  = new Instrutor();
		Curso curso = new Curso(1, "Test", "02/12/2019", "02/05/2020","ifal");
		curso.adicionarTreinador("João"); 
		curso.adicionarTreinador("Laura");
		instrutor.adicionarCurso(curso);
		
		Scanner read = new Scanner(System.in);
		String nomeCurso;
		//curso.listar(); 
		System.out.println("Digite o nome do curso que você está procurando:");
		nomeCurso = read.nextLine();
		instrutor.buscarCurso(nomeCurso);

	}

}

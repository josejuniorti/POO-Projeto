package projeto;

import java.util.ArrayList;
import java.util.Scanner;
import projeto.Alimentos;
import projeto.Frutas;
import projeto.Verduras;

public class AppPrincipal {

	static ArrayList<Alimentos> lista = new ArrayList<Alimentos>();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Alimentos alimentos = new Alimentos();

		Scanner scan = new Scanner(System.in);
		String opcao = "N";
		do {
			System.out.println("\n");
			System.out.println("       BEM VINDO(A) A AGRITEC    \n");
			System.out.println("**********************************");
			System.out.println("*                                *");
			System.out.println("*             MENU               *");
			System.out.println("*                                *");
			System.out.println("*  1 - ADCIONAR ALIMENTO         *");
			System.out.println("*  2 - LISTAR TODOS OS ALIMENTOS *");
			System.out.println("*                                *");
			System.out.println("**********************************\n");
		

			System.out.print(" INFORME A OP«„O DO MENU: \t  ");
	

			int op = scan.nextInt();
			if (op == 1) {
				adicionar();

			} else if (op == 2) {
				listar();

			}
			System.out.print(" DESEJA VOLTAR AO MENU? S/N:\t");
			opcao = scan.next();

		} while (opcao.equals("S") || opcao.equals("s"));

		System.out.print(" SAIU DO SISTEMA...");
	}

	public static void adicionar() {
		String opcao = "N";
		int opcaoF = 1;
		do {
			System.out.println("\n");
			System.out.println("**********************************");
			System.out.println("*                                *");
			System.out.println("*            SUBMENU             *");
			System.out.println("*                                *");
			System.out.println("*     1 - ADCIONAR FRUTA         *");
			System.out.println("*     2 - ADCIONAR VERDURA       *");
			System.out.println("*                                *");
			System.out.println("**********************************\n");
		
			System.out.print(" INFORME QUAL A OP«√O DO SUBMENU: \t");

			opcaoF = scan.nextInt();
			if (opcaoF == 1) {
				adicionaFruta();
			} else if (opcaoF == 2) {
				adicionaVerdura();
			}

			System.out.print(" DESEJA CONTINUAR ADCIONANDO AO SUBMENU? S/N: \t");
			opcao = scan.next();
		} while (opcao.equals("S") || opcao.equals("s"));

	}

	public static void listar() {
		System.out.println("\n");
		System.out.println("**********************************************");
		System.out.println("*                                            *");
		System.out.println("*       LISTA DE ALIMENTOS ADCIONADOS:       *");
		System.out.println("*                                            *");
		System.out.println("* NOME DO ALIMENTO | QUANTIDADE DE ALIMENTOS *");
		System.out.println("*                                            *");

		for (Alimentos alimentos : lista) {
			System.out.print("*           " + alimentos.getNome()+  " | "  +alimentos.getQuantidade()+ "                       *\n");
		}
		
		System.out.println("*                                            *");
		System.out.println("**********************************************");
		System.out.println("*              VOLTE SEMPRE!!!               *");
		System.out.println("**********************************************");
	}
	
	public static void adicionaFruta() {
		Frutas frutas = new Frutas();
		System.out.println(" INFORME O NOME DA FRUTA: ");
		String nome = scan.next();

		frutas.setNome(nome);
		System.out.println(" INFORME A QUANTIDADE: ");
		String quantidade = scan.next();
		frutas.setQuantidade(quantidade);
		lista.add(frutas);
	}

	public static void adicionaVerdura() {
		Verduras verduras = new Verduras();
		System.out.println(" INFORME O NOME DA VERDURA: ");
		String nome = scan.next();

		verduras.setNome(nome);
		System.out.println(" INFORME A QUANTIDADE: " );
		String quantidade = scan.next();
		verduras.setQuantidade(quantidade);
		lista.add(verduras);
	}
}

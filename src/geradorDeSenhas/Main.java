package geradorDeSenhas;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		
		int tamanhoSenha = 10;
		String senha = gerarSenha(tamanhoSenha);
		System.out.println("Senha gerada: " + senha);
		
		
		sc.close();
	}
	
	public static String gerarSenha(int tamanho) {
		
		String letrasMaiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
		String numeros = "0123456789";
		String caracteresEspeciais = "!@#$%¨&*()_-+=<>?";
		
		
		String todosCaracteres = letrasMaiusculas + letrasMinusculas + numeros + caracteresEspeciais;
		
		Random random = new Random();
		StringBuilder senha = new StringBuilder();
		
		for (int i = 0; i < tamanho; i++) {
			int indice = random.nextInt(todosCaracteres.length());
			senha.append(todosCaracteres.charAt(indice));
		}
		
		return senha.toString();
	}
}

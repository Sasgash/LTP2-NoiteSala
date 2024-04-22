import java.util.Scanner;

public class Metodo_02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int resultado;
		int a, b;

		System.out.println("Escreva o numero a: ");
		a = leia.nextInt();

		System.out.println("Escreva o numero b: ");
		b = leia.nextInt();
		
		resultado = soma(a, b);
		
		System.out.printf("O resultado é: " + resultado);
	}

	public static int soma(int a, int b) {
		int somaValores = 0;
		for (int i = a; i <= b; i++) {
			somaValores = somaValores + i;
		}
		return somaValores;
	}
}

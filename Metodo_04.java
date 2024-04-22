import java.util.Scanner;

public class Metodo_04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double valorAntigo;
		double valorNovo;
		double resultado;

		System.out.println("Digite o valor antigo: ");
		valorAntigo = leia.nextDouble();

		System.out.println("Digite o valor novo: ");
		valorNovo = leia.nextDouble();

		resultado = diferenca(valorAntigo, valorNovo);

		System.out.printf("A diferença é de: " + resultado);

		System.out.printf("Valor invalido!");

	}

	public static double diferenca(double antigo, double atual) {
		double subtracao;
		double porcentagem;

		subtracao = antigo - atual;

		porcentagem = (subtracao / antigo) * 100;
		return porcentagem;
	}
}

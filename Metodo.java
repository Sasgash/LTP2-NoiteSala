import java.util.Scanner;

public class Metodo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int resultado;
		int a, b, c;
		
		System.out.println("Escreva valor de a:");
		a = leia.nextInt();
		System.out.println("Escreva valor de b:");
		b = leia.nextInt();
		System.out.println("Escreva valor de c:");
		c = leia.nextInt();
		 resultado = soma(a, b, c);
		System.out.printf("A soma dos numeros é: " + resultado);
	}
	
	
	
	public static int soma(int a, int b, int c) {
		int somaValores=0;
		if(a<1) {
			System.out.printf("Valor invalido");
		}else {

				for(int i=b; i<=c; i++) {
					if(i % a == 0) {
						somaValores = somaValores + i;
					}
		}

		}
		return somaValores;
	}
}

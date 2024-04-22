import java.util.Scanner;

public class Metodo_1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int flag = 0;
		String[] nomes = new String[5];
		String nomesAleatorios;
		Boolean parar = false;
		
//Recebendo os 5 nomes
		for(int i=0; i<5; i++) {
			System.out.println("Digite 5 nomes: ");
			nomes[i] = leia.nextLine();
		}
		do {
			System.out.println(" Digite um nome aleatorio. Digite fim para parar.");
			nomesAleatorios = leia.nextLine();
			if(nomesAleatorios.equalsIgnoreCase("Fim")) {
				break;
			}
			flag = 0;
			for(int i=0; i<5; i++) {
			if(nomesAleatorios.equalsIgnoreCase(nomes[i])) {
			System.out.printf("Nome igual.");
			flag = 1;
			break;
			}else {
				flag = 0;
			}
		}
			if(flag == 1) {
				System.out.printf(" Nome " + nomesAleatorios + " foi encontrado.");

			}else {
				System.out.printf("Nome nao encontrado. ");
				flag = 0;
			}
		}while(!nomesAleatorios.equalsIgnoreCase("Fim") && parar == false);

	}

}

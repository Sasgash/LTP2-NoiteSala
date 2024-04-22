import java.util.Scanner;

public class Metodo_03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valor;
		
		System.out.printf("Informe os segundos:");
		valor = leia.nextInt();
		
		converter(valor);
		
	}

	public static void converter(int segundos){
		int hora;
		int min;
		
		hora = segundos / 3600;
		segundos %= 3600;
		
		min = segundos/60;
		
		segundos %= 60;
		
		System.out.printf("Horas: " + hora + " Minutos: " + min + " Segundos: " + segundos);
	}
}

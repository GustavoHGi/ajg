package OmegaUp1;
import java.util.Scanner;
public class AceptadoRechazado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble();
		if (N >= 1.70) {
			System.out.println("Aceptado");
		} else {
			System.out.println("Rechazado");
		}

	}
}

	
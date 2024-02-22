import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			calcularUltimoBalon();
	}

	public static void calcularUltimoBalon() {
		int numB;
		int numP;
		Scanner sc = new Scanner(System.in);

		do {
			numB = sc.nextInt();
			numP = sc.nextInt();
			if (numB == 0 && numP == 0) {
				System.exit(0);
			}
		} while (!(numB >= 1 && numP <= 100 && numP > 0));
		
		sc.close();

		ArrayList<Integer> balones = new ArrayList<Integer>();

		// Rellenar ArrayList
		for (int i = 0; i < numB; i++) {
			balones.add(i + 1);
		}

		int contador = 0;
		while (!(balones.size() == 1)) {
			contador = (contador + (numP - 1)) % balones.size();
			balones.remove(contador);
		}

		// Mostrar último balón
		System.out.println(balones.get(0));
	}

}

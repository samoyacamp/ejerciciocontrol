import java.util.Scanner;

public class Controlversion {
	Scanner sc = new Scanner(System.in);
	char[][] mapa = new char[10][10];

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] tabla = new int[10][10];

		// 0*0 0*1 0*2 0*3... 0*9
		// 1*0 1*1 1*2 ...
		// ...
		// 9*0 9*1 9*2 ... 9*9

		// Rellenar matriz
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = i * j;
			}
		}

		// Pintar matriz
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "  ");
			}
			System.out.print("\n");
		}
		//Ayyy mi madre el biiichooo

	}
}

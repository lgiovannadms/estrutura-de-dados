package eda;
import java.util.Arrays;
import java.util.Scanner;

class InsertionSortRecursivo {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			String linha = sc.nextLine();
			String[] entrada = linha.split(" ");
			
			int[] numeros = new int[entrada.length];
			for (int i = 0; i < entrada.length; i++) {
				numeros[i] = Integer.parseInt(entrada[i]);
			}
			
			insertionSortRecursivo(numeros, numeros.length);
			
			sc.close();
			
		}

		private static void insertionSortRecursivo(int[] numeros, int length) {
			if (length <= 1) {
				return;
			}
			
			insertionSortRecursivo(numeros, length - 1);
			
			int j = length - 1;
			while (j > 0 && numeros[j] < numeros[j - 1]) {
				swap(numeros, j, j - 1);
				j--;
			}
			
			System.out.println(Arrays.toString(numeros));
		}

		private static void swap(int[] numeros, int j, int i) {
			int menorNum = numeros[j];
			numeros[j] = numeros[i];
			numeros[i] = menorNum;
		}
}

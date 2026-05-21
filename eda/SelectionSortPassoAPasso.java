package eda;

import java.util.Arrays;
import java.util.Scanner;

class SelectionSortPassoAPasso {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String linha = sc.nextLine();
		String[] entrada = linha.split(" ");
		
		int[] numeros = new int[entrada.length];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(entrada[i]);
		}
		
		selectionSort(numeros);
		
		sc.close();
	}

	private static void selectionSort(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			int indiceMenor = i;
			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[j] < numeros[indiceMenor]) {
					indiceMenor = j;
				}
			}
			
			if (indiceMenor != i) {
				swap(numeros, i, indiceMenor);
				System.out.println(Arrays.toString(numeros));
		
			}
		}
	}

	private static void swap(int[] numeros, int i, int indiceMenor) {
		int primeiro = numeros[i];
		numeros[i] = numeros[indiceMenor];
		numeros[indiceMenor] = primeiro;
	}
}

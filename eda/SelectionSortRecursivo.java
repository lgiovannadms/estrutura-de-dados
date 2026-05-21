package eda;

import java.util.Arrays;
import java.util.Scanner;

class SelectionSortRecursivo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String linha = sc.nextLine();
		String[] entrada = linha.split(" ");
		
		int[] numeros = new int[entrada.length];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(entrada[i]);
		}
		
		selectionSortRecursivo(numeros, 0);
		
		sc.close();
	}

	private static void selectionSortRecursivo(int[] numeros, int primeiro) {
		if (primeiro >= numeros.length - 1) {
			return;
		}
		
		int indiceMenor = primeiro;
		for (int i = primeiro + 1; i < numeros.length; i++) {
			if (numeros[i] < numeros[indiceMenor]) {
				indiceMenor = i;
			}
		}
		
		swap(numeros, primeiro, indiceMenor);
		System.out.println(Arrays.toString(numeros));
		
		selectionSortRecursivo(numeros, primeiro + 1);
	}

	private static void swap(int[] numeros, int primeiro, int indiceMenor) {
		int menorNumero = numeros[indiceMenor];
		numeros[indiceMenor] = numeros[primeiro];
		numeros[primeiro] = menorNumero;
	}
}

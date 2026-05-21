package eda;

import java.util.Arrays;
import java.util.Scanner;

class MergeSortPassoAPasso {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String linha = sc.nextLine();
		String[] entrada = linha.split(" ");
		
		int[] numeros = new int[entrada.length];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(entrada[i]);
		}
		
		mergeSort(numeros, 0, numeros.length - 1);
		
		sc.close();
	}

	private static void mergeSort(int[] numeros, int ini, int fim) {
		if (ini >= fim) {
			printArrayDividido(numeros, ini, fim);
			return;
		}
		
		printArrayDividido(numeros, ini, fim);
		
		int meio = (ini + fim) / 2;
		mergeSort(numeros, ini, meio);
		mergeSort(numeros, meio + 1, fim);
		
		merge(numeros, ini, fim);
		
		printArrayDividido(numeros, ini, fim);
	}

	private static void printArrayDividido(int[] numeros, int ini, int fim) {
		int[] array = Arrays.copyOfRange(numeros, ini, fim + 1);
        System.out.println(Arrays.toString(array));
	}

	private static void merge(int[] numeros, int ini, int fim) {
		int helperFim = fim - ini;
		int[] helper = new int[helperFim + 1];
		for (int i = 0; i <= helperFim; i++) {
			helper[i] = numeros[ini + i];
		}
		
		int helperMeio = helperFim / 2;
		
		int i = 0;
		int meio = helperMeio + 1;
		int k = ini;
		
		while (i <= helperMeio && meio <= helperFim) {
			if (helper[i] <= helper[meio]) {
				numeros[k] = helper[i];
				i++;
			} else {
				numeros[k] = helper[meio];
				meio++;
			}
			
			k++;
		}
		
		while (i <= helperMeio) {
			numeros[k] = helper[i];
			i++;
			k++;
		}
	}
}

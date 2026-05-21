package eda;

import java.util.Scanner;

class QuickSortPassoAPasso {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String linha = sc.nextLine();
		String[] entrada = linha.split(" ");
		
		int[] numeros = new int[entrada.length];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(entrada[i]);
		}
		
		quickSort(numeros, 0, numeros.length - 1);
		
		sc.close();
	}

	private static void quickSort(int[] numeros, int left, int right) {
		if (left < right) {
			int indexPivot = particao(numeros, left, right);
			quickSort(numeros, left, indexPivot - 1);
			quickSort(numeros, indexPivot + 1, right);
		}
	}

	private static int particao(int[] numeros, int left, int right) {
		int pivot = numeros[left];
		int index = left;
		
		for (int i = left + 1; i <= right; i++) {
			if (numeros[i] <= pivot) {
				index++;
				swap(numeros, index, i);
			}
		}
		
		swap(numeros, left, index);
		printArray(numeros);
		return index;
	}

	private static void printArray(int[] numeros) {
		String saida = "";
		for (int i = 0; i < numeros.length; i++) {
			saida += numeros[i] + " ";
		}
		System.out.print(saida.trim() + "\n");
	}

	private static void swap(int[] numeros, int i, int index) {
		int numero = numeros[i];
		numeros[i] = numeros[index];
		numeros[index] = numero;
	}

}

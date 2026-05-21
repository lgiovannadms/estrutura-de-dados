package eda;

import java.util.Arrays;
import java.util.Scanner;

class ParticionamentoLomutoUltimo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String linha = sc.nextLine();
		String[] entrada = linha.split(" ");
		
		int[] numeros = new int[entrada.length];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(entrada[i]);
		}
		
		particionamento(numeros, 0, numeros.length - 1);
		
		System.out.println(Arrays.toString(numeros));
		
		sc.close();
	}

	
	private static void particionamento(int[] numeros, int left, int right) {
		int pivot = numeros[right];
		int index = right;
		
		for (int i = right - 1; i >= left; i--) {
			if (numeros[i] > pivot) {
				index--;
				swap(numeros, index, i);
				System.out.println(Arrays.toString(numeros));
			}
		}
		
		swap(numeros, index, right);
		System.out.println(Arrays.toString(numeros));
	}

	private static void swap(int[] numeros, int index, int i) {
		int numero = numeros[index];
		numeros[index] = numeros[i];
		numeros[i] = numero;
	}

}

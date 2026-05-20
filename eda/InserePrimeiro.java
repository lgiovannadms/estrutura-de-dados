package eda;

import java.util.Arrays;
import java.util.Scanner;

class InserePrimeiro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String linha = sc.nextLine();
		String[] entrada = linha.split(" ");
		
		int[] numeros = new int[entrada.length];
		for (int i = 0; i < entrada.length; i++) {
			numeros[i] = Integer.parseInt(entrada[i]);
		}
		
		int j = 0;
		while (j < numeros.length - 1 && numeros[j] > numeros[j +1 ]) {
			swap(numeros, j, j + 1);
			j++;
		}
		
		System.out.println(Arrays.toString(numeros));
		
		sc.close();
	}

	private static void swap(int[] numeros, int j, int i) {
		int numeroMaior = numeros[j];
		numeros[j] = numeros[i];
		numeros[i] = numeroMaior;
	}
}

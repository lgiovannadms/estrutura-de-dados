package eda;

import java.util.Scanner;

class MelhorPivot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] entrada = sc.nextLine().split(" ");
		String[] entrada2 = sc.nextLine().split(" ");
		
		int[] numeros = new int[entrada.length];
		for (int i = 0; i < entrada.length; i++) {
			numeros[i] = Integer.parseInt(entrada[i]);
		}
		
		System.out.println(analisePivot(numeros, Integer.parseInt(entrada2[0]), Integer.parseInt(entrada2[1])));
		
		sc.close();
	}

	private static int analisePivot(int[] numeros, int int1, int int2) {
		int meio = numeros.length / 2;
		int contInt1 = 0;
		int contInt2 = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < numeros[int1]) {
				contInt1++;
			}
			if (numeros[i] < numeros[int2]) {
				contInt2++;
			}
		}
		
		int dif1 = Math.abs(meio - contInt1);
		int dif2 = Math.abs(meio - contInt2);
		
		if (dif1 <= dif2) {
			return int1;
		} else {
			return int2;
		}
	}

}

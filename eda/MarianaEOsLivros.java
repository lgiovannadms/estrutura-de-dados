package eda;

import java.util.Scanner;

class MarianaEOsLivros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] entrada = sc.nextLine().trim().split(",");
		
		insertionSortLivros(entrada);
		
		sc.close();
	}

	private static void insertionSortLivros(String[] entrada) {
		
		System.out.println(String.join(", ", entrada));
		
		for (int i = 1; i < entrada.length; i++) {
			
			
			int j = i;
			
			while (j > 0 && entrada[j].compareTo(entrada[j - 1]) < 0) {
				swap(entrada, j, j - 1);
				j--;
			}
			
			System.out.println(String.join(", ", entrada));
		}
	}

	private static void swap(String[] entrada, int j, int i) {
		String livro = entrada[j];
		entrada[j] = entrada[i];
		entrada[i] = livro;
	}

	
}

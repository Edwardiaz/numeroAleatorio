package main;

import java.util.Random;

public class MainAleatorio {

	public static void main(String[] args) {
		int resta = 0;
		int suma = 0;
		int resultado = 0;

		Random random = new Random();
		System.out.println("Operaciones aleatorias: ");
		for (int i = 0; i <= 9; i++) {

			System.out.println("Número aleatorio 1: " + (int) (random.nextDouble() * 99));
		}
		for (int i = 0; i <= 9; i++) {

			System.out.println("Número aleatorio 2: " + (int) (random.nextDouble() * 99));
		}
	}
}

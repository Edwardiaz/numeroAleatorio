package main;

import java.util.Random;

public class MainAleatorio {

	public static void main(String[] args) {
		int resultadoS = 0;
		int resultadoR = 0,x=0,y=0;

		Random random = new Random();
		System.out.println("Operaciones aleatorias: ");
		for (int m = 1; m <= 20; m++) {

//				System.out.println("Número aleatorio 1: " + (int) (random.nextDouble() * 9));


//					System.out.println("Número aleatorio 2: " + (int) (random.nextDouble() * 9));
					x=(int) (random.nextDouble() * 99+1);
					y=(int) (random.nextDouble() * 98+1);
					System.out.println("operacion "+m+": ");
					resultadoS = y+x;
					resultadoR = y-x;
					if(resultadoR<0) {
					System.out.println(y+" + "+x+" = "+((resultadoR)*-1)+resultadoS);
					}else {
						System.out.println(y+" + "+x+" = "+resultadoR+resultadoS);
					}
		}
	}
}

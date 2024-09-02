package basqueteTime;

import java.util.Scanner;

public class basquete {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] cestas = new int[4][1];
		
		System.out.println("Cestas Feitas Por jogasdores");
		for(int i = 0; i < cestas.length;i++) {
			for(int j = 0; j < cestas[i].length;j++) {
				System.out.println("Jogador : " + (i + 1) + " \nNumero de cestas ->");
				cestas[i][j] = scan.nextInt();
			}
		}
		int temp2 = 0; 
		int jog = 0;
		System.out.println("Cestas Feitas Por jogasdores");
		for(int i = 0; i < cestas.length;i++) {
			for(int j = 0; j < cestas[i].length;j++) {
				System.out.println("Jogador " + (i+1) + " Numero de cestas ->" + cestas[i][j]);
				
			}
			
			if(cestas[i][0] > temp2) {
				temp2 = cestas[i][0];
				jog = i + 1;
			}
			
	}
		System.out.println("Maior cesta " + temp2 + "\nJogador : " + jog);
		scan.close();
		
	}
    
}

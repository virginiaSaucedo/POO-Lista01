package primeiraLista;

import java.util.ArrayList;
import java.util.Random;

public class ExecucaoExercicios {

	public static void main(String[] args) {

		Lista lista = new Lista();
		
		
		// EXERCÍCIO 01 
		
		ArrayList<Double> quadrados = new ArrayList<Double>();
		
		quadrados.add(22.0);
		quadrados.add(6.0);
		quadrados.add(2.0);
		quadrados.add(0.0);
		
		System.out.println("\n\nExercicio 01 \n\n" + lista.Exerc01(quadrados));
	
		
		// EXERCICIO 02
				
		System.out.println("\n\nExercicio 02 \n\n" + lista.Exerc02(7));

		// EXERCICIO 03
						
		System.out.println("\n\nExercicio 03 \n\n" + lista.Exerc03(4));

		// EXERCICIO 04

		System.out.print("\n\nExercicio 04 \n\n" + lista.Exerc04(2, 3));

		// EXERCICIO 05

		int vendidos[] = new int[5];

		Random random = new Random();
		
		for(int i = 0 ; i < vendidos.length ; i++){
			
			vendidos[i] = random.nextInt(30);

		}

		System.out.print("\n\nExercicio 05 \n\n");
		lista.Exerc05(vendidos);

		// EXERCICIO 06

		System.out.print("\n\nExercicio 06  \n\n" + lista.Exerc06(vendidos));

		// EXERCICIO 07
						
		System.out.println("\n\nExercicio 07 \n\n" + lista.Exerc07(4));

		// EXERCICIO 08
						
		System.out.println("\n\nExercicio 08 \n\n" );
		lista.Exerc08(6 , 5 , 3 );
	}



}

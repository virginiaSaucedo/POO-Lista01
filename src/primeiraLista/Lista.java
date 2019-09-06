package primeiraLista;

import java.util.ArrayList;

public class Lista {
	
	double total = 0.0;
	
	public ArrayList<Double> Exerc01(ArrayList<Double> numeros) {
			
		ArrayList<Double> quadrados = new ArrayList<Double>();
		double quadrado;
		
		for (Double numero : numeros) {
			quadrado = Math.pow(numero , 2);
			quadrados.add(quadrado) ;	
		}
		
		return quadrados;
	}
	
	public double Exerc02(double numero){
		
		if(numero == 0 )
			return 0; 
		return numero + Exerc02(numero - 1);
	}
	
	public  ArrayList<Integer> Exerc03(int numero){

		ArrayList<Integer> impares = new ArrayList<Integer>();

		int contagemImpares = 0;

		for (int i = 0; contagemImpares != numero ; i++){
			if( i % 2 != 0){
				impares.add( i );
				contagemImpares++;
			}
		}
		
		return impares;
		
	}

	public double Exerc04(double base, double expoente){
	
		double	potencia = Math.pow(base , expoente);
		return potencia;
	}

	public void Exerc05(int vendidos[]){

		int max = vendidos[0]; 
		int data = 1;

		System.out.print("\nDia : " + data + "\nVendidos : " + max);

		for (int i = 1 ; i < vendidos.length; i++) {
			
			System.out.print("\nDia : " + (i+1) + "\nVendidos : " + vendidos[i]);

			if (vendidos[i] > max) {
				max = vendidos[i];
				data = i+1;
			}
				
		 }

		System.out.print("\n\n Maior venda\nDia : " + data + "\nVendidos : " + max);
		 
	}

	public int Exerc06(int numeros[]){
		
		int contagemPares = 0;

		for (int i = 0; i < numeros.length ; i++){
			
			if( numeros[i] % 2 == 0){
				contagemPares += numeros[i];
			}

		}
		return contagemPares;
	}

	public int Exerc07(int numero){
		
		if(numero == 0 )
			return 1; 
		return numero * Exerc07(numero - 1);
	}

	public void Exerc08(int qtdLista, int multiplo1, int multiplo2 ){
		
		int lista[] = new int[qtdLista];

		int contagem = 0;

		for (int i = 0; contagem < qtdLista ; i++){
			if(( i % multiplo1 == 0) || ( i % multiplo2 == 0 ) || (( i % multiplo1 == 0) && ( i % multiplo2 == 0 ) )){
				lista[contagem] = i ;
				contagem++;
				
			}
		}
		System.out.print( lista.length + "\n");

		for (int numero : lista) {
			System.out.print(numero + ", ");
		}

	}


}

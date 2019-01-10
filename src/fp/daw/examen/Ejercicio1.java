package fp.daw.examen;

import java.util.Random;

public class Ejercicio1 {

	/* 
	 * 2,5 puntos
	 * 
	 * Escribe en el método main un algoritmo que genere un número aleatorio comprendido entre
	 * 10 y 100. Una vez obtenido esté número se generará a partir de él una secuencia se números
	 * enteros en la que se cumplen las siguientes condiciones:  
	 *
	 *    • Si un número de la secuencia es par, el siguiente será dicho número dividido
	 *      por la mitad.
	 *
	 *    • Si un número de la secuencia es impar, el siguiente será el resultado de multiplicar
	 *      dicho número por 3 y sumarle 1.
	 *      
	 * La secuencia finaliza cuando en el proceso de generar los números de la misma se obtiene
	 * como resultado el número 1. Los números de la secuencia se mostrarán por pantalla a según
	 * se van generando con el formato que se muestra en el ejemplo siguiente, teniendo en cuenta
	 * que en una línea de texto se mostrarán como máximo 30 números:
	 * 
	 *    Si el primer número es 10, la secuencia que se genera es:
	 *    
	 *        10, 5, 16, 8, 4, 2, 1
	 */
	
	public static void main(String[] args) {
		
		
		Random aleatorio= new Random();
		
	
		
		int numero = aleatorio.nextInt(100) + 10;
		System.out.print(numero + " ");
		do {
		if (numero%2==0) {
			int par = numero / 2;
			int resultadopar= numero/par;
			System.out.print ( par +" " + resultadopar);
			resultadopar = numero;
		}
		if (numero%2==1) {
			int impar = numero *3 +1 ;
			int resultadoimpar = numero/impar;
			System.out.print(impar + " "+ resultadoimpar);
			resultadoimpar =numero;
		}
		} while (numero==0);
	}
	
	
}

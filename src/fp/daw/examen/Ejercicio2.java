package fp.daw.examen;

public class Ejercicio2 {

	/*
	 * 2,5 puntos
	 * 
	 * Define, después de este comentario, un método llamado 'vectorSuma' que reciba un
	 * array bidimensional de números reales y retorne un vector de números reales que contenga
	 * en cada posición i el resultado se sumar todos los números almacenados en la fila i del
	 * array bidimensional.
	 *  
	 */
	
	public static int vectorSuma (int [] [] reales) {
		
		 int total = 0;
		    for (int i = 0; i < reales.length; i++) {
		        for (int j = i; j < reales.length; j++) {
		            int suma = 0;
		            for (int k = i; k <= j; k++) {
		                suma += reales [k];
		                
		            }
		        }
		    }
		    return total;
		}
		
	
		        
		
		 
		 
	
	
	/*
	 * 2,5 puntos
	 * 
	 * Escribe en el método main las sentencias necesarias para poner a prueba el método
	 * 'vectorSuma'. Habrá que crear un array dimensión n * m, donde n y m serán números
	 * enteros aleatorios comprendidos entre 10 y 20, invocar al método 'vectorSuma' 
	 * pasándole este array y finalizar mostrando por pantalla el array bidimensional y
	 * el vector retornado con un formato que facilite su legibilidad.
	 * 
	 */
	
	public static void main(String[] args) {
		
		
	}

}

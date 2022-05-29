package fp;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.NotImplementedException;
public class Calculator {


	/*
     * este metodo devuelve el Class del object que le pasamos
     */
	public static Class classTypeOf(Object x) {
		Class obtenerClase = x.getClass();
		return obtenerClase;
		
	}

	/*
     * devuelve una lista con los n números de la serie de fibonacci.
     */
	public static List<Integer> fibonacci(int n) {
		
		List<Integer> lista = new ArrayList<Integer>();
		int num = 1;
		lista.add(num);
		lista.add(num);
		for (int i = 2; i < n; i++) {
			lista.add(lista.get(i - 1) + lista.get(i - 2));
		}
		return lista;
	}

	/*
	 * Escribir todos los números del number al 0 de step en step.
	 */
	public static int[] stepThisNumber(int number, int step) {
		List<Integer> stepList = new ArrayList<>();
		while (number - step > 0) {
			stepList.add(number -= step);
		}

		}

	/*
	 * Módulo al que se le pasa un número entero del 0 al 20 y devuelve los
	 * divisores que tiene.
	 */
	public static int[] divisors(int n) {
		
		int divisors =0;
		int contador=0;
		for(int i = 1 ; i <n/2 ; i++){
            if(n%2==0){
                contador++;
                divisors+=contador;
				int [] ListaDiv= {divisors};
            }
            else {
                contador++;
                divisors+=contador;
                
            }

        
        }
		
		throw new NotImplementedException("no implementado");
	}

	/*
	 * Toma como parámetros una cadena de caracteres y devuelve cierto si la cadena resulta ser un palíndromo
	 */
	public static boolean checkIsPalindrome(String cadena) {
		throw new NotImplementedException("no implementado");
	}

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	public static String speakToMe(int n) {
		throw new NotImplementedException("no implementado");
	}

	/*
	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	public static boolean isLeapYear(String fecha) {
		throw new NotImplementedException("no implementado");
	}

	/*
	 * este metodo devuelve cierto si la fecha es válida
	 */
	public static boolean isValidDate(String date) {
		throw new NotImplementedException("no implementado");
	}
}

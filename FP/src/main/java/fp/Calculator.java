package fp;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
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
		return ListToArray(stepList);
		}
	public static int[] ListToArray(List<Integer> lista) {
		int[] iArr = new int[lista.size()];
		for (int i = 0; i < lista.size(); i++) {
			iArr[i] = lista.get(i);
		}
		return iArr;
	}
	/*
	 * Módulo al que se le pasa un número entero del 0 al 20 y devuelve los
	 * divisores que tiene.
	 */
	public static int[] divisors(int n) {
		if (n == 0)
			return null;
		List<Integer> listaDiv = new ArrayList<Integer>();
		if (n >= 0 && n <= 20) {
			int counter = 0;
			for (int i = 20; i > 0; i--) {
				if (n % i == 0) {
					listaDiv.add(i);
				}
			}

			return ListToArray(listaDiv);
		}
		return new int[] { -1 };
		
	}
	

	/*
	 * Toma como parámetros una cadena de caracteres y devuelve cierto si la cadena resulta ser un palíndromo
	 */
	public static boolean checkIsPalindrome(String cadena) {
		if (cadena == null) {
			return false;
		}
		String cadena2 = StringUtils.stripAccents(cadena).toLowerCase();
		cadena2 = cadena2.replaceAll(" ", "");
		cadena2 = cadena2.replaceAll("\\.", "");
		cadena2 = cadena2.replaceAll(",", "");
		cadena2 = cadena2.replaceAll("\\?", "");
		cadena2 = cadena2.replaceAll("\\¿", "");
		cadena2 = cadena2.replaceAll(":", "");
		cadena2 = cadena2.replaceAll("·", "");

		int i = 0, j = cadena2.length() - 1;
		while (i < j) {
			if (cadena2.charAt(i) != cadena2.charAt(j)) {
				return false;
			}

			i++;
			j--;
		}

		return true;
	}

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	public static String speakToMe(int n) {
		String[] unidades = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
		String[] decenas = {"Diez", "Veinte", "Treinta", "Cuarenta", "Cincuenta", "Sesenta", "Setenta", "Ochenta", "Noventa"};
		String cero = "Cero";
		String num="";
		num = stringsResults(n, unidades, decenas, cero, num);
		return num;
	}
	
	private static String stringsResults(int n, String[] uns, String[] decs, String cero, String num) {
		if(n == 0) {
			num += cero;
		}else if(n < 10) {
			num += uns[n - 1];
		}else if(n%10 == 0) {
			num += decs[(n/10) -1];
		}else {
			int unit = n%10;
			int ten = n/10;
			num = decs[ten - 1] + " y " + uns[unit - 1];
		}
		return num;
	}

	/*
	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	public static boolean isLeapYear(String fecha) {
		if (fecha == "")	
			return false;
		DateTimeFormatter bisiesto = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		return LocalDate.parse(fecha, bisiesto).isLeapYear();
	}

	/*
	 * este metodo devuelve cierto si la fecha es válida
	 */
	public static boolean isValidDate(String date) {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		dateFormat.setLenient(false);
		try {
			dateFormat.parse(date);
		} catch (ParseException e) {
			return false;
		}
		return true;
	}
	
}

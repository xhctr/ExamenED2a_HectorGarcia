package examen;

/*
 * Clase la cual valida una fecha dada
 * 
 * @author Héctor García
 * @version 1.1
 * 
 * */

public class Fecha {
	/* @param fechavalida variable de tipo booleano*/
	public static boolean fechaValida;

	/*
	 * metodo por el cual se valida una fecha
	 * @param anio es el año
	 * @param mes es el mes
	 * @param dia es el dia
	 * */
	public static boolean validarFecha(int anio, int mes, int dia) {
		/*inicializacion de la vaiable fechaValida a false */
		fechaValida = false;
		/*
		 * condicion la cual obliga a la fecha a ser mayor extricto que 0*/
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			/*
			 * condicion la cual obliga al mes a ser menor o igual a 12 y al dia menor o igual a 31*/
			if ((mes <= 12) && (dia <= 31)) {
				/*condicion la cual si el mes es igual a 2,el dia de la fecha debe de ser menor o igual a 28 (febrero)*/
				if (mes == 2) {
					fechaValida = dia <= 28;
					/*condicion la cual si el mes es par,el dia debera estar comprendidio entre 1 y 30*/
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
					/*condicion la cual si el mes es impar,el dia debera estar comprendidio entre 1 y 31*/
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		/*devuelve la fechaValida*/
		return fechaValida;
	}
}
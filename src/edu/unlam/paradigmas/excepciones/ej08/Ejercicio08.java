package edu.unlam.paradigmas.excepciones.ej08;

public class Ejercicio08 {

	public Ejercicio08() { }
	
	public static double Cociente(int a, int b) {
		assert b != 0 : "Error! no se puede dividir por cero";
		
		return a/b;
	}

}

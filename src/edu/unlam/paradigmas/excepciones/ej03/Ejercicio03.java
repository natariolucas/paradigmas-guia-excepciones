package edu.unlam.paradigmas.excepciones.ej03;

public class Ejercicio03 {

	public Ejercicio03() { }
	
	public static double Cociente(int a, int b) {
		if (b == 0) {
			throw new DivisionPorCeroException();
		}
		
		return a/b;
	}

}

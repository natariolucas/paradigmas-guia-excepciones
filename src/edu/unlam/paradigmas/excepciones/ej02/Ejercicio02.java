package edu.unlam.paradigmas.excepciones.ej02;

public class Ejercicio02 {

	public Ejercicio02() {
		
	}
	
	public static double RaizCuadrada(double x) throws RaizCuadradaNegativaException {
		if (x<0) {
			 throw new RaizCuadradaNegativaException();
		}
		
		return Math.sqrt(x);
	}

}

package edu.unlam.paradigmas.excepciones.ej01;

public class Ejercicio01 {

	public Ejercicio01() {

	};

	public static double Dividir(int dividendo, int divisor) throws ArithmeticException
	{
		if (divisor == 0) {
			throw new ArithmeticException();
		}
		
		double resultado = dividendo / divisor;
		return resultado;

	};

}

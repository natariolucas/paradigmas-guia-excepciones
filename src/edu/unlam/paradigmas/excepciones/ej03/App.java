package edu.unlam.paradigmas.excepciones.ej03;

public class App {

	public static void main(String[] args) {
		try {
			double resultado = Ejercicio03.Cociente(3, 0);
			System.out.println(resultado);
		} catch (DivisionPorCeroException e) {
			System.out.println(e.getMessage());
		}
		
	}
}

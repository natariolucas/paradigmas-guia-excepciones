package edu.unlam.paradigmas.excepciones.ej02;

public class App {

	public static void main(String[] args) {
		try {
			double resultado = Ejercicio02.RaizCuadrada(-2);
			System.out.println(resultado);
		} catch (RaizCuadradaNegativaException e) {
			System.out.println(e.getMessage());
		}
	}
}

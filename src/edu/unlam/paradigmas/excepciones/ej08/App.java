package edu.unlam.paradigmas.excepciones.ej08;

public class App {

	public static void main(String[] args) {
		try {
			double resultado = Ejercicio08.Cociente(3, 0);
			System.out.println(resultado);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}

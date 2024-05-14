package edu.unlam.paradigmas.excepciones.ej02;

public class RaizCuadradaNegativaException extends Exception {

	
	private static final long serialVersionUID = 1L; //TODO: autogenerado, preguntar

	public RaizCuadradaNegativaException() {	}

	@Override
	public String getMessage() {
		return "No puede dividir raiz cuadrada de un negativo";
	}
}

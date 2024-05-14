package edu.unlam.paradigmas.excepciones.ej03;

public class DivisionPorCeroException extends RuntimeException {

	public DivisionPorCeroException() {
		
	}
	
	public String getMessage() {
		return "Error, no se puede dividir por cero";
	}

}

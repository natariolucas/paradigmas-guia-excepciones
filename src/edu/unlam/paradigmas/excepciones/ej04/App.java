package edu.unlam.paradigmas.excepciones.ej04;

public class App {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		try {
			cuenta.Depositar(200);
			cuenta.Extraer(300);
		} catch (MontoInvalidoException | SaldoInsuficienteException e) {
			e.printStackTrace();
		}
	}

}

package edu.unlam.paradigmas.excepciones.ej05;

public class App {

	public static void main(String[] args) {
		Cuenta cuenta;
		try {
			cuenta = new Cuenta(-10);

			cuenta.Depositar(200);
			cuenta.Extraer(300);
		} catch (MontoInvalidoException | SaldoInsuficienteException e) {
			e.printStackTrace();
		}
	}

}

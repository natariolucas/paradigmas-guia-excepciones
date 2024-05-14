package edu.unlam.paradigmas.excepciones.ej04;

public class Cuenta {

	private double saldo = 0;
	public Cuenta() {}
	
	public void Depositar(double monto) {
		this.saldo += monto;
	}
	
	public void Extraer(double monto) throws SaldoInsuficienteException {
		if (!this.saldoSuficiente(monto)) {
			throw new SaldoInsuficienteException();
		}
		
		this.saldo -= monto;
	}
	
	private boolean saldoSuficiente(double monto) {
		return monto <= this.saldo;
	}

}

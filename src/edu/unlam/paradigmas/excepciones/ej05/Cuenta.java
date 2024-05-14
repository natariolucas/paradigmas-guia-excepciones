package edu.unlam.paradigmas.excepciones.ej05;

public class Cuenta {

	private double saldo = 0;
	public Cuenta() {}
	public Cuenta(double saldoInicial) throws MontoInvalidoException {
		if (saldoInicial <= 0) {
			throw new MontoInvalidoException();
		}
		
		this.saldo = saldoInicial;
	}
	
	public void Depositar(double monto) throws MontoInvalidoException {
		if (monto <= 0) {
			throw new MontoInvalidoException();
		}
		
		this.saldo += monto;
	}
	
	public void Extraer(double monto) throws MontoInvalidoException, SaldoInsuficienteException {
		if (monto <= 0) {
			throw new MontoInvalidoException();
		}
		
		if (!this.saldoSuficiente(monto)) {
			throw new SaldoInsuficienteException();
		}
		
		this.saldo -= monto;
	}
	
	private boolean saldoSuficiente(double monto) {
		return monto <= this.saldo;
	}

}

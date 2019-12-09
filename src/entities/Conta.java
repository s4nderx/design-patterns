package entities;

import java.util.Calendar;

public class Conta {

	private String titular;
	private double saldo;
	private Calendar dataDeAbertura;

	public Conta(String titular, double saldo, Calendar dataDeAbertura) {
		this.titular = titular;
		this.saldo = saldo;
		this.dataDeAbertura = dataDeAbertura;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Calendar getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void setDataDeAbertura(Calendar dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}
	

}

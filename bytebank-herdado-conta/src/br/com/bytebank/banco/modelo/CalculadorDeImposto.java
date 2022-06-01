package br.com.bytebank.banco.modelo;

public class CalculadorDeImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return this.totalImposto;
	}
}

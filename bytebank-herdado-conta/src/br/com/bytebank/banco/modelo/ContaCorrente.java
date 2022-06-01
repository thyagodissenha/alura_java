package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor)  throws SaldoInsuficienteException{
		double valorAsacar = valor + 0.2;
		super.saca(valorAsacar);
	}
	@Override
	public void deposita(double valor) {
		super.saldo += valor;		
	}

	@Override
	public double getImposto() {
		return super.saldo * 0.01;
	}
}
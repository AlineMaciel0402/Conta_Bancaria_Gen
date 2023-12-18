package conta.model;

import java.util.Scanner;

public class ContaPoupança extends Conta{
	
	private float valor;

	public ContaPoupança(int numero, int agencia, int tipo, String titular, float saldo, float valor) {
		super(numero, agencia, tipo, titular, saldo);
		this.valor = valor;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	@Override
	public void visualizarInformaçõesDaConta(Scanner leia) {
		super.visualizarInformaçõesDaConta(leia);
		System.out.println("Aniversário: " + this.valor);
		System.out.println("*************************************************");
	}
}



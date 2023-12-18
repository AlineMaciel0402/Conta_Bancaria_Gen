package conta.model;

import java.util.Scanner;

public class ContaCorrente extends Conta{
	
	private float limite;
	
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo) {
		super(numero, agencia, tipo, titular, saldo);
		// TODO Auto-generated constructor stub
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public boolean sacar(float valor) {
		
		if(valor > getSaldo() + getLimite()) {
			System.out.println("Seu saldo é insuficiente!");
			return false;
		}
		
		setSaldo(getSaldo() - valor);
		return true;
	}
	@Override
	public void visualizarInformaçõesDaConta(Scanner leia) {
		super.visualizarInformaçõesDaConta(leia); 
		System.out.println("Limite: " + this.limite);
		System.out.println("*************************************************");

	}	
}

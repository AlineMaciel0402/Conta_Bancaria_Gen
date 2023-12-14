package conta;

import java.util.Scanner;
import conta.model.Conta;
import conta.util.Cores;


public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c1 = new Conta(1, 123, 1, "Adriana", 10000.0f);
		c1.visualizar();
		c1.sacar(12000.0f);
		c1.visualizar();
		c1.depositar(5000.0f);
		c1.visualizar();

		Scanner leia = new Scanner(System.in);
		

	}
}



package clearminds.test;

import clearminds.cuentas.Cuentas;

public class TestCuentas {

	public static void main(String[] args) {

		Cuentas cuenta1 = new Cuentas("03476", null);
		cuenta1.setSaldo(675);
		cuenta1.setSaldo(444);

		Cuentas cuenta2 = new Cuentas("03476", "C", 98);
		cuenta2.setTipo("D");
		Cuentas cuenta3 = new Cuentas("03476", null);

		cuenta3.setSaldo(567);
		cuenta3.setTipo("C");

		Cuentas cuenta4 = new Cuentas("0987", "A", 10);
		Cuentas cuenta5 = new Cuentas("0557", "C", 10);
		Cuentas cuenta6 = new Cuentas("0666", "A", 0);

		cuenta6.setTipo("B");

		System.out.println("-----VALORES INCIALES-------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();

		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();

		System.out.println("-----------Valores modificados------------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		cuenta6.imprimirConMiEstilo();

	}

}

package clearminds.cuentas;

public class Cuentas {
	public String getId() {
		return id;
	}

	public Cuentas(String id, String tipo) {
		this.id = id;
		this.tipo = "C";
	}

	public Cuentas(String id, String tipo, double saldo) {
		this.id = id;
		this.tipo = "C";
		this.saldo = saldo;
	}

	public void imprimir() {
		System.out.println("***************");
		System.out.println("CUENTA");
		System.out.println("****************");
		System.out.println("NUMERO DE CUENTA " + getId());
		System.out.println("Tipo : " + getTipo());
		System.out.println("Saldo :" + getSaldo());
		System.out.println("");
	}

	public void imprimirConMiEstilo() {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("BIENVENIDO A SU CUENTA");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("NUMERO DE CUENTA " + getId());
		System.out.println("Tipo : " + getTipo());
		System.out.println("Saldo :" + getSaldo());
		System.out.println("");
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	private String id;
	private String tipo = "A";
	private double saldo = 0.0;
}

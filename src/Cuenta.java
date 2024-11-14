
public class Cuenta {

	private String saldo;
	private String numCuenta;

	public Cuenta(String saldo, String numCuenta) {
		this.saldo = saldo;
		this.numCuenta = numCuenta;
	}

	public String getSaldo() {
		return saldo;
	}

	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

}

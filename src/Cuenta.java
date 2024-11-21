import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Cuenta {

	private String numCuenta;
	private int saldo;
	private LinkedList<Operacion>operaciones;
	
	public LinkedList<Operacion> getOperaciones() {
		return operaciones;
	}
	

	public Cuenta(String numCuenta, int saldo, LinkedList<Operacion> operaciones) {
		super();
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.operaciones = operaciones;
	}


	public void setOperaciones(LinkedList<Operacion> operaciones) {
		this.operaciones = operaciones;
	}

	public Cuenta(String numCuenta, int saldo) {
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.operaciones=new LinkedList<>();
		
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	
	public static String validarNumCuenta(String texto) {
		String numCuenta;
		do {

			numCuenta = JOptionPane.showInputDialog(texto);

		} while (numCuenta.equals(""));
		return numCuenta;
	}
	
	public void depositar(int importe) {
		this.saldo+=importe;
		
	}
	
	public void retirar(int importe) {
		this.saldo=saldo-importe;
		
	}
	
}

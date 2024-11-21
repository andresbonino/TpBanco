import javax.swing.JOptionPane;

public class Cliente {

	private String nombre;
	private String dni;
	private Cuenta cuenta;
	
	public Cliente(String nombre, String dni, Cuenta cuenta) {
		this.nombre = nombre;
		this.dni = dni;
		this.cuenta = cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	public static String validarNombre(String texto) {
		String nombre;
		do {

			nombre = JOptionPane.showInputDialog(texto);

		} while (nombre.equals(""));
		return nombre;
	}
	
	
}

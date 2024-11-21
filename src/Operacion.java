import javax.swing.JOptionPane;

public class Operacion {

	private int importe;
	private TipoOperacion tipo;
	
	public Operacion(int importe, TipoOperacion tipo) {
		this.importe = importe;
		this.tipo = tipo;
	}

	public int getImporte() {
		return importe;
	}

	public void setImporte(int importe) {
		this.importe = importe;
	}

	public TipoOperacion getTipo() {
		return tipo;
	}

	public void setTipo(TipoOperacion tipo) {
		this.tipo = tipo;
	}
	
	public static String validarTextoVacio(String texto) {
		String nombre;
		do {

			nombre = JOptionPane.showInputDialog(texto);

		} while (nombre.equals(""));
		return nombre;
	}
	
}

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		int opcion;

		String[] options = new String[] { "Deposito", "Retiro", "Transferencia", "Salir" };

		CajaAhorro cuenta = new CajaAhorro("12342", 0);

		String numCuenta;
		String nombre;

		nombre = Cliente.validarNombre("Ingrese nombre");
		numCuenta = Cuenta.validarNumCuenta("Ingrese numero de cuenta");

		if (nombre.isBlank() && numCuenta.isBlank()) {

			JOptionPane.showMessageDialog(null, "No se registro cuenta, faltan datos obligatorios");

		} else {

			cuenta.setNumCuenta(numCuenta);

		}

		do {

			opcion = JOptionPane.showOptionDialog(null, "Seleccione una opcion ", "", JOptionPane.DEFAULT_OPTION,
					JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

			switch (opcion) {

			case 0:

				int importe = Integer.parseInt(Operacion.validarTextoVacio("Ingrese importe"));
				TipoOperacion tipo = TipoOperacion.DEPOSITO;

				Operacion operacion = new Operacion(importe, tipo);

				cuenta.getOperaciones().add(operacion);
				cuenta.depositar(importe);

				break;

			case 1:

				importe = Integer.parseInt(Operacion.validarTextoVacio("Ingrese importe"));
				tipo = TipoOperacion.RETIRO;

				operacion = new Operacion(importe, tipo);

				if (cuenta.getSaldo() <= importe) {
					JOptionPane.showMessageDialog(null, "No hay suficiente saldo en la cuenta");
				} else {
					cuenta.getOperaciones().add(operacion);
					cuenta.retirar(importe);
				}

				break;

			case 2:

				importe = Integer.parseInt(Operacion.validarTextoVacio("Ingrese importe"));
				tipo = TipoOperacion.TRANSFERENCIA;

				operacion = new Operacion(importe, tipo);

				cuenta.getOperaciones().add(operacion);
				break;

			}

		} while (opcion != 3);

	}

}

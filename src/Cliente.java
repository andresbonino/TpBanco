import javax.swing.JOptionPane;

public class Cliente {

     private String nombre;
     private String dni;
     
	public Cliente(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
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
	 
     public boolean buscarCliente(String nombre) {
    	 
    	 if (nombre!=null) {
			JOptionPane.showMessageDialog(null, "El cliente"+ nombre + "se encontró");
		} else {
            JOptionPane.showMessageDialog(null, "El cliente no se encontro");
            return true;
		}
    	 
    	 return false;
    	 
     }
	
}

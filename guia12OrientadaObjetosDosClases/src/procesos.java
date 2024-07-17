import javax.swing.JOptionPane;

public class procesos {
	
	
	private double ladoA;
	private double ladoB;

	public void ingresarDatos() {
		String cadena;
		
		cadena 	=JOptionPane.showInputDialog(null, "ingrese la longitud de el lado A: " );
		ladoA= Double.parseDouble(cadena);
		
		cadena =JOptionPane.showInputDialog(null, "ingrese la longitud de el lado B: " );
		ladoB= Double.parseDouble(cadena);
	}

	public void calcularArea() {
		double resultado;
		
		resultado=ladoA*ladoB;
		
		JOptionPane.showInternalMessageDialog(null, "El resultado es: " + resultado);
		
	}

	
	
}

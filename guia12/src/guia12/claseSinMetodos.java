package guia12;

import javax.swing.JOptionPane;

public class claseSinMetodos {

	public static void main (String[]args) {
		
		
		String cadena;
		double ladoA;
		double ladoB;
		double resultado;
		
		cadena=JOptionPane.showInputDialog(null,"ingrese la longitud de el  lado A");
		ladoA=Double.parseDouble(cadena);
		
		cadena=JOptionPane.showInputDialog(null,"Ingrese la longitud de el lado B ");
		ladoB=Double.parseDouble(cadena);
	
		resultado=ladoA*ladoB;
		JOptionPane.showInternalMessageDialog(null,"El resultado es: " + resultado);
	}
	
}

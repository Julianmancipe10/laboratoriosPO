package guia12UnaCLaseYMetodos;

import javax.swing.JOptionPane;

public class UnaClaseYMetodos {

	public static void main(String args[]) {
		
		double ladoA;
		double ladoB;

		ladoA= ingresarDatos("Ingrese la longitud de el lado A: " );
		ladoB= ingresarDatos("Ingrese la longitud de el lado B: " );
	
		calcularArea(ladoA,ladoB);
	}
		public static double ingresarDatos (String mensaje) 
		
		{
		String cadena;
		double valor;
		
		cadena = JOptionPane.showInputDialog(null, mensaje);
		valor=Double.parseDouble(cadena);
		
		return valor;
		}
		
		private static void calcularArea(double a, double b) 
		{
		 double resultado;
		 
		 resultado= a * b ;
		 
		 JOptionPane.showInternalMessageDialog(null, "El resultado es" + resultado);
		}
	
	
}

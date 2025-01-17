	package guia13;
	
	import javax.swing.JOptionPane;
	
	public class Principal {
	
	    Flecha flecha1, flecha2, flecha3;
	
	    public static void main(String[] args) {
	        Principal miPrincipal = new Principal();
	    }
	
	
	    public Principal() {
	        // Flecha 1: longitud por defecto
	        flecha1 = new Flecha();
	        flecha1.construirFlecha();
	        flecha1.imprimirEspacio();
	
	        // Flecha 2: longitud definida por el usuario
	        flecha2 = new Flecha();
	        // Solicitar longitud al usuario con JOptionPane
	        String longitudFlecha2 = JOptionPane.showInputDialog("Ingrese la longitud de la flecha 2:");
	        // Convertir la entrada de longitud a entero
	        int longitud2 = Integer.parseInt(longitudFlecha2);
	        flecha2.setLongitud(longitud2);
	        // Usar switch-case para elegir el color
	        String color2 = elegirColorSwitchCase();
	        flecha2.setColor(color2);
	        flecha2.construirFlecha();
	        flecha2.imprimirEspacio();
	
	        // Flecha 3: longitud y color definidos por el usuario
	        // Solicitar longitud al usuario con JOptionPane
	        String longitudFlecha3 = JOptionPane.showInputDialog("Ingrese la longitud de la flecha 3:");
	        // Convertir la entrada de longitud a entero
	        int longitud3 = Integer.parseInt(longitudFlecha3);
	        // Usar switch-case para elegir el color
	        String color3 = elegirColorSwitchCase();
	        flecha3 = new Flecha(longitud3, color3);
	        flecha3.construirFlecha();
	        flecha3.imprimirEspacio();
	    }
	
	    // Método para mostrar un menú y elegir el color usando switch-case
	    private String elegirColorSwitchCase() {
	        String colorElegido="";
	        boolean seleccionado = false;
	        while (!seleccionado) {
	            // Mostrar menú de opciones
	            String opcion = JOptionPane.showInputDialog(
	                "Seleccione el color de la flecha:\n" +
	                "1. Negro\n" +
	                "2. Rojo"
	            );
	
	            // Evaluar la opción seleccionada
	            switch (opcion) {
	                case "1":
	                    colorElegido = "negro";
	                    seleccionado = true;
	                    break;
	                case "2":
	                    colorElegido = "rojo";
	                    seleccionado = true;
	                    break;
	                default:
	                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo.");
	                    break;
	            }
	        }
	        return colorElegido;
	    }
	}
package guia13;

public class Flecha {

    private int longitud;
    private String color;

 // Constructor por defecto establece longitud a 18 y color a negro
    public Flecha() {
        this.longitud = 18;
        this.color = "negro";
    }
 
 // Constructor que acepta longitud y color
    public Flecha(int longitud, String color) {
        this.longitud = longitud;
        this.color = color;
    }
    
 // agragacion del Getter para longitud

    public int getLongitud() {
        return longitud;
    }
//agg Setter para longitud
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
//agg Getter para color
    public String getColor() {
        return color;
    }
// agg Setter para color
    public void setColor(String color) {
        this.color = color;
    }

    public void imprimirEspacio() {
        System.out.println();
    }

	public void construirFlecha() {
		for(int i=0;i<=longitud;i++) {
			imprime("-");
		}
		imprime(">");
	}

    private void imprime(String simbolo) {
        if (color.equalsIgnoreCase("negro")) {
            System.out.print(simbolo);
        } else {
            System.err.print(simbolo);
        }
    }
}



/*
Los atributos longitud y color 
Se han añadido métodos getter (getLongitud, getColor) y setter (setLongitud, setColor)
para acceder y modificar estos atributos.

proporcionando métodos públicos (getters y setters) 
para interactuar con ellos.

*/
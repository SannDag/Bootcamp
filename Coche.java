// - Crear una clase coche.
public class Coche {

// - Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
	static int puertas = 4;
	
// Una función que incremente el número de puertas que tiene el coche.
	public static int incrementoPuerta () {
		int puerta = puertas++;
		return puerta;
		
	}
	
	public int getPuertas(int puertas) {
		return puertas;
	}
	
	public static void main(String[] args) {		
				
// - Crear un objeto miCoche en el main y añadirle una puerta.		
		Coche miCoche = new Coche();
		miCoche.incrementoPuerta();

// - Mostrar el número de puertas que tiene el objeto.	
		
		System.out.println(miCoche.getPuertas(puertas));		

	}

}
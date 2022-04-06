// Crear clase Persona.

public class Persona {
    
    // Crear variables las privadas edad, nombre y telefono de la clase Persona.
    private int edad;
    private String nombre;
    private int telefono;    

    // Crear gets y sets de cada propiedad.

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public static void main (String [] args) {
    
    // Crear un objeto persona en el main.

    Persona persona = new Persona();

    // Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, 
    // por último muéstralas por consola.

    persona.setEdad(21);
    persona.setNombre("Gaston");
    persona.setTelefono(1169858941);

    System.out.println(persona.getEdad());
    System.out.println(persona.getNombre());
    System.out.println(persona.getTelefono());


    }


    
}

public class Clase9 {

    public static void main (String [] args) {
    	
    	
        Cliente cliente = new Cliente();
        cliente.setNombre("Ricardo");
        cliente.setEdad(25);
        cliente.setTelefono(1169457778);
        cliente.setCredito(625);
        
        System.out.println("El nombre del cliente es: " + cliente.getNombre());
        System.out.println("La edad del cliente es: " + cliente.getEdad() + " años");
        System.out.println("El telefono del cliente es: " + cliente.getTelefono());
        System.out.println("El credito del cliente es: " + cliente.getCredito());
        
        
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Lorena");
        trabajador.setEdad(29);
        trabajador.setTelefono(1148858263);
        trabajador.setSalario(89000);

        System.out.println("El nombre del trabajador es: " + trabajador.getNombre());
        System.out.println("La edad del trabajador es: " + trabajador.getEdad() + " años");
        System.out.println("El telefono del trabajador es: " + trabajador.getTelefono());
        System.out.println("El sueldo del trabajador es: " + trabajador.getSalario());


    }

    // Crea una clase Persona con las siguientes variables: La edad, el nombre y el teléfono
    public static class Persona{      

        String nombre;
        int edad;       
        int telefono;

        public String getNombre(){
            return nombre;
        }

        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public int getEdad(){
            return edad;
        }

        public void setEdad(int edad){
            this.edad = edad;
        }

        public int getTelefono(){
            return telefono;
        }

        public void setTelefono(int telefono){
            this.telefono = telefono;
        }
    }

    // Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, 
    // esta nueva clase tendrá la variable credito solo para esa clase.
     public static class Cliente extends Persona{
        int credito;
        
        public int getCredito() {
        	return credito;
        }
        
        public void setCredito(int credito) {
        	this.credito = credito;
        }
        
    }

   //Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono,
   // el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

   // Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
   //  y con una variable salario que solo tenga la clase Trabajador.
    public static class Trabajador extends Persona{
        double salario;

        public void setSalario(double salario){
            this.salario = salario;
        }

        public double getSalario() {
            return salario;
        }
        
    }
    
}
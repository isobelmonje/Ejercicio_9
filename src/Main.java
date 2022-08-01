public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setEdad(30);
        cliente1.setNombre("Jai");
        cliente1.setTelefono("656-898-465");
        cliente1.setCredito(500);
        System.out.println(cliente1.getEdad());
        System.out.println(cliente1.getNombre());
        System.out.println(cliente1.getTelefono());
        System.out.println(cliente1.getCredito());

        Trabajador trabajador1 = new Trabajador();
        trabajador1.setEdad(33);
        trabajador1.setNombre("Fernando");
        trabajador1.setTelefono("656-898-470");
        trabajador1.setSalario(1000);
        System.out.println(trabajador1.getEdad());
        System.out.println(trabajador1.getNombre());
        System.out.println(trabajador1.getTelefono());
        System.out.println(trabajador1.getSalario());
    }
}
class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int i) {
        this.edad = i;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String persona) {
        this.nombre = persona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return telefono;
    }
}

class Cliente extends Persona{
    private int credito;

    public void setCredito(int i) {
        this.credito = i;
    }

    public int getCredito() {
        return this.credito;
    }
}

class Trabajador extends Persona {
    private int salario;

    public void setSalario(int i) {
        this.salario = i;
    }

    public int getSalario() {
        return this.salario;
    }
}
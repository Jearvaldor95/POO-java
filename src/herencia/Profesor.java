package herencia;

import encapsulamiento.Persona;

public class Profesor extends Persona {

    private Double sueldo;
    public Profesor(String nombre, String apellidos, int edad, Double sueldo) {
        super(nombre, apellidos, edad);
        this.sueldo = sueldo;
    }

    @Override
    public void deber() {
        super.deber();

        System.out.println("Impartir clases");
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}

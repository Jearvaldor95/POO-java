package herencia;

import encapsulamiento.Persona;

public class Estudiante extends Persona {
    public Estudiante(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
    }

    @Override
    public void deber() {
        super.deber();

        System.out.println("Recibir clases");
    }
}

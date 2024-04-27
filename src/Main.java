import abstraccion.Gato;
import abstraccion.Perro;
import encapsulamiento.Persona;
import herencia.Estudiante;
import herencia.Profesor;
import polimorfismo.Multiplicar;
import polimorfismo.Sumar;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

       /* Estudiante estudiante = new Estudiante("Jesus", "Valeta", 26);
        System.out.println(estudiante.getNombre()+" "+estudiante.getEdad());
        estudiante.deber();

        Profesor profesor = new Profesor("Juan", "Lopez", 45, 200000.0);

        System.out.println(profesor.getNombre()+" "+profesor.getSueldo());
        profesor.deber();*/

       /* Perro perro = new Perro();
        perro.emitirSonido();
        perro.comer();

        Gato gato = new Gato();
        gato.emitirSonido();
        gato.comer();*/

        Sumar sumar = new Sumar();
        sumar.cacular(12,34);

        Multiplicar multiplicar = new Multiplicar();
        multiplicar.cacular(23,10);


    }
}
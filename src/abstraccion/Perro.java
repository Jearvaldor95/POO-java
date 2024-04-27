package abstraccion;

public class Perro extends Animal{
    @Override
    public void emitirSonido() {
        System.out.println("Ladrar");
    }

    @Override
    public void comer() {
        super.comer();
    }
}

package abstraccion;

public class Gato extends  Animal{
    @Override
    public void emitirSonido() {
        System.out.println("Maullar");
    }

    @Override
    public void comer() {
        super.comer();
    }
}

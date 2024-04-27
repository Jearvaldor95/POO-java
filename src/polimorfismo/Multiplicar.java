package polimorfismo;

public class Multiplicar extends Aritmetica{

    @Override
    public int cacular(int num1, int num2) {
        int multiplicar = num1 * num2;
        System.out.println(multiplicar);
        return super.cacular(num1, num2);
    }
}

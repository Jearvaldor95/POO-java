package polimorfismo;

public class Sumar extends Aritmetica{

    @Override
    public int cacular(int num1, int num2) {
        int sumar = num1 + num2;
        System.out.println(sumar);
        return super.cacular(num1, num2);

    }
}

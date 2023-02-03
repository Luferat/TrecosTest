package trecos.trecostest;

import trecos.calculator.Calculator;

public class TrecosTest {

    public static void main(String[] args) {

        // Instância do objeto
        Calculator calc1 = new Calculator(1, 1);
        System.out.println(calc1.getResult());

        Calculator calc2 = new Calculator(3, 2);
        System.out.println(calc2.getResult());

        Calculator calc3 = new Calculator(-1, 3);
        System.out.println(calc3.getResult());

    }
}

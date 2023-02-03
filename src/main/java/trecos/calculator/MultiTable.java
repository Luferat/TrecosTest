package trecos.calculator;

public class MultiTable {

    private int num;

    public MultiTable(int n) {
        if (n < 0 || n > 9) {
            System.err.println("Erro! insira um número entre 0 e 9.");
            System.exit(0);
        }
        num = n;
    }

    public void showTable() {
        System.out.println("-----");
        for (int x = 0; x < 11; x++) {
            System.out.println(num + " x " + x + " = " + (num * x));
        }
        System.out.println("-----");
    }

}

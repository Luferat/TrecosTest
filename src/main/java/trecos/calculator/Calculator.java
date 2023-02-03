package trecos.calculator;

public final class Calculator {

    private int num1;
    private int num2;
    private int result;

    public Calculator(int n1, int n2) {
        setNum1(n1);
        setNum2(n2);
    }

    /**
     * @return the num1
     */
    public int getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    /**
     * @return the num2
     */
    public int getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    /**
     * @return the result
     */
    public int getResult() {
        result = num1 + num2;
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(int result) {
        this.result = result;
    }

}

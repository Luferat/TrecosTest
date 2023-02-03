package trecos.trecostest;

import trecos.calculator.Calculator;
import trecos.calculator.MultiTable;
import trecos.tools.Validator;

public class TrecosTest {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println(calc.sum(5, 2));	// Exibe → 7
        System.out.println(calc.sub(9, 3));	// Exibe → 6		
        System.out.println(calc.mul(3, 3));	// Exibe → 9
        System.out.println(calc.div(4, 2));	// Exibe → 2
        System.out.println(calc.mod(4, 3));	// Exibe → 1

        System.out.println("--------------------------");

        MultiTable multiTable = new MultiTable(5);
        multiTable.showTable();

        MultiTable multiTable2 = new MultiTable(0);
        multiTable2.showTable();

        Validator validate = new Validator();
        System.out.println(validate.isMail("joca@silva.com"));	// Exibe → true
        System.out.println(validate.isMail("teste@"));		// Exibe → false

    }
}

package trecos.trecostest;

import trecos.calculator.Calculator;
import trecos.calculator.MultiTable;
import trecos.jdbc.Documents;
import trecos.tools.DateToFormat;
import trecos.tools.Validator;

public class TrecosTest {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println(calc.sum(5, 2));	// Exibe → 7
        System.out.println(calc.sub(9, 3));	// Exibe → 6		
        System.out.println(calc.mul(3, 3));	// Exibe → 9
        System.out.println(calc.div(0, 0));	// Exibe → 2
        System.out.println(calc.mod(4, 3));	// Exibe → 1

        System.out.println("--------------------------");

        MultiTable multiTable = new MultiTable(5);
        multiTable.showTable();

        System.out.println("--------------------------");

        MultiTable multiTable2 = new MultiTable(0);
        multiTable2.showTable();

        System.out.println("--------------------------");

        Validator validate = new Validator();
        System.out.println("E-mail 'joca@silva.com' é: " + validate.isMail("joca@silva.com"));	// Exibe → true
        System.out.println("E-mail 'teste@' é: " + validate.isMail("teste@"));		// Exibe → false

        System.out.println("--------------------------");

        DateToFormat fDate = new DateToFormat();
        System.out.println(fDate.getBr("2023-02-03"));	// Exibe → 03/02/2023

        System.out.println("--------------------------");

        DateToFormat brDate = new DateToFormat();
        System.out.println(brDate.getSystem("03/02/2023"));     // Exibe → 2023-02-03

        System.out.println("--------------------------");

        Documents listAllDocs = new Documents();
        listAllDocs.showAllDocs();

    }
}

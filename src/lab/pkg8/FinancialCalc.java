package lab.pkg8;

/* *
 * @author Shahab
 */
public class FinancialCalc {

    public static void main(String[] args) {
        double principal = 0.00;
        double interestRate = 0.05;
        int numOfYears = 4;
        double finalValue = 4000;

        principal = computerPrincipal(finalValue,interestRate,numOfYears);

        System.out.println("The amount of money you should invest today "
                + "(at an interest of 5%) to have a total amount of $1000 at the end of 3 years - "+principal);
    }

     public static double computerPrincipal(double finalValue, double interestRate, double numOfYears) {
        return finalValue / Math.pow((1 + interestRate), numOfYears);
    }
    
}

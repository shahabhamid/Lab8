package lab.pkg8;

/* *
 * @author Shahab
 */
public class FinancialCalc {

    public static void main(String[] args) {
        double principal = 500;
        double interestRate = 0.05;
        int numOfYears = 3;
        double finalValue = 525.00;

        interestRate = computeInterestRate(principal,finalValue,numOfYears);

        System.out.println("The interest rate you need to turn an initial investment of $500.00 into $525.00 at the end of 3 years"
                + " is "+interestRate);
    }

    public static double computeFinalValue(double principal, double interestRate, int numOfYears) {
        return principal * Math.pow((1 + interestRate), numOfYears);
    }

    public static double computeInterestRate(double principal, double finalValue, int numOfYears) {
        return Math.pow((finalValue / principal), 1 / numOfYears)-1;

    }

    public static double computerPrincipal(double finalValue, double interestRate, double numOfYears) {
        return finalValue / Math.pow((1 + interestRate), numOfYears);
    }
    
    public static double computerNumOfYears(double principal,double interestRate,double finalValue){
        return Math.log((finalValue/principal)/Math.log(1+interestRate));
        
    } 
}

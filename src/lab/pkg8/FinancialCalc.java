package lab.pkg8;

/* *
 * @author Shahab
 */
public class FinancialCalc {

    public static void main(String[] args) {
        double principal = 100;
        double interestRate = 0.044;
        double numOfYears = 0;
        double finalValue = 150;

        numOfYears = computeNumOfYears(principal,interestRate,finalValue);

        System.out.println("The number of years you need to invest an initial sum of $100.00 at an interest rate of 4.4% to have a final value of $150.00 ="+numOfYears);
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
    
    public static double computeNumOfYears(double principal,double interestRate,double finalValue){
        return Math.log((finalValue/principal)/Math.log(1+interestRate));
        
    } 
}

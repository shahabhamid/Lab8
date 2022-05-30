
package lab.pkg8;

/* *
 * @author HP
 */
public class Lab8 {

    public static void main(String[] args) {
        double principal = 1000.00;
        double interestRate = 0.035;
        int numOfYears = 7;
        
        double finalValue = 0;
        
        finalValue = principal * Math.pow(1+interestRate,numOfYears);
        
        System.out.println("Investing $"+principal+
                " at an interest of "+(interestRate*100)+"%"+
                " for "+numOfYears +" years will have a final"
                        + " worth of $"+finalValue);
    }
    
    
   
}

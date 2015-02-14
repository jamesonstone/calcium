import java.util.Scanner;


public class Exercise2_13 {
	public static void main(String[] args) {
   
   	Scanner input = new Scanner(System.in);
   	double savings;
      double total = 0.0;
      int months;
      int x = 0;
      
   	System.out.println("Please enter the total amount of your savings account");
      savings = input.nextDouble();
      

   	System.out.println("Please enter the number of months you'd like to project");
      months = input.nextInt();
      
      while(x < months) {
      	savings = savings + (savings * .00417);
         x++;
      }
      
   	System.out.println("After " + months + " months your balance will be " + savings);


    }
}
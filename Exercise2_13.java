import java.util.Scanner;


public class Exercise2_13 {
	public static void main(String[] args) {
   
   	Scanner input = new Scanner(System.in);
   	Double saving;
   	Double primary;
   	Double current;
      
   	System.out.println("What is the balance in your current savings?");
      current = input.nextDouble();

   	System.out.println("Enter a amount to deposit into savings account");
      saving = input.nextDouble();
      
   	primary = (saving1 * 0.00417) + saving + current;
   	System.out.println("Your total monthly savings = " + primary);


   	 if (saving > 0.00) {
     			System.out.println("your total monthly saving =" + primary);
       } else {
      		System.out.println("No savings this month?");
       }
    }
}
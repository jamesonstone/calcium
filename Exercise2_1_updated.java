// CPMS 161-03
// Program Assignment 02
// Nathaniel Stone
// W0472662


import java.util.Scanner;

class Exercise2_1 {
	public static void main (String[] args) {
		Double celsius;
		Double fahrenheit;
      String answer;
		Scanner input = new Scanner(System.in);

      //convert temp C to F
		System.out.println("Enter a temperature in Celsius ");
		celsius = input.nextDouble();
		fahrenheit = (celsius * 9.0/5 + 32);
		System.out.println("Temperature in Fahrenheit = " + fahrenheit + "\r\n");

      //ask if the user would like to continue
		System.out.println("Great! Would you like to convert Fahrenheit to Celsius?");
      answer = input.next();
      
      if(answer.equals("yes")) {
         //convert temp: F to C
   		System.out.println("Enter a temperature in Fahrenheit");
   		fahrenheit = input.nextDouble();
   		celsius = ((fahrenheit - 32) * 5/9);
   		System.out.println("Temperature in Celsius = " + celsius + "\r\n");
      } else {
      System.out.println("Thank you and have a really nice day!");
      }
	}
}





	//enter a temperature in celcius
	// convert celsius to fahrenheit
	// display the results
	/* sample run
		Enter a temperature in Celsius: 43
		43.0 Celsius is 109.4 Fahrenheit.
	*/
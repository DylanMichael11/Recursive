package RecursiveProduct;

import java.util.Scanner;

public class Recursive {
   // Recursive method to multiply numbers in the array
   public static double multiplyNumbers(double[] numbers, int index) {
       // Base case: when we reach the end of the array
       if (index == numbers.length) {
           return 1;
       }
       // Recursive case: multiply current number with result of remaining numbers
       return numbers[index] * multiplyNumbers(numbers, index + 1);
   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double[] numbers = new double[5];

       // Get 5 numbers from user
       for (int i = 0; i < 5; i++) {
           while (true) {
               try {
                   System.out.print("Enter number " + (i + 1) + ": ");
                   numbers[i] = scanner.nextDouble();
                   break;
               } catch (Exception e) {
                   System.out.println("Please enter a valid number.");
                   scanner.nextLine(); // Clear the scanner buffer
               }
           }
       }

       // Calculate product using recursion, starting from index 0
       double result = multiplyNumbers(numbers, 0);

       // Display the numbers and their product
       System.out.print("\nThe product of [");
       for (int i = 0; i < numbers.length; i++) {
           System.out.print(numbers[i]);
           if (i < numbers.length - 1) {
               System.out.print(", ");
           }
       }
       System.out.println("] is: " + result);

       scanner.close();
   }
}
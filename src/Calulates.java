import java.util.ArrayList;
import java.util.Scanner;

 class Calculate {
     public void marks() {
         Scanner x = new Scanner(System.in);
         System.out.println("Choice your Operator ");
         System.out.println("1. Addition");
         System.out.println("2. Subtraction");
         System.out.println("3. Multiplication");
         System.out.println("4. Division");
         System.out.print("Enter an option: ");
         String choice = x.nextLine();
         System.out.println("Enter your first number ");
         float firstnumber = x.nextFloat();

         System.out.println("Enter your Second number");
         float secondnumber = x.nextFloat();

         float total = 0;

         switch (choice) {
             case "1":
                 total = firstnumber + secondnumber;
                 System.out.println("Result: " + total);
                 break;
             case "2":
                 total = firstnumber - secondnumber;
                 System.out.println("Result: " + total);
                 break;
             case "3":
                 total = firstnumber * secondnumber;
                 System.out.println("Result: " + total);
                 break;
             case "4":
                 if (secondnumber != 0) {
                     total = firstnumber / secondnumber;
                     System.out.println("Result: " + total);
                 } else {
                     System.out.println("Error: Division by zero");
                 }
                 break;
             default:
                 System.out.println("Invalid option. Try again.");
                 break;
         }
     }


     //Find Sum and Average of Array Elements
     static int sum = 0;
     static int Average = 1;

     public void findsum() {
         int x[] = {1, 2, 3, 4, 5, 6, 7, 8,};
         for (int i = 0; i < x.length; i += 1) {
             sum = sum + x[i];

             Average = sum / x.length;

         }
         System.out.println("Sum is " + sum);
         System.out.println("Avarage is " + Average);
     }

     //Find Prime Numbers in Java
     public void prime_number() {
         Scanner y = new Scanner(System.in);
         System.out.println("Enter your number");
         int _number = y.nextInt();

         if (_number == 0 || _number == 1) {
             System.out.println("It's the wrong number. Try again.");
         } else {
             int middle_number = _number / 2;
             int i;
             for (i = 2; i <= middle_number; i += 1) {
                 if (_number % i == 0) {
                     System.out.println("Your number is not a prime number.");
                     break;
                 }
             }
             if (i == middle_number + 1) {
                 System.out.println("Your number is a prime number.");
             }
         }
     }

     //Reverse a String in Java
     void Reverse() {

         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter a string: ");
         String originalName = scanner.nextLine();
         String reversedName = "";

         for (int i = originalName.length() - 1; i >= 0; i--) {
             reversedName += originalName.charAt(i);
         }
         System.out.println("Reversed string is " + reversedName);
     }

     void _rev_number() {
         Scanner x = new Scanner(System.in);
         System.out.println("Enter your number");
         int _num = x.nextInt();
         Integer Originalname = _num;
         int i = 0;
     }

     //Reverses a number
     static Scanner x = new Scanner(System.in);

     void intReverise() {

         System.out.println("Enter your number");
         int _Reve_num = x.nextInt();

         int Answer = 0;

         while (_Reve_num > 0) {

             int Lastnum = _Reve_num % 10;

             Answer = Answer * 10 + Lastnum;
             _Reve_num /= 10;

         }
         System.out.println("answer is " + Answer);

     }

 }
























// add - takes two integers, adds them together and prints out the result
// subtract - takes two integers, subtracts the second entered integer from the first and prints out the result
// multiply - takes two doubles, multiplies them together and prints out the result to two decimal places
// divide - takes two doubles, divides the first entered double by the second and prints out the result to two decimal places
// alphabetize - takes two words (without spaces) and tells which word comes before the other lexicographically

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        System.out.println("Please choose an operation from the list below: add, subtract, multiply, divide, alphabetize.");
        Scanner input = new Scanner(System.in);
        String invalidPrompt = "Invalid input entered. Terminating...";

        String operation = input.next();
        double output;
        double num1;
        double num2;
        String str1;
        String str2;
        switch (operation){
            case "add":
                System.out.println("Please enter two integers.");
                if (input.hasNextInt()){
                    num1 = input.nextInt();
                }
                else{
                    System.out.println(invalidPrompt);
                    break;
                }
                if (input.hasNextInt()){
                    num2 = input.nextInt();
                }
                else{
                    System.out.println(invalidPrompt);
                    break;
                }
                output = (int) num1 + (int) num2;
                break;
            case "subtract":
                System.out.println("Please enter two integers.");
                // int num1;
                // int num2;
                if (input.hasNextInt()){
                    num1 = input.nextInt();
                }
                else{
                    System.out.println(invalidPrompt);
                    break;
                }
                if (input.hasNextInt()){
                    num2 = input.nextInt();
                }
                else{
                    System.out.println(invalidPrompt);
                    break;
                }
                output = (int) num1 - (int) num2;
                System.out.printf("Result is %s.\n", output);
                break;
            case "multiply":
                System.out.println("Please enter two doubles.");
                if (input.hasNextDouble()){
                    num1 = input.nextDouble();
                }
                else{
                    System.out.println(invalidPrompt);
                    break;
                }
                if (input.hasNextDouble()){
                    num2 = input.nextDouble();
                }
                else{
                    System.out.println(invalidPrompt);
                    break;
                }
                output = num1 * num2;
                System.out.printf("Result is %s.\n", output);
                break;
            case "divide":
                System.out.println("Please enter two doubles.");
                // double num1;
                // double num2;
                if (input.hasNextDouble()){
                    num1 = input.nextDouble();
                }
                else{
                    System.out.println(invalidPrompt);
                    break;
                }
                if (input.hasNextDouble()){
                    num2 = input.nextDouble();
                    if (num2 == 0){
                        System.out.println(invalidPrompt);
                        break;
                    }
                }
                else{
                    System.out.println(invalidPrompt);
                    break;
                }
                output = num1 / num2;
                System.out.printf("Result is %.2f.\n", output);
                break;
            case "alphabetize":
                System.out.println("Please enter two strings.");
                if (input.hasNext()){
                    str1 = input.next();
                }
                else{
                     System.out.println(invalidPrompt);
                    break;
                }
                if (input.hasNext()){
                    str2 = input.next();
                }
                else{
                     System.out.println(invalidPrompt);
                    break;
                }
                int diff = str1.compareTo(str2);
                if(diff == 0){
                    System.out.printf("%s and %s are alphabetically the same.\n", str1, str2);
                }
                else if (diff > 0){
                    System.out.printf("%s comes before %s alphabetically.\n",str2, str1);
                }
                else{
                    System.out.printf("%s comes before %s alphabetically.\n",str1, str2);
                }
         }
    }
}
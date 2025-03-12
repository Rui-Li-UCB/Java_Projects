import java.util.Scanner;

public class FtoC{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //read method input
        System.out.print("Enter a temperature value in Fahrenheit and a day of the week: ");
        int f = input.nextInt();
        String s = input.nextLine();
        double c = 5.0 / 9 * (f - 32); // (double) 5 / 9 also works -> implicit type promotion to 9
        System.out.printf("Celsius: %.2f\n", c);
        System.out.printf("Day: %s", s.trim());
    }
}
import java.util.Scanner;
/// A weather class that converts Fahrenheit into celcius and checks if user input is valid
/// If the user input is invalid, keep asking for new input

public class WeatherWithMaxTemp{
    public static void main(String[] args){
        final int MAX_TEMP = 140;
        final int MIN_TEMP = -130;

        Scanner input = new Scanner(System.in);
        System.out.print("Please input a temperature in Fahrenheit: ");
        int temp = input.nextInt();
        while (temp > MAX_TEMP | temp < MIN_TEMP){
            System.out.print("Please input a temperature in Fahrenheit: ");
            temp = input.nextInt();
        }
        double celcius = (5.0/9)*(temp - 32);
        System.out.printf("The temperature is: %.1f in Celcius.\n", celcius);
    }
}
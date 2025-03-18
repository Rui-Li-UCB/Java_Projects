import java.util.Scanner;
public class WeatherWithDoWhile{
    public static void main(String[] args){
        final int MAX_TEMP = 140;
        final int MIN_TEMP = -130;
        Scanner input = new Scanner(System.in);
        int temp;
        do {
            System.out.print("Enter today's temperature in Fahrenheit: ");
            temp = input.nextInt();
        } while(
            temp >= MAX_TEMP | temp <= MIN_TEMP
        );

        double celcius = (5.0/9) * (temp-32);
        System.out.printf("Today's temperature is %.1f degrees Celcius.\n", celcius);
    }
}
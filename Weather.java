import java.util.Scanner;
/// Takes in an integer value as temperature and day of the week
/// Evaluate if temperature is in the range(70, 85) if out of this range print stay at home
/// If inside the range ask for input on rain or not if not raining, print pool
public class Weather{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's temperature in Fahrenheit: ");
        int temperature = input.nextInt();
        System.out.print("Enter today's day: ");
        String day = input.next();

        double celcius = (5.0/9) *(temperature - 32);
        System.out.printf("Today is %s, and %.2f Celcius.\n",day, celcius);
        if (temperature >= 70 && temperature <= 85) {
            System.out.print("Is it raining? (y/n)");
            String rain = input.next().toLowerCase();
            if (rain.startsWith("y")) {
                System.out.print("It's raining, stay home.\n");
            }
            else {
                System.out.print("Go to the pool!\n");
            }
        }
        else {
            System.out.print("Weather is terrible, stay home.\n");
        }

        System.out.print("Bye.\n");
    }
}
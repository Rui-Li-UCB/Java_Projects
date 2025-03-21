// Create method other than main
// Overload method
import java.util.Scanner;

public class Methods{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings or two integers.");
        Integer x = null;
        Integer y = null;
        String s1 = null;
        String s2 = null;
        if (input.hasNextInt()){
            x = input.nextInt();
        }else{
            s1 = input.next();
        }
        if (input.hasNextInt()){
            y = input.nextInt();
        }else{
            s2 = input.next();
        }
        if (x != null && y != null){
            System.out.println("Total is " + sum(x, y));
        }
        else if (s1 != null && s2 != null){
            System.out.println("Total is " + sum(s1, s2));
        }
        else{
            System.out.println("Invalid enteries");
        }

    }
    public static int sum(Integer x, Integer y){
        int total = x + y;
        return total;
    }
    public static int sum(String x, String y){
        int total = 0;
        for (char c: x.toCharArray()){
            total += (int) c;
        }
        for (char c: y.toCharArray()){
            total += (int) c;
        }
        return total;
    }
}
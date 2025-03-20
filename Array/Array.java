/// use array from input argument
/// use Double wrapper class
/// use ternary if else
public class Array{
    public static void main(String[] args){
        double total = 0;
        for (String num: args){
            total += Double.parseDouble(num);
        }
        double average = (args.length > 0)? total/args.length : 0;
        System.out.println("Average is:"+average);

        int rows = 3;
        if (args.length > 0) {
            try {
                rows = Integer.parseInt(args[0]);  // Parse argument to int
            } catch (NumberFormatException e) {
                System.out.println("Invalid number provided. Using default value: 3");
            }
        }

        int[][] array2d = (args.length > 0)? make2d(rows) : make2d(3);
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < array2d[i].length; j ++){
                System.out.print(array2d[i][j] + " ");
            }
                System.out.println();
        }

    }

    public static int[][] make2d(int arg){
        int[][] array2d = new int[arg][4];
        int var = 0;
        for (int row = 0; row < arg; row ++){
            for (int col = 0; col < array2d[row].length; col++){
                array2d[row][col] = var;
                var += 1;
            }
        }
        return array2d;
    }
}
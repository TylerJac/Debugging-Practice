import java.util.ArrayList;
import java.util.Arrays;

/**
 * I used the debugger to go through each big point in the code that could break.
 * the for loop, where the numbers combine, at a print statement that's used to print the result before returning it,
 * where the array was written, and calling the method to see what was given into it.
 * The exceptions are located on lines 15 and 18.
 * The error is in line 25, and it subtracts instead of adding.
 */
public class Main {

    public static double average(ArrayList<Integer> numbers) {
        int sum = 0;
        if (numbers == null){
            throw new NullPointerException();
        }
        if (numbers.isEmpty()){
            throw new IndexOutOfBoundsException("can't is empty");
        }
        // I added a break point here
        for (int number : numbers) {
            // The logic error is that it subtracts instead of adding
            // I added a break point here
            sum -= number;
        }
        // added a break point here
        System.err.println(sum/numbers.size());
        return (double) sum / numbers.size();
    }

    public static void main(String[] args) {
        try {
            // Added a break point here
            ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
            // Added a break point here
            double avg = average(numbersList);
            System.out.println("Average: " + avg);
        }
        catch (NullPointerException | IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
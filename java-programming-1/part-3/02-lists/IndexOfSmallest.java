import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            numbers.add(input);
        }
        
        int index = 0, smallest = Integer.MAX_VALUE;
        for (int i=0; i < numbers.size(); i++) {
            if (numbers.get(i) < smallest) {
                index = i;
                smallest = numbers.get(i);
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Found at index: " + index);
        scanner.close();
    }
}

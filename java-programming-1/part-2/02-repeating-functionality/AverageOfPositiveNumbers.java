import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPositive = 0, sumPositive = 0;

        while (true) { 
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            } else if (number < 0) {
                continue;
            }

            countPositive += 1;
            sumPositive += number;
        }
        
        if (sumPositive <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((float)sumPositive / countPositive);
        }

        scanner.close();
    }
}

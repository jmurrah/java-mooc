import java.util.Scanner;

public class DifferentTypesOfInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String myString;
        int myInteger;
        double myDouble;
        boolean myBoolean;

        // Write your program here
        System.out.println("Give a string:");
        myString = scan.nextLine();
        System.out.println("Give an integer:");
        myInteger = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        myDouble = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        myBoolean = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + myString);
        System.out.println("You gave the integer " + myInteger);
        System.out.println("You gave the double " + myDouble);
        System.out.println("You gave the boolean " + myBoolean);

        scan.close();
    }
}

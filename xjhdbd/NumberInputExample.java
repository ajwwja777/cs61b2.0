import java.util.Scanner;

public class NumberInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.println("You entered: " + number);

        scanner.close();
    }
}
/*
import java.util.Scanner;

public class NumberInputExample {
    public NumberInputExample() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int var2 = var1.nextInt();
        System.out.println("You entered: " + var2);
        var1.close();
    }
}

*/
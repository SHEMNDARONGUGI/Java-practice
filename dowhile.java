import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int num1 = scanner.nextInt();
        System.out.println();
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= num1);
    }
}

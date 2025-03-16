import java.util.Scanner;
public class while_loop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int num1 = scanner.nextInt();
        System.out.println();
        int i = 1;
        while(i <= num1){
            System.out.println(i);
            i++;
            scanner.close();
        }

    }
    
}

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        // make a calculator that allows user to input two digit and specify the arithmetic operation to be conducted then it should as the user if they want to continue
        Scanner input = new Scanner(System.in); //create scanner object
        
        System.out.println("Input 2 digits");
        System.out.println("Input first number:");
        int a = input.nextInt(); //read user input
        
        System.out.println("Input second number:");
        int b = input.nextInt();
        
        System.out.println("choose only one arithmetic operation to be done('+', '-', '/', '*','%')");
        char choice = input.nextLine().charAt(0);

        switch (choice) {
            case '+' : System.out.println(a+b);
            break;
            
            case '-' : System.out.println(a-b);
            break;

            case '*' : System.out.println(a*b);
            break;

            case '/' : System.out.println(a/b);
            break;

            case '%' : System.out.println(a%b);
            break;
            
        
            default:
                System.out.println("Wrong input!!!");
        }
        
    }
}

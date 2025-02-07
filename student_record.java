import java.util.Scanner;

public class student_record {
    public static void main(String[] args) 
    {
        System.out.println("Input name: ");
        Scanner object = new Scanner(System.in);
        String name = object.nextLine();

        System.out.println("Input registration number: ");
        String reg = object.nextLine();

        System.out.println("Input age: ");
        int age = object.nextInt();

        System.out.println("Name: "+name +"\nRegistration number: "+ reg +"\nAge: "+ age);
        

    }
}
